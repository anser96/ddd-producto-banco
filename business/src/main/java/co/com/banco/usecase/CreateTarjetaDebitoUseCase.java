package co.com.banco.usecase;

import co.com.banco.Tarjeta;
import co.com.banco.command.CreateTarjeraDebito;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateTarjetaDebitoUseCase extends UseCase<RequestCommand<CreateTarjeraDebito>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateTarjeraDebito> createTarjeraDebitoRequestCommand) {
        var command = createTarjeraDebitoRequestCommand.getCommand();
        var tarjeta = new Tarjeta(command.getTarjetaID(), command.getTarjetaDebitoID(), command.getNumeroTarjeta());
        emit().onResponse(new ResponseEvents(tarjeta.getUncommittedChanges()));
    }
}
