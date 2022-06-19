package co.com.banco.event;

import co.com.banco.value.AnticipoPermitido;
import co.com.banco.value.InteresGenerado;
import co.com.banco.value.NumeroCuenta;
import co.com.banco.value.Saldo;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaNominaCreated extends DomainEvent {
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final AnticipoPermitido anticipoPermitido;

    public CuentaNominaCreated(NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado,
                               AnticipoPermitido anticipoPermitido) {
        super("co.com.banco.event.CuentaNominaCreated");
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.anticipoPermitido = anticipoPermitido;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public InteresGenerado getInteresGenerado() {
        return interesGenerado;
    }

    public AnticipoPermitido getAnticipoPermitido() {
        return anticipoPermitido;
    }
}
