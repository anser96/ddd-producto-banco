package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AnticipoPermitido implements ValueObject<String> {
    private final String value;

    public AnticipoPermitido(String value) {
        this.value = Objects.requireNonNull(value);
    }

    public static AnticipoPermitido of(String value) {
        return new AnticipoPermitido(value);
    }

    public String value() {
        return value;
    }
}
