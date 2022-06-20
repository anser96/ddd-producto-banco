package co.com.banco;

import co.com.banco.entity.CuentaAhorro;
import co.com.banco.event.CuentaAhorroCreated;
import co.com.banco.event.CuentaCreated;
import co.com.banco.value.TipoCuenta;
import co.com.sofka.domain.generic.EventChange;

public class CuentaChange extends EventChange {
    public CuentaChange(Cuenta cuenta) {
        apply((CuentaAhorroCreated event) ->{
            cuenta.numeroCuenta = event.getNumeroCuenta();
            cuenta.cuentaAhorro = new CuentaAhorro(event.getCuentaAhorroID(), new TipoCuenta(TipoCuenta.Tipo.Cuenta_Ahorro), event.getNumeroCuenta());
        });
    }
}
