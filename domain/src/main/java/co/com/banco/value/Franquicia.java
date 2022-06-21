package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Franquicia implements ValueObject<String> {
    private final String value;

    public  Franquicia(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.isBlank()) {
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static Franquicia of(String value) {
        return new Franquicia(value);
    }

    public String value() {
        return value;
    }
}
