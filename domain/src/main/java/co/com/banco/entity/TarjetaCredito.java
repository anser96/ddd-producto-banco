package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class TarjetaCredito extends Entity<TarjetaCreditoID> {
    protected NumeroTarjeta numeroTarjeta;
    protected FechaVencimiento fechaVencimiento;
    protected Cvv cvv;
    protected NombrePropietario nombrePropietario;
    protected CupoDisponible cupoDisponible;
    protected Franquicia franquicia;

    public TarjetaCredito(TarjetaCreditoID tarjetaCreditoID, NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento,
                          Cvv cvv, NombrePropietario nombrePropietario, CupoDisponible cupoDisponible, Franquicia franquicia) {
        super(tarjetaCreditoID);
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.nombrePropietario = nombrePropietario;
        this.cupoDisponible = cupoDisponible;
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

    public CupoDisponible getCupoDisponible() {
        return cupoDisponible;
    }

    public Franquicia getFranquicia() {
        return franquicia;
    }
}
