package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCredito implements ValueObject<NumeroCredito> {
    private final NumeroCredito value;

    public NumeroCredito(NumeroCredito value) {
        this.value = Objects.requireNonNull(value);
    }

    public NumeroCredito value() {
        return value;
    }
}
