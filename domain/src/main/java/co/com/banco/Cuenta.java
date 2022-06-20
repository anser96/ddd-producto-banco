package co.com.banco;

import co.com.banco.entity.CuentaAhorro;
import co.com.banco.event.CreditoCarteraCreated;
import co.com.banco.event.CuentaAhorroCreated;
import co.com.banco.event.CuentaCorrienteCreated;
import co.com.banco.event.CuentaCreated;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cuenta extends AggregateEvent<CuentaID> {
    protected CuentaID cuentaID;
    protected CuentaAhorroID cuentaAhorroID;
    protected CuentaNominaID cuentaNominaID;
    protected CuentaCorrienteID cuentaCorrienteID;
    protected NumeroCuenta numeroCuenta;
    protected CuentaAhorro cuentaAhorro;
    public Cuenta(CuentaID cuentaID, CuentaAhorroID cuentaAhorroID, CuentaNominaID cuentaNominaID,
                  CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta) {
        super(cuentaID);
        subscribe(new CuentaChange(this));
        appendChange(new CuentaCreated(cuentaCorrienteID, cuentaNominaID, cuentaAhorroID, numeroCuenta));
    }

    public Cuenta(CuentaID cuentaID, CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta) {
        super(cuentaID);
        appendChange(new CuentaAhorroCreated(cuentaAhorroID, numeroCuenta)).apply();
        subscribe(new CuentaChange(this));
    }

    public Cuenta(CuentaID cuentaID, CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta ) {
        super(cuentaID);
        appendChange(new CuentaCorrienteCreated(cuentaCorrienteID, numeroCuenta)).apply();
        subscribe(new CuentaChange(this));
    }




    public CuentaAhorro cuentaAhorro(){
        return cuentaAhorro;
    }

    public CuentaAhorroID cuentaAhorroID(){
        return cuentaAhorroID;
    }
}
