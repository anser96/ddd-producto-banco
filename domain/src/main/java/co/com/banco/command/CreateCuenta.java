package co.com.banco.command;

import co.com.banco.value.CuentaAhorroID;
import co.com.banco.value.CuentaCorrienteID;
import co.com.banco.value.CuentaNominaID;
import co.com.sofka.domain.generic.Command;

public class CreateCuenta extends Command {
    private final CuentaAhorroID cuentaAhorroID;
    private final CuentaNominaID cuentaNominaID;
    private final CuentaCorrienteID cuentaCorrienteID;

    public CreateCuenta(CuentaAhorroID cuentaAhorroID, CuentaNominaID cuentaNominaID,
                        CuentaCorrienteID cuentaCorrienteID) {
        this.cuentaAhorroID = cuentaAhorroID;
        this.cuentaNominaID = cuentaNominaID;
        this.cuentaCorrienteID = cuentaCorrienteID;
    }

    public CuentaAhorroID getCuentaAhorroID() {
        return cuentaAhorroID;
    }

    public CuentaNominaID getCuentaNominaID() {
        return cuentaNominaID;
    }

    public CuentaCorrienteID getCuentaCorrienteID() {
        return cuentaCorrienteID;
    }
}
