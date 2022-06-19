package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CuentaID extends Identity {
    private CuentaID(String value) {
        super(value);
    }

    public CuentaID() {}

    public static CuentaID of(String vale){
        return new CuentaID(vale);
    }
}
