package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InteresGenerado implements ValueObject<String> {
    private final String value;

    public InteresGenerado(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("el interes generado no debe estar en blanco");
        }
    }

    public static InteresGenerado of(String value) {
        return new InteresGenerado(value);
    }

    public String value(){
        return value;
    }
}
