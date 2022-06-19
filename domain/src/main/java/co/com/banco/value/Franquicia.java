package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Franquicia implements ValueObject<Franquicia> {
    private final Franquicia value;

    public  Franquicia(Franquicia value) {
        this.value = Objects.requireNonNull(value);
    }

    public Franquicia value() {
        return value;
    }
}
