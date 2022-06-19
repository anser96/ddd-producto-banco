package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CreditoLibranzaID extends Identity {
    private CreditoLibranzaID(String value) {
        super(value);
    }

    public CreditoLibranzaID() {}

    public static CreditoLibranzaID of(String value) {
        return new CreditoLibranzaID(value);
    }
}
