package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCorrienteActualizada extends DomainEvent {


    private final CuentaCorrienteID cuentaCorrienteID;
    private final NumeroCuenta numeroCuenta;
    private final SobreGiro sobreGiro;
    private final CantChequesDisponibles cantChequesDisponibles;
    public CuentaCorrienteActualizada(CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta,SobreGiro sobreGiro, CantChequesDisponibles cantChequesDisponibles) {
        super("co.com.banco.event.CuentaCorrienteActualizada");
        this.cuentaCorrienteID = cuentaCorrienteID;
        this.numeroCuenta = numeroCuenta;
        this.sobreGiro = sobreGiro;
        this.cantChequesDisponibles = cantChequesDisponibles;
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
