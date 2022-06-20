package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroTarjeta implements ValueObject<String> {
    private final String value;

    public NumeroTarjeta(String value){
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static NumeroTarjeta of(String value) {
        return new NumeroTarjeta(value);
    }
    @Override
    public String value() {
        return value;
    }
}
