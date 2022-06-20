package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FechaVencimiento implements ValueObject<String> {
    private final String value;

    public FechaVencimiento(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.isBlank()) {
            throw new IllegalArgumentException("el cmapo no debe estar en blanco");
        }
    }


    public static FechaVencimiento of(String value) {
        return new FechaVencimiento(value);
    }
    public String value() {
        return value;
    }
}
