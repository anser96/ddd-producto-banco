package co.com.banco.entity;

import co.com.banco.value.CantChequesDisponibles;
import co.com.banco.value.CuentaCorrienteID;
import co.com.banco.value.NumeroCuenta;
import co.com.banco.value.SobreGiro;
import co.com.sofka.domain.generic.Entity;

public class CuentaCorriente extends Entity<CuentaCorrienteID> {
    protected NumeroCuenta numeroCuenta;
    protected SobreGiro sobreGiro;
    protected CantChequesDisponibles cantChequesDisponibles;

    public CuentaCorriente(CuentaCorrienteID cuentaCorrienteID, NumeroCuenta numeroCuenta, SobreGiro sobreGiro,
                           CantChequesDisponibles cantChequesDisponibles) {
        super(cuentaCorrienteID);
        this.numeroCuenta = numeroCuenta;
        this.sobreGiro = sobreGiro;
        this.cantChequesDisponibles = cantChequesDisponibles;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public SobreGiro getSobreGiro() {
        return sobreGiro;
    }

    public CantChequesDisponibles getCantChequesDisponibles() {
        return cantChequesDisponibles;
    }
}
