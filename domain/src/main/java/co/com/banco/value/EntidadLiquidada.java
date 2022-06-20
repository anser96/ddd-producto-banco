package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EntidadLiquidada implements ValueObject<String> {
    private final String value;

    public EntidadLiquidada(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el cmapo no debe estar en blanco");
        }
    }

    public static EntidadLiquidada of(String value) {
        return new EntidadLiquidada(value);
    }
    public String value() {
        return value;
    }
}
