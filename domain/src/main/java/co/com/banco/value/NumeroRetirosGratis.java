package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroRetirosGratis implements ValueObject<String> {
    private final String value;

    public NumeroRetirosGratis(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()) {
            throw new IllegalArgumentException("en numero de cuenta no debe estar en blanco");
        }
    }

    public static NumeroRetirosGratis of(String value) {
        return new NumeroRetirosGratis(value);
    }

    public String value() {
        return value;
    }
}
