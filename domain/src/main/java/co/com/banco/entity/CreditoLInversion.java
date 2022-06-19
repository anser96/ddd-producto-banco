package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CreditoLInversion extends Entity<CreditoLInversionID> {
    protected NumeroCredito numeroCredito;
    protected ValorSeguroDeuda valorSeguroDeuda;
    protected MontoDesembolsado montoDesembolsado;
    protected NumeroCuota numeroCuota;
    protected ValorCuota valorCuota;

    public CreditoLInversion(CreditoLInversionID creditoLInversionID, NumeroCredito numeroCredito, ValorSeguroDeuda valorSeguroDeuda,
                             MontoDesembolsado montoDesembolsado, NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super(creditoLInversionID);
        this.numeroCredito = numeroCredito;
        this.montoDesembolsado = montoDesembolsado;
        this.valorSeguroDeuda = valorSeguroDeuda;
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
