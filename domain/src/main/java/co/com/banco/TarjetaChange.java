package co.com.banco;

import co.com.banco.event.TarjetaCreated;
import co.com.sofka.domain.generic.EventChange;

public class TarjetaChange extends EventChange {
    public TarjetaChange(Tarjeta tarjeta) {
        apply((TarjetaCreated event) -> {
            tarjeta.tarjetaCreditoID = event.getTarjetaCreditoID();
            tarjeta.tarjetaDebitoID = event.getTarjetaDebitoID();
            tarjeta.tarjetaEPrepagoID = event.getTarjetaEPrepagoID();
        });
    }
}
