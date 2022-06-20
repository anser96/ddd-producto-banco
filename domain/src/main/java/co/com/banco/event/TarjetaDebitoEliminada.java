package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaDebitoEliminada extends DomainEvent {
    private final TarjetaID tarjetaID;
    private final TarjetaDebitoID tarjetaDebitoID;

    public TarjetaDebitoEliminada(TarjetaDebitoID tarjetaDebitoID, TarjetaID tarjetaID) {
        super("co.com.banco.event.TarjetaDebitoEliminda");
        this.tarjetaDebitoID = tarjetaDebitoID;
        this.tarjetaID = tarjetaID;
    }

    public TarjetaDebitoID getTarjetaDebitoID() {
        return tarjetaDebitoID;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }
}
