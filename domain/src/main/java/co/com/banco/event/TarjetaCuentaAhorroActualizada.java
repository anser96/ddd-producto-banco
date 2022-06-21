package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCuentaAhorroActualizada extends DomainEvent{

    private final TarjetaID tarjetaID;
    private final TarjetaDebitoID tarjetaDebitoID;
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final Saldo saldo;
    private final NombrePropietario nombrePropietario;
    private final Franquicia franquicia;

    public TarjetaCuentaAhorroActualizada(TarjetaID tarjetaID, TarjetaDebitoID tarjetaDebitoID,
                                          NumeroTarjeta numeroTarjeta, FechaVencimiento fechaVencimiento, Cvv cvv,
                                          Saldo saldo, NombrePropietario nombrePropietario, Franquicia franquicia) {
        super("co.com.banco.event.TarjetaCuentaAhorroActualizada");
        this.tarjetaID = tarjetaID;
        this.tarjetaDebitoID = tarjetaDebitoID;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.saldo = saldo;
        this.nombrePropietario = nombrePropietario;
        this.franquicia = franquicia;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }

    public TarjetaDebitoID getTarjetaDebitoID() {
        return tarjetaDebitoID;
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
