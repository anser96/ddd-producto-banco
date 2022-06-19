package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaEPrepagoCreated extends DomainEvent {
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final NombrePropietario nombrePropietario;
    private final SaldoRecargado saldoRecargado;
    private final Franquicia franquicia;

    public TarjetaEPrepagoCreated(NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento, Cvv cvv,
                                  NombrePropietario nombrePropietario, SaldoRecargado saldoRecargado, Franquicia franquicia) {
        super("co.com.banco.event.TarjetaEPrepagoCreated");
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.nombrePropietario = nombrePropietario;
        this.saldoRecargado = saldoRecargado;
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

    public NombrePropietario getNombrePropietario() {
        return nombrePropietario;
    }

    public SaldoRecargado getSaldoRecargado() {
        return saldoRecargado;
    }

    public Franquicia getFranquicia() {
        return franquicia;
    }
}
