package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SobreGiro implements ValueObject<SobreGiro> {

    private final SobreGiro value;

    public SobreGiro(SobreGiro value) {
        this.value = Objects.requireNonNull(value);
    }

    public SobreGiro value(){
        return value;
    }
}
