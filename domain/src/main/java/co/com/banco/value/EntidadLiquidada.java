package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EntidadLiquidada implements ValueObject<EntidadLiquidada> {
    private final EntidadLiquidada value;

    public EntidadLiquidada(EntidadLiquidada value) {
        this.value = Objects.requireNonNull(value);
    }

    public EntidadLiquidada value() {
        return value;
    }
}
