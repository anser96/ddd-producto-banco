package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantChequesDisponibles implements ValueObject<CantChequesDisponibles> {
    private final CantChequesDisponibles value;

    public CantChequesDisponibles(CantChequesDisponibles value) {
        this.value = Objects.requireNonNull(value);
    }

    public CantChequesDisponibles value() {
        return value;
    }
}
