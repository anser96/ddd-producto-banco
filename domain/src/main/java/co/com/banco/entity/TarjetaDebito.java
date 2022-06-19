package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class TarjetaDebito extends Entity<TarjetaDebitoID> {
    protected NumeroTarjeta numeroTarjeta;
    protected FechaVencimiento fechaVencimiento;
    protected Cvv cvv;
    protected Saldo saldo;
    protected NombrePropietario nombrePropietario;
    protected Franquicia franquicia;

    public TarjetaDebito(TarjetaDebitoID tarjetaDebitoID, NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento,
                         Cvv cvv, Saldo saldo, NombrePropietario nombrePropietario, Franquicia franquicia) {
        super(tarjetaDebitoID);
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
