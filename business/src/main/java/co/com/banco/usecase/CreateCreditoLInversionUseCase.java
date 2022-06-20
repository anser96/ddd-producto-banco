package co.com.banco.usecase;

import co.com.banco.Credito;
import co.com.banco.command.CreateCreditoLIversion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCreditoLInversionUseCase extends UseCase<RequestCommand<CreateCreditoLIversion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateCreditoLIversion> createCreditoLIversionRequestCommand) {
        var command = createCreditoLIversionRequestCommand.getCommand();
        var credito = new Credito(command.getCreditoID(), command.getCreditoLInversionID(), command.getNumeroCredito());
        emit().onResponse(new ResponseEvents(credito.getUncommittedChanges()));
    }
}
