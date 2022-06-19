package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;


public class CreditoLibreInversionCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;
    private final ValorSeguroDeuda valorSeguroDeuda;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreditoLibreInversionCreated(NumeroCredito numeroCredito, ValorSeguroDeuda valorSeguroDeuda, MontoDesembolsado montoDesembolsado,
                                        NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super("co.com.banco.event.CreditoLibreInversionCreated");
        this.numeroCredito = numeroCredito;
        this.valorSeguroDeuda = valorSeguroDeuda;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }

    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public ValorSeguroDeuda getValorSeguroDeuda() {
        return valorSeguroDeuda;
    }

    public MontoDesembolsado getMontoDesembolsado() {
        return montoDesembolsado;
    }

    public NumeroCuota getNumeroCuota() {
        return numeroCuota;
    }

    public ValorCuota getValorCuota() {
        return valorCuota;
    }
}
