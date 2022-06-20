package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateCuentaAhorro extends Command {

    private final CuentaAhorroID cuentaAhorroID;

    private final CuentaID cuentaID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final NumeroRetirosGratis numeroRetirosGratis;

    public CreateCuentaAhorro(CuentaID cuentaID, CuentaAhorroID cuentaAhorroID,NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado,
                              NumeroRetirosGratis numeroRetirosGratis) {
        this.cuentaID = cuentaID;
        this.cuentaAhorroID = cuentaAhorroID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numeroRetirosGratis = numeroRetirosGratis;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }
    public CuentaAhorroID getCuentaAhorroID() {
        return cuentaAhorroID;
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

    public NumeroRetirosGratis getNumeroRetirosGratis() {
        return numeroRetirosGratis;
    }
}
