package co.com.banco.usecase;

import co.com.banco.Tarjeta;
import co.com.banco.event.TarjetaCuentaNominaActualizada;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class EliminarTarjetaCreditoUseCase extends UseCase<TriggeredEvent<TarjetaCuentaNominaActualizada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<TarjetaCuentaNominaActualizada> tarjetaCuentaNominaActualizadaTriggeredEvent) {
        var event = tarjetaCuentaNominaActualizadaTriggeredEvent.getDomainEvent();
        var tarjeta = Tarjeta.from(event.getTarjetaID(), repository().getEventsBy(event.getTarjetaID().value()));

        tarjeta.eliminarTarjetaCredito(event.getTarjetaCreditoID());

        emit().onResponse(new ResponseEvents(tarjeta.getUncommittedChanges()));
    }
}
