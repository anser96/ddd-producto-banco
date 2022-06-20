package co.com.banco.cliente;

import co.com.banco.command.CreateCuentaCorriente;
import co.com.banco.event.CuentaCorrienteCreated;
import co.com.banco.usecase.CreateCuentaCorrienteUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCuentaCorrienteUseCaseTest {
    private CreateCuentaCorrienteUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateCuentaCorrienteUseCase();
    }

    @Test
    void createCuentaCorriente(){
        //arrange
        var cuentaCorrienteID = new CuentaCorrienteID("3");
        var cuentaID = new CuentaID("7");
        var numerCuenta = new NumeroCuenta("33333");
        var sobreGiro = new SobreGiro("30000");
        var cantCheques = new CantChequesDisponibles("3");

        var command = new CreateCuentaCorriente(cuentaID,cuentaCorrienteID,numerCuenta,sobreGiro,cantCheques);

        //act
        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var cuentaCorrienteCreada = (CuentaCorrienteCreated)eventos.get(0);
        Assertions.assertEquals("7",cuentaCorrienteCreada.aggregateRootId());
    }
}
