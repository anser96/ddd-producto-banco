package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.ActualizarCuentaAhorro;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarCuentaAhorroUseCase extends UseCase<RequestCommand<ActualizarCuentaAhorro>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarCuentaAhorro> actualizarCuentaAhorroRequestCommand) {
        var command = actualizarCuentaAhorroRequestCommand.getCommand();
        var cuenta = Cuenta.from(command.getCuentaID(),repository().getEventsBy(command.getCuentaID().value()));

        cuenta.actualizarCuentaAhorro(command.getCuentaAhorroID(), command.getNumeroCuenta(), command.getSaldo(),
                command.getInteresGenerado(), command.getNumeroRetirosGratis());

        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
