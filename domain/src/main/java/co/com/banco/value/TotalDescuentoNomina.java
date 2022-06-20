package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalDescuentoNomina implements ValueObject<String> {
    private final String value;

    public TotalDescuentoNomina(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }

    public static TotalDescuentoNomina of(String value) {
        return new TotalDescuentoNomina(value);
    }
    public  String value() {
        return value;
    }
}
