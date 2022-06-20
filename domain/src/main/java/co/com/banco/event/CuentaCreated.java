package co.com.banco.event;

import co.com.banco.value.CuentaAhorroID;
import co.com.banco.value.CuentaCorrienteID;
import co.com.banco.value.CuentaNominaID;
import co.com.banco.value.NumeroCuenta;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaCreated extends DomainEvent {
    private final CuentaCorrienteID cuentaCorrienteID;
    private final CuentaNominaID cuentaNominaID;
    private final CuentaAhorroID cuentaAhorroID;

    public CuentaCreated(CuentaCorrienteID cuentaCorrienteID, CuentaNominaID cuentaNominaID, CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta) {
        super("cuenta");
        this.cuentaAhorroID = cuentaAhorroID;
        this.cuentaCorrienteID = cuentaCorrienteID;
        this.cuentaNominaID = cuentaNominaID;
    }

    public CuentaCorrienteID getCuentaCorrienteID() {
        return cuentaCorrienteID;
    }

    public CuentaNominaID getCuentaNominaID() {
        return cuentaNominaID;
    }

    public CuentaAhorroID getCuentaAhorroID() {
        return cuentaAhorroID;
    }
}
