package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorCuota implements ValueObject<String> {
    private final String value;

    public ValorCuota(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static ValorCuota of(String value) {
        return new ValorCuota(value);
    }
    public String value() {
        return value;
    }
}
