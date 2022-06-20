package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CuentaNominaID extends Identity {
    public CuentaNominaID(String value) {
        super(value);
    }

    public CuentaNominaID() {}

    public static CuentaNominaID of(String value) {
        return new CuentaNominaID(value);
    }
}
