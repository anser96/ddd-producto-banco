package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Saldo implements ValueObject<String> {
    private final String value;

    public Saldo(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("el saldo no debe estar en blanco");
        }
    }

    public static Saldo of(String value) {
        return new Saldo(value);
    }
    public String value() {
        return value;
    }
}
