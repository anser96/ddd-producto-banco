package co.com.banco;

import co.com.banco.event.*;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Tarjeta extends AggregateEvent<TarjetaID> {

    protected TarjetaID tarjetaID;
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

    public Tarjeta(TarjetaID tarjetaID) {
        super(tarjetaID);
        subscribe(new TarjetaChange(this));
    }

    public static Tarjeta from(TarjetaID tarjetaID, List<DomainEvent> events) {
        var tarjeta = new Tarjeta(tarjetaID);
        events.forEach(tarjeta::applyEvent);
        return tarjeta;
    }

    public void eliminarTarjetaDebito(TarjetaDebitoID tarjetaDebitoID){
        appendChange(new TarjetaDebitoEliminada(tarjetaDebitoID, tarjetaID)).apply();
    }
    public void eliminarTarjetaCredito(TarjetaCreditoID tarjetaCreditoID){
        appendChange(new TarjetaCreditoEliminada(tarjetaCreditoID, tarjetaID)).apply();
    }
}
