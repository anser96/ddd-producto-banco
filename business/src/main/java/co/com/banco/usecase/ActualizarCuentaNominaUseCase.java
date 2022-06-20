package co.com.banco.usecase;

import co.com.banco.Cuenta;
import co.com.banco.command.ActualizarCuentaNomina;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarCuentaNominaUseCase extends UseCase<RequestCommand<ActualizarCuentaNomina>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarCuentaNomina> actualizarCuentaNominaRequestCommand) {
        var command = actualizarCuentaNominaRequestCommand.getCommand();
        var cuenta = Cuenta.from(command.getCuentaID(),repository().getEventsBy(command.getCuentaID().value()));

        cuenta.actualizarCuentaNomina(command.getCuentaNominaID(), command.getNumeroCuenta(), command.getSaldo(),
                command.getInteresGenerado(), command.getAnticipoPermitido());

        emit().onResponse(new ResponseEvents(cuenta.getUncommittedChanges()));
    }
}
