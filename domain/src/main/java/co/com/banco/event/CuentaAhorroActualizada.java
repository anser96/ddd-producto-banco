package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaAhorroActualizada extends DomainEvent {

    private final CuentaAhorroID cuentaAhorroID;
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final NumeroRetirosGratis numeroRetirosGratis;
    public CuentaAhorroActualizada(CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado, NumeroRetirosGratis numeroRetirosGratis) {
        super("co.com.banco.event.CuentaAhorroActualizada");
        this.cuentaAhorroID = cuentaAhorroID;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numeroRetirosGratis = numeroRetirosGratis;
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
