package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaldoRecargado implements ValueObject<SaldoRecargado> {
    private final SaldoRecargado value;

    public SaldoRecargado(SaldoRecargado value) {
        this.value = Objects.requireNonNull(value);
    }

    public SaldoRecargado value() {
        return value;
    }
}
