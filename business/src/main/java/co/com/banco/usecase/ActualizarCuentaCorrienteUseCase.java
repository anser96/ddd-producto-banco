package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.ActualizarCuentaCorriente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarCuentaCorrienteUseCase extends UseCase<RequestCommand<ActualizarCuentaCorriente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarCuentaCorriente> actualizarCuentaCorrienteRequestCommand) {
        var command = actualizarCuentaCorrienteRequestCommand.getCommand();
        var cuenta = Cuenta.from(command.getCuentaID(),repository().getEventsBy(command.getCuentaID().value()));

        cuenta.actualizarCuentaCorriente(command.getCuentaCorrienteID(), command.getNumeroCuenta(), command.getSobreGiro(),
                command.getCantChequesDisponibles());

        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
