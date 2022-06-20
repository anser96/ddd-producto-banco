package co.com.banco.command;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.Command;

public class CreateCreditoLibranza extends Command {
    private final CreditoID creditoID;
    private final CreditoLibranzaID creditoLibranzaID;
    private final NumeroCredito numeroCredito;
    private final TotalDescuentoNomina totalDescuentoNomina;
    private final MontoDesembolsado montoDesembolsado;
    private final NumeroCuota numeroCuota;
    private final ValorCuota valorCuota;

    public CreateCreditoLibranza(CreditoID creditoID, CreditoLibranzaID creditoLibranzaID, NumeroCredito numeroCredito,
                                 TotalDescuentoNomina totalDescuentoNomina, MontoDesembolsado montoDesembolsado,
                                 NumeroCuota numeroCuota, ValorCuota valorCuota) {
        this.creditoID = creditoID;
        this.creditoLibranzaID = creditoLibranzaID;
        this.numeroCredito = numeroCredito;
        this.totalDescuentoNomina = totalDescuentoNomina;
        this.montoDesembolsado = montoDesembolsado;
        this.numeroCuota = numeroCuota;
        this.valorCuota = valorCuota;
    }

    public CreditoID getCreditoID() {
        return creditoID;
    }

    public CreditoLibranzaID getCreditoLibranzaID() {
        return creditoLibranzaID;
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
