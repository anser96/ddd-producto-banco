package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCuenta implements ValueObject<NumeroCuenta> {
    private final NumeroCuenta value;

    public NumeroCuenta(NumeroCuenta value) {
        this.value = Objects.requireNonNull(value);
    }

    public NumeroCuenta value() {
        return value;
    }

}
