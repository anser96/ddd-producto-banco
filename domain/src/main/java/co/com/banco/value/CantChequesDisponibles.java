package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantChequesDisponibles implements ValueObject<String> {
    private final String value;

    public CantChequesDisponibles(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static CantChequesDisponibles of(String value) {
        return new CantChequesDisponibles(value);
    }
    public String value() {
        return value;
    }
}
