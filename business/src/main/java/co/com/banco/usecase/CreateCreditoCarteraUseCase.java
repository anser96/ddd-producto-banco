package co.com.banco.usecase;

import co.com.banco.Credito;
import co.com.banco.command.CreateCreditoCartera;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCreditoCarteraUseCase extends UseCase<RequestCommand<CreateCreditoCartera>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateCreditoCartera> createCreditoCarteraRequestCommand) {
        var command = createCreditoCarteraRequestCommand.getCommand();
        var credito = new Credito(command.getCreditoID(), command.getCreditoCarteraID(), command.getNumeroCredito());
        emit().onResponse(new ResponseEvents(credito.getUncommittedChanges()));
    }
}
