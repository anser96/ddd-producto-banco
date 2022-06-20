package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoCarteraCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;
    private final EntidadLiquidada entidadLiquidada;
    private final SaldoFavor saldoFavor;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreditoCarteraCreated(NumeroCredito numeroCredito, EntidadLiquidada entidadLiquidada, SaldoFavor saldoFavor,
                                 MontoDesembolsado montoDesembolsado, NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super("co.com.banco.event.CreditoCarteraCreated");
        this.numeroCredito = numeroCredito;
        this.entidadLiquidada = entidadLiquidada;
        this.saldoFavor = saldoFavor;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }


    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public EntidadLiquidada getEntidadLiquidada() {
        return entidadLiquidada;
    }

    public SaldoFavor getSaldoFavor() {
        return saldoFavor;
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
