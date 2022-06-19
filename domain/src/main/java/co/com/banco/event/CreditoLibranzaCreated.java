package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoLibranzaCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;
    private final TotalDescuentoNomina totalDescuentoNomina;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreditoLibranzaCreated(NumeroCredito numeroCredito, TotalDescuentoNomina totalDescuentoNomina, MontoDesembolsado montoDesembolsado,
                                  NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super("co.com.banco.event.CreditoLibranzaCreated");
        this.numeroCredito = numeroCredito;
        this.totalDescuentoNomina = totalDescuentoNomina;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }

    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public TotalDescuentoNomina getTotalDescuentoNomina() {
        return totalDescuentoNomina;
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
