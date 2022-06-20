package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePropietario implements ValueObject<String> {
    private final String value;

    public NombrePropietario(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static NombrePropietario of(String value) {
        return new NombrePropietario(value);
    }

    public  String value() {
        return value;
    }
}
