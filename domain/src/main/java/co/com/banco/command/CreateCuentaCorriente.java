package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateCuentaCorriente extends Command {

    private final CuentaCorrienteID cuentaCorrienteID;
    private final CuentaID cuentaID;
    private final NumeroCuenta numeroCuenta;
    private final SobreGiro sobreGiro;
    private final CantChequesDisponibles cantChequesDisponibles;

    public CreateCuentaCorriente(CuentaID cuentaID, CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta,
                                 SobreGiro sobreGiro, CantChequesDisponibles cantChequesDisponibles) {
        this.cuentaID = cuentaID;
        this.cuentaCorrienteID = cuentaCorrienteID;
        this.numeroCuenta = numeroCuenta;
        this.sobreGiro = sobreGiro;
        this.cantChequesDisponibles = cantChequesDisponibles;
    }

    public CuentaCorrienteID getCuentaCorrienteID() {
        return cuentaCorrienteID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
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
