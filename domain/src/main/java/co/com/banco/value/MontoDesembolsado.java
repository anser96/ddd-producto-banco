package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MontoDesembolsado implements ValueObject<MontoDesembolsado> {
    private final MontoDesembolsado value;

    public MontoDesembolsado(MontoDesembolsado value) {
        this.value = Objects.requireNonNull(value);
    }

    public MontoDesembolsado value() {
        return value;
    }
}
