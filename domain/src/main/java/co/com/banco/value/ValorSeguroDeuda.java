package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorSeguroDeuda implements ValueObject<String> {
    private final String value;

    public ValorSeguroDeuda(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()){
            throw new IllegalArgumentException("el campo no debe estar en blanco");
        }
    }
    public static ValorSeguroDeuda of(String value) {
        return new ValorSeguroDeuda(value);
    }


    public String value() {
        return value;
    }
}
