package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateCreditoLIversion extends Command {
    private final CreditoID creditoID;
    private final CreditoLInversionID creditoLInversionID;
    private final NumeroCredito numeroCredito;
    private final ValorSeguroDeuda valorSeguroDeuda;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreateCreditoLIversion(CreditoID creditoID, CreditoLInversionID creditoLInversionID,
                                  NumeroCredito numeroCredito, ValorSeguroDeuda valorSeguroDeuda, MontoDesembolsado montoDesembolsado,
                                  NumeroCuota numeroCuota, ValorCuota valorCuota) {
        this.creditoID = creditoID;
        this.creditoLInversionID = creditoLInversionID;
        this.numeroCredito = numeroCredito;
        this.valorSeguroDeuda = valorSeguroDeuda;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }

    public CreditoID getCreditoID() {
        return creditoID;
    }

    public CreditoLInversionID getCreditoLInversionID() {
        return creditoLInversionID;
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
