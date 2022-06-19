package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorSeguroDeuda implements ValueObject<ValorSeguroDeuda> {
    private final ValorSeguroDeuda value;

    public ValorSeguroDeuda(ValorSeguroDeuda value) {
        this.value = Objects.requireNonNull(value);
    }

    public ValorSeguroDeuda value() {
        return value;
    }
}
