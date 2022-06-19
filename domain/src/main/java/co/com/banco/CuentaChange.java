package co.com.banco;

import co.com.banco.event.CuentaCreated;
import co.com.sofka.domain.generic.EventChange;

public class CuentaChange extends EventChange {
    public CuentaChange(Cuenta cuenta) {
        apply((CuentaCreated event) ->{
            cuenta.cuentaAhorroID = event.getCuentaAhorroID();
            cuenta.cuentaCorrienteID = event.getCuentaCorrienteID();
            cuenta.cuentaNominaID = event.getCuentaNominaID();
        });
    }
}
