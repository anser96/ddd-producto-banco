package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CreditoCarteraID extends Identity {
    public CreditoCarteraID(String value) {
        super(value);
    }

    public CreditoCarteraID() {}

    public static CreditoCarteraID of(String value) {
        return new CreditoCarteraID(value);
    }
}
