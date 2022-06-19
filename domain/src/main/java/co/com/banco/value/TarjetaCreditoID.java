package co.com.banco.value;

import co.com.banco.TarjetaChange;
import co.com.sofka.domain.generic.Identity;

public class TarjetaCreditoID extends Identity {
    private TarjetaCreditoID(String value) {
        super(value);
    }

    public TarjetaCreditoID() {}

    public static TarjetaCreditoID of(String value) {
        return new TarjetaCreditoID(value);
    }
}
