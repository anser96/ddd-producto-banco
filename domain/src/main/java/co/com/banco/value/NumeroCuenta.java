package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCuenta implements ValueObject<String> {
    private final String value;

    public NumeroCuenta(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("en numero de cuenta no debe estar en blanco");
        }
    }

    public static NumeroCuenta of(String value) {
        return new NumeroCuenta(value);
    }
    public String value() {
        return value;
    }

}
