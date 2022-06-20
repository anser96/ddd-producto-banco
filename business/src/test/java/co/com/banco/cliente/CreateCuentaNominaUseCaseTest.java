package co.com.banco.cliente;

import co.com.banco.command.CreateCuentaNomina;
import co.com.banco.event.CuentaNominaCreated;
import co.com.banco.usecase.CreateCuentaNominaUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCuentaNominaUseCaseTest {

    private CreateCuentaNominaUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateCuentaNominaUseCase();
    }

    @Test
    void createCuentaNomina(){
        //arrange
        var cuentaNominaID = new CuentaNominaID("8");
        var cuentaID = new CuentaID("9");
        var numeroCuenta = new NumeroCuenta("22222222");
        var saldo = new Saldo("0");
        var interes = new InteresGenerado("0.2");
        var anticipo = new AnticipoPermitido("1000");

        var command = new CreateCuentaNomina(cuentaID,cuentaNominaID,numeroCuenta,saldo,interes,anticipo);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var cuentaNominaCreada = (CuentaNominaCreated)event.get(0);
        Assertions.assertEquals("9",cuentaNominaCreada.aggregateRootId());
    }
}
