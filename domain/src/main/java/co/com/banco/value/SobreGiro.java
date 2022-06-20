package co.com.banco.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SobreGiro implements ValueObject<String> {

    private final String value;

    public SobreGiro(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("este campo no debe estar en blanco");
        }
    }

    public static SobreGiro of(String value){
        return new SobreGiro(value);
    }
    public String value(){
        return value;
    }
}
