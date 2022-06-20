package co.com.banco.event;

import co.com.banco.value.TarjetaCreditoID;
import co.com.banco.value.TarjetaDebitoID;
import co.com.banco.value.TarjetaID;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCreditoEliminada extends DomainEvent {
    private final TarjetaID tarjetaID;
    private final TarjetaCreditoID tarjetaCreditoID;

    public TarjetaCreditoEliminada(TarjetaCreditoID tarjetaCreditoID, TarjetaID tarjetaID) {
        super("co.com.banco.event.TarjetaCreditoEliminda");
        this.tarjetaCreditoID = tarjetaCreditoID;
        this.tarjetaID = tarjetaID;
    }

    public TarjetaCreditoID getTarjetaCreditoID() {
        return tarjetaCreditoID;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }
}
