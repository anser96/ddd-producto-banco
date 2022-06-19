package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InteresGenerado implements ValueObject<InteresGenerado> {
    private final InteresGenerado value;

    public InteresGenerado(InteresGenerado value) {
        this.value = Objects.requireNonNull(value);
    }

    public InteresGenerado value(){
        return value;
    }
}
