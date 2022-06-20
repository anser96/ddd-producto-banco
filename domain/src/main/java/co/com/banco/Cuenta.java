package co.com.banco;

import co.com.banco.entity.CuentaAhorro;
import co.com.banco.event.*;
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

    public Cuenta(CuentaID cuentaID, CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta) {
        super(cuentaID);
        appendChange(new CuentaNominaCreated(cuentaNominaID, numeroCuenta)).apply();
        subscribe(new CuentaChange(this));

    }

    public void actualizarCuentaNomina(CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta,
                                     Saldo saldo, InteresGenerado interesGenerado, AnticipoPermitido anticipoPermitido){

        appendChange(new CuentaNominaActualizada(cuentaNominaID, numeroCuenta, saldo, interesGenerado, anticipoPermitido)).apply();
    }

    public void actualizarCuentaAhorro(CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta,
                                       Saldo saldo, InteresGenerado interesGenerado, NumeroRetirosGratis numeroRetirosGratis){

        appendChange(new CuentaAhorroActualizada(cuentaAhorroID, numeroCuenta, saldo, interesGenerado, numeroRetirosGratis)).apply();
    }

    public void actualizarCuentaCorriente(CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta,
                                       SobreGiro sobreGiro, CantChequesDisponibles cantChequesDisponibles){

        appendChange(new CuentaCorrienteActualizada(cuentaCorrienteID, numeroCuenta,sobreGiro, cantChequesDisponibles)).apply();
    }




    public CuentaAhorro cuentaAhorro(){
        return cuentaAhorro;
    }

    public CuentaAhorroID cuentaAhorroID(){
        return cuentaAhorroID;
    }
}
