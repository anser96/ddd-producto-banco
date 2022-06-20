package co.com.banco;

import co.com.banco.event.CreditoCreated;
import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Credito extends AggregateEvent<CreditoID> {
    protected CreditoID creditoID;
    protected CreditoCarteraID creditoCarteraID;
    protected CreditoLibranzaID creditoLibranzaID;
    protected CreditoLInversionID creditoLInversionID;

    public Credito(CreditoID creditoID, CreditoLibranzaID creditoLibranzaID, CreditoCarteraID creditoCarteraID,
                   CreditoLInversionID creditoLInversionID) {
        super(creditoID);
        subscribe(new CreditoChange(this));
        appendChange(new CreditoCreated(creditoLibranzaID, creditoCarteraID, creditoLInversionID));
    }
}
