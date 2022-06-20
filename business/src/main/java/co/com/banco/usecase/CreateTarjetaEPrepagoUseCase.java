package co.com.banco.usecase;

import co.com.banco.Tarjeta;
import co.com.banco.command.CreateTarjetaEPrepago;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateTarjetaEPrepagoUseCase extends UseCase<RequestCommand<CreateTarjetaEPrepago>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateTarjetaEPrepago> createTarjetaEPrepagoRequestCommand) {
        var command = createTarjetaEPrepagoRequestCommand.getCommand();
        var tarjeta = new Tarjeta(command.getTarjetaID(), command.getTarjetaEPrepagoID(), command.getNumeroTarjeta());
        emit().onResponse(new ResponseEvents(tarjeta.getUncommittedChanges()));
    }
}
