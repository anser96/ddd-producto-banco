package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoCarteraCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;

    private final CreditoCarteraID creditoCarteraID;

    public CreditoCarteraCreated(CreditoCarteraID creditoCarteraID, NumeroCredito numeroCredito) {
        super("co.com.banco.event.CreditoCarteraCreated");
        this.numeroCredito = numeroCredito;
        this.creditoCarteraID = creditoCarteraID;
    }


    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public CreditoCarteraID getCreditoCarteraID() {
        return creditoCarteraID;
    }
}
