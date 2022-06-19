package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaDebitoCreated extends DomainEvent {
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final Saldo saldo;
    private final NombrePropietario nombrePropietario;
    private final Franquicia franquicia;

    public TarjetaDebitoCreated(NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento, Cvv cvv,
                                Saldo saldo, NombrePropietario nombrePropietario, Franquicia franquicia) {
        super("co.com.banco.event.TarjetaDebitoCreated");
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.saldo = saldo;
        this.nombrePropietario = nombrePropietario;
        this.franquicia = franquicia;
    }

    public NumeroTarjeta getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cvv getCvv() {
        return cvv;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public NombrePropietario getNombrePropietario() {
        return nombrePropietario;
    }

    public Franquicia getFranquicia() {
        return franquicia;
    }
}
