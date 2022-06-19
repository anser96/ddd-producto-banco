package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalDescuentoNomina implements ValueObject<TotalDescuentoNomina> {
    private final TotalDescuentoNomina value;

    public TotalDescuentoNomina(TotalDescuentoNomina value) {
        this.value = Objects.requireNonNull(value);
    }

    public  TotalDescuentoNomina value() {
        return value;
    }
}
