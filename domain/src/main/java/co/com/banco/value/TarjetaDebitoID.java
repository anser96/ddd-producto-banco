package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class TarjetaDebitoID extends Identity {
    public TarjetaDebitoID(String value) {
        super(value);
    }

    public TarjetaDebitoID() {}

    public static TarjetaDebitoID of(String value) {
        return new TarjetaDebitoID(value);
    }
}
