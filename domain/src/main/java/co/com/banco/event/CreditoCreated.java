package co.com.banco.event;

import co.com.banco.value.CreditoCarteraID;
import co.com.banco.value.CreditoLInversionID;
import co.com.banco.value.CreditoLibranzaID;
import co.com.sofka.domain.generic.DomainEvent;

public class CreditoCreated extends DomainEvent {
    private final CreditoLInversionID creditoLInversionID;
    private final CreditoCarteraID creditoCarteraID;
    private final CreditoLibranzaID creditoLibranzaID;

    public CreditoCreated(CreditoLibranzaID creditoLibranzaID, CreditoCarteraID creditoCarteraID,
                          CreditoLInversionID creditoLInversionID) {
        super("credito");
        this.creditoCarteraID = creditoCarteraID;
        this.creditoLInversionID = creditoLInversionID;
        this.creditoLibranzaID = creditoLibranzaID;
    }

    public CreditoLInversionID getCreditoLInversionID() {
        return creditoLInversionID;
    }

    public CreditoCarteraID getCreditoCarteraID() {
        return creditoCarteraID;
    }

    public CreditoLibranzaID getCreditoLibranzaID() {
        return creditoLibranzaID;
    }
}
