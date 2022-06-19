package co.com.banco.event;

import co.com.banco.value.CantChequesDisponibles;
import co.com.banco.value.NumeroCuenta;
import co.com.banco.value.SobreGiro;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCorrienteCreated extends DomainEvent {
    private final NumeroCuenta numeroCuenta;
    private final SobreGiro sobreGiro;
    private final CantChequesDisponibles cantChequesDisponibles;

    public CuentaCorrienteCreated(NumeroCuenta numeroCuenta, SobreGiro sobreGiro, CantChequesDisponibles cantChequesDisponibles) {
        super("co.com.banco.event.CuentaCorrienteCreated");
        this.numeroCuenta = numeroCuenta;
        this.sobreGiro = sobreGiro;
        this.cantChequesDisponibles = cantChequesDisponibles;
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
