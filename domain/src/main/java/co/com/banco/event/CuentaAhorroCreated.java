package co.com.banco.event;

import co.com.banco.value.InteresGenerado;
import co.com.banco.value.NumeroCuenta;
import co.com.banco.value.NumeroRetirosGratis;
import co.com.banco.value.Saldo;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaAhorroCreated extends DomainEvent {
    private final NumeroCuenta numeroCuenta;
    private final Saldo saldo;
    private final InteresGenerado interesGenerado;
    private final NumeroRetirosGratis numRetiroGratis;

    public CuentaAhorroCreated(NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado,
                               NumeroRetirosGratis numRetiroGratis) {
        super("co.com.banco.event.CuentaAhorroCreated");
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numRetiroGratis = numRetiroGratis;
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

    public NumeroRetirosGratis getNumRetiroGratis() {
        return numRetiroGratis;
    }
}
