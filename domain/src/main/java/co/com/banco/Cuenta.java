package co.com.banco;

import co.com.banco.entity.CuentaAhorro;
import co.com.banco.entity.CuentaCorriente;
import co.com.banco.entity.CuentaNomina;
import co.com.banco.event.*;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Cuenta extends AggregateEvent<CuentaID> {
    protected CuentaID cuentaID;
    protected CuentaAhorroID cuentaAhorroID;
    protected CuentaNominaID cuentaNominaID;
    protected CuentaCorrienteID cuentaCorrienteID;
    protected NumeroCuenta numeroCuenta;
    protected CuentaAhorro cuentaAhorro;

    protected CuentaCorriente cuentaCorriente;
    protected CuentaNomina cuentaNomina;
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

    public Cuenta(CuentaID cuentaID) {
        super(cuentaID);
        subscribe(new CuentaChange(this));
    }

    public static Cuenta from(CuentaID cuentaID, List<DomainEvent> events) {
        var cuenta = new Cuenta(cuentaID);
        events.forEach(cuenta::applyEvent);
        return cuenta;
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

    public CuentaCorrienteID cuentaCorrienteID() {
        return cuentaCorrienteID;
    }

    public CuentaCorriente cuentaCorriente() {
        return cuentaCorriente;
    }

    public CuentaNomina cuentaNomina() {
        return cuentaNomina;
    }

    public CuentaNominaID cuentaNominaID() {
        return cuentaNominaID;
    }

    public CuentaID cuentaID() {
        return cuentaID;
    }
}
