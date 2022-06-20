package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaldoFavor implements ValueObject<String> {

    private final String value;

    public SaldoFavor(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el cmapo no debe estar en blanco");
        }
    }

    public static SaldoFavor of(String value) {
        return new SaldoFavor(value);
    }
    public String value() {
        return value;
    }

}
