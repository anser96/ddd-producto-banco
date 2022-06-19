package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCreditoCreated extends DomainEvent {

    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final NombrePropietario nombrePropietario;
    private final CupoDisponible cupoDisponible;
    private final Franquicia franquicia;

    public TarjetaCreditoCreated(NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento, Cvv cvv,
                                 NombrePropietario nombrePropietario, CupoDisponible cupoDisponible, Franquicia franquicia) {
        super("co .com.banco.event.TarjetaCreditoCreated");
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
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
