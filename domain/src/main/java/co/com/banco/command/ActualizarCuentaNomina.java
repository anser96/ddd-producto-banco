package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class ActualizarCuentaNomina extends Command {

    private final CuentaID cuentaID;
    private final CuentaNominaID cuentaNominaID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final AnticipoPermitido anticipoPermitido;

    public ActualizarCuentaNomina(CuentaID cuentaID, CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta,
                                  Saldo saldo, InteresGenerado interesGenerado, AnticipoPermitido anticipoPermitido) {
        this.cuentaID = cuentaID;
        this.cuentaNominaID = cuentaNominaID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.anticipoPermitido = anticipoPermitido;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }

    public CuentaNominaID getCuentaNominaID() {
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
