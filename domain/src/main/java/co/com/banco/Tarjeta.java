package co.com.banco;

import co.com.banco.event.TarjetaCreated;
import co.com.banco.event.TarjetaCreditoCreated;
import co.com.banco.event.TarjetaDebitoCreated;
import co.com.banco.event.TarjetaEPrepagoCreated;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Tarjeta extends AggregateEvent<TarjetaID> {
    protected TarjetaEPrepagoID tarjetaEPrepagoID;
    protected TarjetaDebitoID tarjetaDebitoID;
    protected TarjetaCreditoID tarjetaCreditoID;

    protected NumeroTarjeta numeroTarjeta;

    public Tarjeta(TarjetaID tarjetaID, TarjetaCreditoID tarjetaCreditoID, TarjetaDebitoID tarjetaDebitoID, TarjetaEPrepagoID tarjetaEPrepagoID) {
        super(tarjetaID);
        subscribe(new TarjetaChange(this));
        appendChange(new TarjetaCreated(tarjetaCreditoID, tarjetaDebitoID, tarjetaEPrepagoID));

    }

    public Tarjeta(TarjetaID tarjetaID, TarjetaCreditoID tarjetaCreditoID, NumeroTarjeta numeroTarjeta) {
        super(tarjetaID);
        appendChange(new TarjetaCreditoCreated(tarjetaCreditoID, numeroTarjeta)).apply();
        subscribe(new TarjetaChange(this));
    }

    public Tarjeta(TarjetaID tarjetaID, TarjetaDebitoID tarjetaDebitoID, NumeroTarjeta numeroTarjeta) {
        super(tarjetaID);
        appendChange(new TarjetaDebitoCreated(tarjetaDebitoID, numeroTarjeta)).apply();
        subscribe(new TarjetaChange(this));
    }

    public Tarjeta(TarjetaID tarjetaID, TarjetaEPrepagoID tarjetaEPrepagoID, NumeroTarjeta numeroTarjeta) {
        super(tarjetaID);
        appendChange(new TarjetaEPrepagoCreated(tarjetaEPrepagoID, numeroTarjeta)).apply();
        subscribe(new TarjetaChange(this));
    }
}
