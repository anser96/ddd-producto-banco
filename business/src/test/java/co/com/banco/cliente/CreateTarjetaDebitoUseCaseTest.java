package co.com.banco.cliente;

import co.com.banco.command.CreateTarjeraDebito;
import co.com.banco.command.CreateTarjetaCredito;
import co.com.banco.event.TarjetaCreditoCreated;
import co.com.banco.event.TarjetaDebitoCreated;
import co.com.banco.usecase.CreateTarjetaCreditoUseCase;
import co.com.banco.usecase.CreateTarjetaDebitoUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateTarjetaDebitoUseCaseTest {
    private CreateTarjetaDebitoUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateTarjetaDebitoUseCase();
    }

    @Test
    void createTarjetaDebito(){
        //arrange
        var tarjetaDebitoID = new TarjetaDebitoID("101");
        var tarjetaID = new TarjetaID("555");
        var numeroTarjeta = new NumeroTarjeta("992222");
        var fechaVencimiento = new FechaVencimiento("23");
        var cvv = new Cvv("725");
        var nombrePropietario = new NombrePropietario("Jhon Due");
        var saldo = new Saldo("10000");
        var franquicia = new Franquicia("MasterCard");

        var command = new CreateTarjeraDebito(tarjetaID, tarjetaDebitoID,numeroTarjeta,fechaVencimiento,cvv,
                saldo,nombrePropietario,franquicia);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var tarjetaDebitoCreada = (TarjetaDebitoCreated)event.get(0);
        Assertions.assertEquals("555",tarjetaDebitoCreada.aggregateRootId());
        Assertions.assertEquals("992222", tarjetaDebitoCreada.getNumeroTarjeta().value());
    }
}
