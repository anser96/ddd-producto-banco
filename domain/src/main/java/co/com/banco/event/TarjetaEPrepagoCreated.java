package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaEPrepagoCreated extends DomainEvent {
    private final NumeroTarjeta numeroTarjeta;
    private final TarjetaEPrepagoID tarjetaEPrepagoID;

    public TarjetaEPrepagoCreated(TarjetaEPrepagoID tarjetaEPrepagoID, NumeroTarjeta numeroTarjeta) {
        super("co.com.banco.event.TarjetaEPrepagoCreated");
        this.numeroTarjeta = numeroTarjeta;
        this.tarjetaEPrepagoID = tarjetaEPrepagoID;
    }

    public NumeroTarjeta getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public TarjetaEPrepagoID getTarjetaEPrepagoID() {
        return tarjetaEPrepagoID;
    }
}
