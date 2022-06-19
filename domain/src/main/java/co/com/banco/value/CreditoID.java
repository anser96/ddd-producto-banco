package co.com.banco.value;


import co.com.banco.Credito;
import co.com.sofka.domain.generic.Identity;

public class CreditoID extends Identity {
    private CreditoID(String value) {
        super(value);
    }

    public CreditoID() {}

    public static CreditoID of(String value) {
        return new CreditoID(value);
    }
}
