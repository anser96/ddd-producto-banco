package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.CreateCuentaCorriente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCuentaCorrienteUseCase extends UseCase<RequestCommand<CreateCuentaCorriente>, ResponseEvents> {

    public void executeUseCase(RequestCommand<CreateCuentaCorriente> createCuentaCorrienteRequestCommand) {
        var command = createCuentaCorrienteRequestCommand.getCommand();
        var cuenta = new Cuenta(command.getCuentaID(),command.getCuentaCorrienteID(),command.getNumeroCuenta());
        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));

    }
}
