package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CreditoCartera extends Entity<CreditoCarteraID> {
    protected NumeroCredito numeroCredito;
    protected EntidadLiquidada entidadLiquidada;
    protected SaldoFavor saldoFavor;
    protected MontoDesembolsado montoDesembolsado;
    protected NumeroCuota numeroCuota;
    protected ValorCuota valorCuota;

    public CreditoCartera(CreditoCarteraID creditoCarteraID, NumeroCredito numeroCredito, EntidadLiquidada entidadLiquidada,
                          SaldoFavor saldoFavor, MontoDesembolsado montoDesembolsado, NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super(creditoCarteraID);
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
