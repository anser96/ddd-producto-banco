package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateTarjetaEPrepago extends Command {
    private final TarjetaID tarjetaID;
    private final TarjetaEPrepagoID tarjetaEPrepagoID;
    private final NumeroTarjeta numeroTarjeta;
    private final FechaVencimiento fechaVencimiento;
    private final Cvv cvv;
    private final NombrePropietario nombrePropietario;
    private final SaldoRecargado saldoRecargado;
    private final Franquicia franquicia;

    public CreateTarjetaEPrepago(TarjetaID tarjetaID, TarjetaEPrepagoID tarjetaEPrepagoID, NumeroTarjeta numeroTarjeta,
                                 FechaVencimiento fechaVencimiento, Cvv cvv, NombrePropietario nombrePropietario,
                                 SaldoRecargado saldoRecargado, Franquicia franquicia) {
        this.tarjetaID = tarjetaID;
        this.tarjetaEPrepagoID = tarjetaEPrepagoID;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.nombrePropietario = nombrePropietario;
        this.saldoRecargado = saldoRecargado;
        this.franquicia = franquicia;
    }

    public TarjetaID getTarjetaID() {
        return tarjetaID;
    }

    public TarjetaEPrepagoID getTarjetaEPrepagoID() {
        return tarjetaEPrepagoID;
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
