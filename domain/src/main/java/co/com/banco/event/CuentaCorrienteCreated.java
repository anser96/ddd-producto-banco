package co.com.banco.event;

import co.com.banco.value.CuentaCorrienteID;
import co.com.banco.value.NumeroCuenta;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCorrienteCreated extends DomainEvent {
    private final NumeroCuenta numeroCuenta;
    private final CuentaCorrienteID cuentaCorrienteID;

    public CuentaCorrienteCreated(CuentaCorrienteID cuentaCorrienteID,NumeroCuenta numeroCuenta) {
        super("co.com.banco.event.CuentaCorrienteCreated");
        this.cuentaCorrienteID = cuentaCorrienteID;
        this.numeroCuenta = numeroCuenta;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public CuentaCorrienteID getCuentaCorrienteID() {
        return cuentaCorrienteID;
    }
}
