package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Entity;

public class CreditoLibranza extends Entity<CreditoLibranzaID> {
    protected NumeroCredito numeroCredito;
    protected TotalDescuentoNomina totalDescuentoNomina;
    protected MontoDesembolsado montoDesembolsado;
    protected NumeroCuota numeroCuota;
    protected ValorCuota valorCuota;

    public CreditoLibranza(CreditoLibranzaID creditoLibranzaID, NumeroCredito numeroCredito, TotalDescuentoNomina totalDescuentoNomina,
                           MontoDesembolsado montoDesembolsado, NumeroCuota numeroCuota, ValorCuota valorCuota) {
        super(creditoLibranzaID);
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
