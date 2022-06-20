package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaAhorroCreated extends DomainEvent {
    private final CuentaAhorroID cuentaAhorroID;
    private final NumeroCuenta numeroCuenta;


    public CuentaAhorroCreated(CuentaAhorroID ahorroID, NumeroCuenta numeroCuenta) {
        super("co.com.banco.event.CuentaAhorroCreated");
        this.cuentaAhorroID = ahorroID;
        this.numeroCuenta = numeroCuenta;

    }



    public CuentaAhorroID getCuentaAhorroID() {
        return cuentaAhorroID;
    }


    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

}
