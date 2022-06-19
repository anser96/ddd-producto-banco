package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCuota implements ValueObject<NumeroCuota> {
    private final NumeroCuota value;

    public NumeroCuota(NumeroCuota value) {
        this.value = Objects.requireNonNull(value);
    }

    public NumeroCuota value() {
        return value;
    }
}
