package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;


public class CreditoLibreInversionCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;
    private final CreditoLInversionID creditoLInversionID;

    public CreditoLibreInversionCreated(CreditoLInversionID creditoLInversionID, NumeroCredito numeroCredito) {
        super("co.com.banco.event.CreditoLibreInversionCreated");
        this.numeroCredito = numeroCredito;
        this.creditoLInversionID = creditoLInversionID;
    }

    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public CreditoLInversionID getCreditoLInversionID() {
        return creditoLInversionID;
    }
}
