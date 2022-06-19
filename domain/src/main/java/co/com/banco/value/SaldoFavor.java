package co.com.banco.value;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SaldoFavor implements ValueObject<SaldoFavor> {

    private final SaldoFavor value;

    public SaldoFavor(SaldoFavor value) {
        this.value = Objects.requireNonNull(value);
    }

    public SaldoFavor value() {
        return value;
    }

}
