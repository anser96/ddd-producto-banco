package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCuenta implements ValueObject<TipoCuenta.Tipo> {
    private final Tipo tipoCuenta;

    public TipoCuenta(Tipo tipoCuenta) {
        this.tipoCuenta = Objects.requireNonNull(tipoCuenta);
    }

    public enum Tipo {
        Cuenta_Ahorro, Cuenta_Corriente, Cuenta_Nomina;
    }

    public static TipoCuenta of(Tipo tipoCuenta) {
        return new TipoCuenta(tipoCuenta);
    }

    public TipoCuenta.Tipo value() {
        return tipoCuenta;
    }
}
