package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCuentaNominaActualizada extends DomainEvent {

    private final TarjetaID tarjetaID;
    private final TarjetaCreditoID tarjetaCreditoID;
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final NombrePropietario nombrePropietario;
    private final CupoDisponible cupoDisponible;
    private final Franquicia franquicia;

    public TarjetaCuentaNominaActualizada(TarjetaID tarjetaID, TarjetaCreditoID tarjetaCreditoID, NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento, Cvv cvv, NombrePropietario nombrePropietario, CupoDisponible cupoDisponible, Franquicia franquicia) {
        super("co.com.banco.event.TarjetaCuentaNominaActualizada");
        this.tarjetaID = tarjetaID;
        this.tarjetaCreditoID = tarjetaCreditoID;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.nombrePropietario = nombrePropietario;
        this.cupoDisponible = cupoDisponible;
        this.franquicia = franquicia;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }

    public TarjetaCreditoID getTarjetaCreditoID() {
        return tarjetaCreditoID;
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
