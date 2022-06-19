package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CuentaNomina extends Entity<CuentaNominaID> {
    protected NumeroCuenta numeroCuenta;
    protected Saldo saldo;
    protected InteresGenerado interesGenerado;
    protected AnticipoPermitido anticipoPermitido;

    public CuentaNomina(CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta, Saldo saldo, InteresGenerado interesGenerado,
                        AnticipoPermitido anticipoPermitido) {
        super(cuentaNominaID);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.anticipoPermitido = anticipoPermitido;
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
