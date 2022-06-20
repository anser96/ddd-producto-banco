package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cvv implements ValueObject<String > {
    private final String value;

    public Cvv(String value) {
        this.value = Objects.requireNonNull(value);
        throw new IllegalArgumentException("el campo no deebe estar en blanco");
    }

    public static Cvv of(String value) {
        return new Cvv(value);
    }

    public String value() {
        return value;
    }
}
