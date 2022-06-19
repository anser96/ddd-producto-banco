package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FechaVencimiento implements ValueObject<FechaVencimiento> {
    private final FechaVencimiento value;

    public FechaVencimiento(FechaVencimiento value) {
        this.value = Objects.requireNonNull(value);
    }

    public FechaVencimiento value() {
        return value;
    }
}
