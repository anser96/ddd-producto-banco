package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class CreateCuentaNomina extends Command {

    private final CuentaNominaID cuentaNominaID;
    private final CuentaID cuentaID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final AnticipoPermitido anticipoPermitido;

    public CreateCuentaNomina(CuentaID cuentaID ,CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta,
                              Saldo saldo, InteresGenerado interesGenerado, AnticipoPermitido anticipoPermitido) {
        this.cuentaID = cuentaID;
        this.cuentaNominaID = cuentaNominaID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.anticipoPermitido = anticipoPermitido;
    }

    public CuentaNominaID getCuentaNominaID() {
        return cuentaNominaID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
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
