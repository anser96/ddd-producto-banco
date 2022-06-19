package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CuentaCorrienteID extends Identity {
    private CuentaCorrienteID(String value) {
        super(value);
    }

    public CuentaCorrienteID() {}

    public static CuentaCorrienteID of(String value) {
        return new CuentaCorrienteID(value);
    }
}
