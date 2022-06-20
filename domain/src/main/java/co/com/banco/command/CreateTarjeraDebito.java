package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateTarjeraDebito extends Command {
    private final TarjetaID tarjetaID;
    private final TarjetaDebitoID tarjetaDebitoID;
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final Saldo saldo;
    private final NombrePropietario nombrePropietario;
    private final Franquicia franquicia;

    public CreateTarjeraDebito(TarjetaID tarjetaID, TarjetaDebitoID tarjetaDebitoID, NumeroTarjeta numeroTarjeta,
                               FechaVencimiento fechaVencimiento, Cvv cvv, Saldo saldo,
                               NombrePropietario nombrePropietario, Franquicia franquicia ) {
        this.tarjetaID = tarjetaID;
        this.tarjetaDebitoID = tarjetaDebitoID;
        this.numeroTarjeta = numeroTarjeta;
        this.nombrePropietario = nombrePropietario;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.saldo = saldo;
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
