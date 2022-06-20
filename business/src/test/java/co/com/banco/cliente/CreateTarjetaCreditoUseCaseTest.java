package co.com.banco.cliente;


import co.com.banco.command.CreateCuentaNomina;
import co.com.banco.command.CreateTarjetaCredito;
import co.com.banco.event.CuentaNominaCreated;
import co.com.banco.event.TarjetaCreditoCreated;
import co.com.banco.usecase.CreateTarjetaCreditoUseCase;

import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateTarjetaCreditoUseCaseTest {
    private CreateTarjetaCreditoUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateTarjetaCreditoUseCase();
    }

    @Test
    void createCuentaNomina(){
        //arrange
        var tarjetaCreditoID = new TarjetaCreditoID("10");
        var tarjetaID = new TarjetaID("55");
        var numeroTarjeta = new NumeroTarjeta("222222");
        var fechaVencimiento = new FechaVencimiento("0");
        var cvv = new Cvv("025");
        var nombrePropietario = new NombrePropietario("Jhon Due");
        var cupoDisponible = new CupoDisponible("1000");
        var franquicia = new Franquicia("");

        var command = new CreateTarjetaCredito(tarjetaID, tarjetaCreditoID,numeroTarjeta,fechaVencimiento,cvv,
                nombrePropietario,cupoDisponible,franquicia);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var tarjetaCreditoCreada = (TarjetaCreditoCreated)event.get(0);
        Assertions.assertEquals("9",tarjetaCreditoCreada.aggregateRootId());
    }

}
