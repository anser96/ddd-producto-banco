package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaldoRecargado implements ValueObject<String> {
    private final String value;

    public SaldoRecargado(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el cmapo no debe estar en blanco");
        }
    }

    public static SaldoRecargado of(String value) {
        return new SaldoRecargado(value);
    }

    public String value() {
        return value;
    }
}
