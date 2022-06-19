package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroTarjeta implements ValueObject<NumeroTarjeta> {
    private final NumeroTarjeta value;

    public NumeroTarjeta(NumeroTarjeta value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public NumeroTarjeta value() {
        return value;
    }
}
