package co.com.banco.value;

import co.com.banco.TarjetaChange;
import co.com.sofka.domain.generic.Identity;

public class TarjetaEPrepagoID extends Identity {
    private TarjetaEPrepagoID(String value) {
        super(value);
    }

    public TarjetaEPrepagoID() {}

    public static  TarjetaEPrepagoID of(String value) {
        return new TarjetaEPrepagoID(value);
    }
}
