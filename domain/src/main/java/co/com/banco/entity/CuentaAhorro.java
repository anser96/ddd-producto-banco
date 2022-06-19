package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CuentaAhorro extends Entity<CuentaAhorroID> {
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final NumeroRetirosGratis numeroRetirosGratis;

    public CuentaAhorro(CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado,
                        NumeroRetirosGratis numeroRetirosGratis) {
        super(cuentaAhorroID);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numeroRetirosGratis = numeroRetirosGratis;
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
