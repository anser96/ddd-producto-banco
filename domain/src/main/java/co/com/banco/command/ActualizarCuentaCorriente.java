package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class ActualizarCuentaCorriente extends Command {
    private final CuentaID cuentaID;
    private final CuentaCorrienteID cuentaCorrienteID;
    private final NumeroCuenta numeroCuenta;
    private final SobreGiro sobreGiro;
    private final CantChequesDisponibles cantChequesDisponibles;

    public ActualizarCuentaCorriente(CuentaID cuentaID, CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta, SobreGiro sobreGiro, CantChequesDisponibles cantChequesDisponibles) {
        this.cuentaID = cuentaID;
        this.cuentaCorrienteID = cuentaCorrienteID;
        this.numeroCuenta = numeroCuenta;
        this.sobreGiro = sobreGiro;
        this.cantChequesDisponibles = cantChequesDisponibles;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }

    public CuentaCorrienteID getCuentaCorrienteID() {
        return cuentaCorrienteID;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public SobreGiro getSobreGiro() {
        return sobreGiro;
    }

    public CantChequesDisponibles getCantChequesDisponibles() {
        return cantChequesDisponibles;
    }
}
