package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCreditoCreated extends DomainEvent {

    private final NumeroTarjeta numeroTarjeta;

    private final TarjetaCreditoID tarjetaCreditoID;

    public TarjetaCreditoCreated(TarjetaCreditoID tarjetaCreditoID,NumeroTarjeta numeroTarjeta) {
        super("co .com.banco.event.TarjetaCreditoCreated");
        this.tarjetaCreditoID = tarjetaCreditoID;
        this.numeroTarjeta = numeroTarjeta;
    }

    public NumeroTarjeta getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public TarjetaCreditoID getTarjetaCreditoID() {
        return tarjetaCreditoID;
    }
}
