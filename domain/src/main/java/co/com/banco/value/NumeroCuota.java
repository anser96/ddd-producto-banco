package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCuota implements ValueObject<String> {
    private final String value;

    public NumeroCuota(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static NumeroCuota of(String value) {
        return new NumeroCuota(value);
    }
    public String value() {
        return value;
    }
}
