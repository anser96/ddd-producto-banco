package co.com.banco.cliente;


import co.com.banco.command.CreateCuentaNomina;
import co.com.banco.command.CreateTarjetaCredito;
import co.com.banco.event.CuentaNominaCreated;
import co.com.banco.event.TarjetaCreditoCreated;
import co.com.banco.usecase.CreateTarjetaCreditoUseCase;

import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
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
    void createTarjetaCredito(){
        //arrange
        var tarjetaCreditoID = new TarjetaCreditoID("189");
        var tarjetaID = new TarjetaID("524");
        var numeroTarjeta = new NumeroTarjeta("225656562");
        var fechaVencimiento = new FechaVencimiento("14");
        var cvv = new Cvv("026");
        var nombrePropietario = new NombrePropietario("Jhon Alex");
        var cupoDisponible = new CupoDisponible("100000000");
        var franquicia = new Franquicia("American Express");

        var command = new CreateTarjetaCredito(tarjetaID, tarjetaCreditoID,numeroTarjeta,fechaVencimiento,cvv,
                nombrePropietario,cupoDisponible,franquicia);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var tarjetaCreditoCreada = (TarjetaCreditoCreated)event.get(0);
        Assertions.assertEquals("524",tarjetaCreditoCreada.aggregateRootId());
    }

}
