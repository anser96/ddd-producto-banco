package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroRetirosGratis implements ValueObject<NumeroRetirosGratis> {
    private final NumeroRetirosGratis value;

    public NumeroRetirosGratis(NumeroRetirosGratis value) {
        this.value = Objects.requireNonNull(value);
    }

    public NumeroRetirosGratis value() {
        return value;
    }
}
