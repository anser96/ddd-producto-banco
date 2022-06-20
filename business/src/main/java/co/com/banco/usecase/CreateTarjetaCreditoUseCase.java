package co.com.banco.usecase;

import co.com.banco.Tarjeta;
import co.com.banco.command.CreateTarjetaCredito;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateTarjetaCreditoUseCase extends UseCase<RequestCommand<CreateTarjetaCredito>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateTarjetaCredito> createTarjetaCreditoRequestCommand) {
        var command = createTarjetaCreditoRequestCommand.getCommand();
        var tarjeta = new Tarjeta(command.getTarjetaID(),command.getTarjetaCreditoID(),command.getNumeroTarjeta());
        emit().onResponse(new ResponseEvents(tarjeta.getUncommittedChanges()));
    }
}
