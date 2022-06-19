package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AnticipoPermitido implements ValueObject<AnticipoPermitido> {
    private final AnticipoPermitido value;

    public AnticipoPermitido(AnticipoPermitido value) {
        this.value = Objects.requireNonNull(value);
    }

    public AnticipoPermitido value() {
        return value;
    }
}
