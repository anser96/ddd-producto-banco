package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class TarjetaID extends Identity {
    public TarjetaID(String vale) {
        super(vale);
    }

    public TarjetaID() {}

    public static TarjetaID of(String value) {
        return new TarjetaID(value);
    }
}
