package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaNominaCreated extends DomainEvent {

    private final CuentaNominaID cuentaNominaID;
    private final NumeroCuenta numeroCuenta;


    public CuentaNominaCreated(CuentaNominaID cuentaNominaID,NumeroCuenta numeroCuenta) {
        super("co.com.banco.event.CuentaNominaCreated");
        this.cuentaNominaID = cuentaNominaID;
        this.numeroCuenta = numeroCuenta;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public CuentaNominaID getCuentaNominaID() {
        return cuentaNominaID;
    }
}
