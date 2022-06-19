package co.com.banco;

import co.com.banco.event.CreditoCreated;
import co.com.banco.value.CreditoLibranzaID;
import co.com.sofka.domain.generic.EventChange;

public class CreditoChange extends EventChange {
    public CreditoChange(Credito credito) {
        apply((CreditoCreated event) -> {
            credito.creditoLibranzaID = event.getCreditoLibranzaID();
            credito.creditoCarteraID = event.getCreditoCarteraID();
            credito.creditoLInversionID = event.getCreditoLInversionID();

        });
    }
}
