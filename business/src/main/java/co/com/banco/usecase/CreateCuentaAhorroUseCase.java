package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.CreateCuentaAhorro;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCuentaAhorroUseCase extends UseCase<RequestCommand<CreateCuentaAhorro>, ResponseEvents> {
    public void executeUseCase(RequestCommand<CreateCuentaAhorro> createCuentaAhorroRequestCommand) {
        var command =createCuentaAhorroRequestCommand.getCommand();
        var cuenta = new Cuenta(command.getCuentaID(),command.getCuentaAhorroID(), command.getNumeroCuenta());
        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
