package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCredito implements ValueObject<String> {
    private final String value;

    public NumeroCredito(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static NumeroCredito of(String value) {
        return new NumeroCredito(value);
    }
    public String value() {
        return value;
    }
}
