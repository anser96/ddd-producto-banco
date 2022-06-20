package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.CreateCuentaNomina;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCuentaNominaUseCase extends UseCase<RequestCommand<CreateCuentaNomina>, ResponseEvents> {

    public void executeUseCase(RequestCommand<CreateCuentaNomina> createCuentaNominaRequestCommand) {
        var command = createCuentaNominaRequestCommand.getCommand();
        var cuenta = new Cuenta(command.getCuentaID(),command.getCuentaNominaID(), command.getNumeroCuenta());
        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
