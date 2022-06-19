package co.com.banco;

import co.com.banco.event.TarjetaCreated;
import co.com.banco.value.TarjetaCreditoID;
import co.com.banco.value.TarjetaDebitoID;
import co.com.banco.value.TarjetaEPrepagoID;
import co.com.banco.value.TarjetaID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Tarjeta extends AggregateEvent<TarjetaID> {
    protected TarjetaEPrepagoID tarjetaEPrepagoID;
    protected TarjetaDebitoID tarjetaDebitoID;
    protected TarjetaCreditoID tarjetaCreditoID;

    public Tarjeta(TarjetaID tarjetaID, TarjetaCreditoID tarjetaCreditoID, TarjetaDebitoID tarjetaDebitoID, TarjetaEPrepagoID tarjetaEPrepagoID) {
        super(tarjetaID);
        subscribe(new TarjetaChange(this));
        appendChange(new TarjetaCreated(tarjetaCreditoID, tarjetaDebitoID, tarjetaEPrepagoID));

    }
}
