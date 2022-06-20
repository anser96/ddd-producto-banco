package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class ActualizarCuentaAhorro extends Command {
    private final CuentaID cuentaID;
    private final CuentaAhorroID cuentaAhorroID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final NumeroRetirosGratis numeroRetirosGratis;
    private final TipoCuenta tipoCuenta;

    public ActualizarCuentaAhorro(CuentaID cuentaID, CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado, NumeroRetirosGratis numeroRetirosGratis, TipoCuenta tipoCuenta) {
        this.cuentaID = cuentaID;
        this.cuentaAhorroID = cuentaAhorroID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numeroRetirosGratis = numeroRetirosGratis;
        this.tipoCuenta = tipoCuenta;
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

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }
}
