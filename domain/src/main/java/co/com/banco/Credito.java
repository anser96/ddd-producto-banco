package co.com.banco;

import co.com.banco.event.*;
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

    public Credito(CreditoID creditoID, CreditoLibranzaID creditoLibranzaID, NumeroCredito numeroCredito ) {
        super(creditoID);
        appendChange(new CreditoLibranzaCreated(creditoLibranzaID, numeroCredito)).apply();
        subscribe(new CreditoChange(this));
    }

    public Credito(CreditoID creditoID, CreditoCarteraID creditoCarteraID, NumeroCredito numeroCredito ) {
        super(creditoID);
        appendChange(new CreditoCarteraCreated(creditoCarteraID, numeroCredito)).apply();
        subscribe(new CreditoChange(this));
    }

    public Credito(CreditoID creditoID, CreditoLInversionID creditoLInversionID, NumeroCredito numeroCredito ) {
        super(creditoID);
        appendChange(new CreditoLibreInversionCreated(creditoLInversionID, numeroCredito)).apply();
        subscribe(new CreditoChange(this));
    }

}
