package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePropietario implements ValueObject<NombrePropietario> {
    private final NombrePropietario value;

    public NombrePropietario(NombrePropietario value) {
        this.value = Objects.requireNonNull(value);
    }

    public  NombrePropietario value() {
        return value;
    }
}
