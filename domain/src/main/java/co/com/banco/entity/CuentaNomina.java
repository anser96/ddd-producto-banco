package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CuentaNomina extends Entity<CuentaNominaID> {
    protected CuentaNominaID cuentaNominaID;
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

    public CuentaNomina(CuentaNominaID cuentaNominaID, NumeroCuenta numeroCuenta) {
        super(cuentaNominaID);
        this.numeroCuenta = numeroCuenta;
    }

    public void actualizarCuentaNomina(CuentaNominaID cuentaNominaID, Saldo saldo, InteresGenerado interesGenerado,
                                       AnticipoPermitido anticipoPermitido) {
        this.cuentaNominaID = CuentaNominaID.of(cuentaNominaID.value());
        this.saldo = Saldo.of(saldo.value());
        this.interesGenerado = InteresGenerado.of(interesGenerado.value());
        this.anticipoPermitido = AnticipoPermitido.of(anticipoPermitido.value());
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
