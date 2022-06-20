package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CupoDisponible implements ValueObject<String> {
    private final String value;

    public CupoDisponible(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el campo nmo debe estar en blanco");
        }
    }


    public static CupoDisponible of(String value) {
        return new CupoDisponible(value);
    }

    public String value() {
        return value;
    }
}
