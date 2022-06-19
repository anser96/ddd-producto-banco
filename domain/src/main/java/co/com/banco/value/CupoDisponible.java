package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CupoDisponible implements ValueObject<CupoDisponible> {
    private final CupoDisponible value;

    public CupoDisponible(CupoDisponible value) {
        this.value = Objects.requireNonNull(value);
    }

    public CupoDisponible value() {
        return value;
    }
}
