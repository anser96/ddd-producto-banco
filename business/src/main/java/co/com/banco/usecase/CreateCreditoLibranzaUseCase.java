package co.com.banco.usecase;

import co.com.banco.Credito;
import co.com.banco.command.CreateCreditoLibranza;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCreditoLibranzaUseCase extends UseCase<RequestCommand<CreateCreditoLibranza>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateCreditoLibranza> createCreditoLibranzaRequestCommand) {
        var command = createCreditoLibranzaRequestCommand.getCommand();
        var credito = new Credito(command.getCreditoID(), command.getCreditoLibranzaID(), command.getNumeroCredito());
        emit().onResponse(new ResponseEvents(credito.getUncommittedChanges()));
    }
}
