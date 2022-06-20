package co.com.banco.cliente;

import co.com.banco.command.CreateCuentaAhorro;
import co.com.banco.event.CuentaAhorroCreated;
import co.com.banco.usecase.CreateCuentaAhorroUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCuentaAhorroUseCaseTest {
    private CreateCuentaAhorroUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase =  new CreateCuentaAhorroUseCase();
    }

    @Test
    void createCuentaAhorro(){
        //arrange
        var cuentaAhorroID = new CuentaAhorroID("CuAhorro1");
        var cuentaID = new CuentaID("10");
        var numeroCuenta = new NumeroCuenta("500 4564");
        var saldo = new Saldo("1000");
        var interes = new InteresGenerado("0.5");
        var retiros = new NumeroRetirosGratis("3");

        var command = new CreateCuentaAhorro(cuentaID, cuentaAhorroID,numeroCuenta, saldo, interes, retiros);


        //act
        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var cuentaAhorroCreada = (CuentaAhorroCreated)eventos.get(0);
        Assertions.assertEquals("10", cuentaAhorroCreada.aggregateRootId());


    }
}
