package co.com.banco.event;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoLibranzaCreated extends DomainEvent {
    private final NumeroCredito numeroCredito;

    private final CreditoLibranzaID creditoLibranzaID;


    public CreditoLibranzaCreated(CreditoLibranzaID creditoLibranzaID, NumeroCredito numeroCredito) {
        super("co.com.banco.event.CreditoLibranzaCreated");
        this.numeroCredito = numeroCredito;
        this.creditoLibranzaID = creditoLibranzaID;
    }

    public NumeroCredito getNumeroCredito() {
        return numeroCredito;
    }

    public CreditoLibranzaID getCreditoLibranzaID() {
        return creditoLibranzaID;
    }
}
