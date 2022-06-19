package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class TarjetaEPrepago extends Entity<TarjetaEPrepagoID> {
    protected NumeroTarjeta numeroTarjeta;
    protected FechaVencimiento fechaVencimiento;
    protected Cvv cvv;
    protected NombrePropietario nombrePropietario;
    protected SaldoRecargado saldoRecargado;
    protected Franquicia franquicia;

    public TarjetaEPrepago(TarjetaEPrepagoID tarjetaEPrepagoID, NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento,
                           Cvv cvv, NombrePropietario nombrePropietario, SaldoRecargado saldoRecargado, Franquicia franquicia) {
        super(tarjetaEPrepagoID);
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
