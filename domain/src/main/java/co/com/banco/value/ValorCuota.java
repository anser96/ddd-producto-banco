package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorCuota implements ValueObject<ValorCuota> {
    private final ValorCuota value;

    public ValorCuota(ValorCuota value) {
        this.value = Objects.requireNonNull(value);
    }

    public ValorCuota value() {
        return value;
    }
}
