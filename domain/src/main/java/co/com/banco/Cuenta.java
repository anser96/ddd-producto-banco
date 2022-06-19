package co.com.banco;

import co.com.banco.event.CuentaCreated;
import co.com.banco.value.CuentaAhorroID;
import co.com.banco.value.CuentaCorrienteID;
import co.com.banco.value.CuentaID;
import co.com.banco.value.CuentaNominaID;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cuenta extends AggregateEvent<CuentaID> {
    protected CuentaID cuentaID;
    protected CuentaAhorroID cuentaAhorroID;
    protected CuentaNominaID cuentaNominaID;
    protected CuentaCorrienteID cuentaCorrienteID;
    public Cuenta(CuentaID cuentaID, CuentaAhorroID cuentaAhorroID, CuentaNominaID cuentaNominaID,
                  CuentaCorrienteID cuentaCorrienteID) {
        super(cuentaID);
        subscribe(new CuentaChange(this));
        appendChange(new CuentaCreated(cuentaCorrienteID, cuentaNominaID, cuentaAhorroID));
    }
}
