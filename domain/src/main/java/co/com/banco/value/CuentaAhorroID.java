package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

import javax.management.StringValueExp;

public class CuentaAhorroID extends Identity {
    public CuentaAhorroID(String value) {
        super(value);
    }

    public CuentaAhorroID() {}

    public static CuentaAhorroID of(String value) {
        return new CuentaAhorroID(value);
    }
}
