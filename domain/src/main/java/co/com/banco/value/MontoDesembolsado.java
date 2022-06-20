package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MontoDesembolsado implements ValueObject<String> {
    private final String value;

    public MontoDesembolsado(String value) {
        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("el cmapo no debe estar en blanco");
        }
    }

    public static MontoDesembolsado of(String value) {
        return new MontoDesembolsado(value);
    }
    public String value() {
        return value;
    }
}
