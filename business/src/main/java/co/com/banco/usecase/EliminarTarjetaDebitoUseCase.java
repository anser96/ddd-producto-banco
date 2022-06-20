package co.com.banco.usecase;

import co.com.banco.Tarjeta;
import co.com.banco.event.TarjetaCuentaAhorroActualizada;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

public class EliminarTarjetaDebitoUseCase extends UseCase<TriggeredEvent<TarjetaCuentaAhorroActualizada>, ResponseEvents> {


    @Override
    public void executeUseCase(TriggeredEvent<TarjetaCuentaAhorroActualizada> tarjetaCuentaAhorroActualizadaTriggeredEvent) {
        var event = tarjetaCuentaAhorroActualizadaTriggeredEvent.getDomainEvent();
        var tarjeta = Tarjeta.from(event.getTarjetaID(), repository().getEventsBy(event.getTarjetaID().value()));

        tarjeta.eliminarTarjetaDebito(event.getTarjetaDebitoID());

        emit().onResponse(new ResponseEvents(tarjeta.getUncommittedChanges()));
    }
}
