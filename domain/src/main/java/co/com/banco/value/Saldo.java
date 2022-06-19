package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Saldo implements ValueObject<Saldo> {
    private final Saldo value;

    public Saldo(Saldo value) {
        this.value = Objects.requireNonNull(value);
    }

    public Saldo value() {
        return value;
    }
}
