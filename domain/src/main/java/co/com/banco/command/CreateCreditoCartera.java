package co.com.banco.command;

import co.com.banco.entity.CreditoCartera;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateCreditoCartera extends Command {

    private final CreditoID creditoID;
    private final CreditoCarteraID creditoCarteraID;
    private final NumeroCredito numeroCredito;
    private final EntidadLiquidada entidadLiquidada;
    private final SaldoFavor saldoFavor;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreateCreditoCartera(CreditoID creditoID, CreditoCarteraID creditoCarteraID, NumeroCredito numeroCredito,
                          EntidadLiquidada entidadLiquidada, SaldoFavor saldoFavor, MontoDesembolsado montoDesembolsado,
                          NumeroCuota numeroCuota, ValorCuota valorCuota) {
        this.creditoID = creditoID;
        this.creditoCarteraID = creditoCarteraID;
        this.numeroCredito = numeroCredito;
        this.entidadLiquidada = entidadLiquidada;
        this.saldoFavor = saldoFavor;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }

    public CreditoID getCreditoID() {
        return creditoID;
    }

    public CreditoCarteraID getCreditoCarteraID() {
        return creditoCarteraID;
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
