package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaDebitoCreated extends DomainEvent {
    private final NumeroTarjeta numeroTarjeta;

    private final TarjetaDebitoID tarjetaDebitoID;

    public TarjetaDebitoCreated(TarjetaDebitoID tarjetaDebitoID, NumeroTarjeta numeroTarjeta) {
        super("co.com.banco.event.TarjetaDebitoCreated");
        this.tarjetaDebitoID = tarjetaDebitoID;
        this.numeroTarjeta = numeroTarjeta;
    }

    public NumeroTarjeta getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public TarjetaDebitoID getTarjetaDebitoID() {
        return tarjetaDebitoID;
    }
}
