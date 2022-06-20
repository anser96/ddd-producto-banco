package co.com.banco.cliente;

import co.com.banco.command.CreateTarjetaCredito;
import co.com.banco.command.CreateTarjetaEPrepago;
import co.com.banco.event.TarjetaCreditoCreated;
import co.com.banco.event.TarjetaEPrepagoCreated;
import co.com.banco.usecase.CreateTarjetaCreditoUseCase;
import co.com.banco.usecase.CreateTarjetaEPrepagoUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateTarjetaEPrepagoUseCaseTest {
    private CreateTarjetaEPrepagoUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateTarjetaEPrepagoUseCase();
    }

    @Test
    void createTarjetaEPrepago(){
        //arrange
        var tarjetaEPrepagoID = new TarjetaEPrepagoID("10");
        var tarjetaID = new TarjetaID("52");
        var numeroTarjeta = new NumeroTarjeta("222222");
        var fechaVencimiento = new FechaVencimiento("0");
        var cvv = new Cvv("025");
        var nombrePropietario = new NombrePropietario("Jhon Due");
        var saldoRecargado = new SaldoRecargado("1000");
        var franquicia = new Franquicia("Visa");

        var command = new CreateTarjetaEPrepago(tarjetaID, tarjetaEPrepagoID,numeroTarjeta,fechaVencimiento,cvv,
                nombrePropietario,saldoRecargado,franquicia);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var tarjetaEPrepagoCreated = (TarjetaEPrepagoCreated)event.get(0);
        Assertions.assertEquals("52",tarjetaEPrepagoCreated.aggregateRootId());
    }
}
