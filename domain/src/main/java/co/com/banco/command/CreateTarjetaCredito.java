package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateTarjetaCredito extends Command {
    private final TarjetaID tarjetaID;
    private final TarjetaCreditoID tarjetaCreditoID;
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final NombrePropietario nombrePropietario;
    private final CupoDisponible cupoDisponible;
    private final Franquicia franquicia;

    public CreateTarjetaCredito(TarjetaID tarjetaID, TarjetaCreditoID tarjetaCreditoID,
                                NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento,
                                Cvv cvv, NombrePropietario nombrePropietario, CupoDisponible cupoDisponible,
                                Franquicia franquicia) {
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
