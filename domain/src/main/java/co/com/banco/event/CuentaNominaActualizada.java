package co.com.banco.event;

import co.com.banco.entity.CuentaNomina;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaNominaActualizada extends DomainEvent {

    private final CuentaNominaID cuentaNominaID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final AnticipoPermitido anticipoPermitido;
    public CuentaNominaActualizada(CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta,
                                   Saldo saldo, InteresGenerado interesGenerado, AnticipoPermitido anticipoPermitido) {
        super("co.com.banco.event.CuentaNominaActualizada");
        this.cuentaNominaID = cuentaNominaID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.anticipoPermitido = anticipoPermitido;
    }

    public CuentaNominaID getNominaID() {
        return cuentaNominaID;
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
