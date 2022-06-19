package co.com.banco.event;

import co.com.banco.entity.TarjetaDebito;
import co.com.banco.value.TarjetaCreditoID;
import co.com.banco.value.TarjetaDebitoID;
import co.com.banco.value.TarjetaEPrepagoID;
import co.com.banco.value.TarjetaID;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCreated extends DomainEvent {
    private final TarjetaEPrepagoID tarjetaEPrepagoID;
    private final TarjetaDebitoID tarjetaDebitoID;
    private final TarjetaCreditoID tarjetaCreditoID;

    public TarjetaCreated(TarjetaCreditoID tarjetaCreditoID, TarjetaDebitoID tarjetaDebitoID, TarjetaEPrepagoID tarjetaEPrepagoID) {
        super("tarjeta");
        this.tarjetaCreditoID = tarjetaCreditoID;
        this.tarjetaDebitoID = tarjetaDebitoID;
        this.tarjetaEPrepagoID = tarjetaEPrepagoID;
    }

    public TarjetaEPrepagoID getTarjetaEPrepagoID() {
        return tarjetaEPrepagoID;
    }

    public TarjetaDebitoID getTarjetaDebitoID() {
        return tarjetaDebitoID;
    }

    public TarjetaCreditoID getTarjetaCreditoID() {
        return tarjetaCreditoID;
    }
}
