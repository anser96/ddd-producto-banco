package co.com.banco.value;

import co.com.sofka.domain.generic.Identity;

public class CreditoLInversionID extends Identity {
    private CreditoLInversionID(String value) {
        super(value);
    }

    public CreditoLInversionID() {}

    public static  CreditoLInversionID of(String value) {
        return new CreditoLInversionID(value);
    }
}
