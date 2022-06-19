package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cvv implements ValueObject<Cvv> {
    private final Cvv value;

    public Cvv(Cvv value) {
        this.value = Objects.requireNonNull(value);
    }

    public Cvv value() {
        return value;
    }
}
