package co.com.banco;

import co.com.banco.entity.CuentaAhorro;
import co.com.banco.entity.CuentaCorriente;
import co.com.banco.entity.CuentaNomina;
import co.com.banco.event.*;
import co.com.banco.value.TipoCuenta;
import co.com.sofka.domain.generic.EventChange;

public class CuentaChange extends EventChange {
    public CuentaChange(Cuenta cuenta) {
        apply((CuentaAhorroCreated event) ->{
            cuenta.numeroCuenta = event.getNumeroCuenta();
            cuenta.cuentaAhorro = new CuentaAhorro(event.getCuentaAhorroID(), new TipoCuenta(TipoCuenta.Tipo.Cuenta_Ahorro), event.getNumeroCuenta());
        });

        apply((CuentaCorrienteCreated event) -> {
            cuenta.numeroCuenta = event.getNumeroCuenta();
            cuenta.cuentaCorriente = new CuentaCorriente(event.getCuentaCorrienteID(), event.getNumeroCuenta());
        });

        apply((CuentaNominaCreated event) -> {
            cuenta.numeroCuenta = event.getNumeroCuenta();
            cuenta.cuentaNomina = new CuentaNomina(event.getCuentaNominaID(), event.getNumeroCuenta());
        });

        apply((CuentaNominaActualizada event) -> {
            var cuentaNominaID = event.getNominaID();
            var numero = event.getNumeroCuenta();
            var saldo = event.getSaldo();
            var interes = event.getInteresGenerado();
            var anticipo = event.getAnticipoPermitido();
            cuenta.cuentaNomina = new CuentaNomina(cuentaNominaID,numero, saldo, interes, anticipo);
        });

        apply((CuentaCorrienteActualizada event) -> {
            var cuentaCorrienteID = event.getCuentaCorrienteID();
            var numero = event.getNumeroCuenta();
            var sobregiro = event.getSobreGiro();
            var cheques = event.getCantChequesDisponibles();
            cuenta.cuentaCorriente = new CuentaCorriente(cuentaCorrienteID,numero, sobregiro, cheques);
        });

        apply((CuentaAhorroActualizada event) -> {
            var cuentaAhorroID = event.getCuentaAhorroID();
            var numero = event.getNumeroCuenta();
            var saldo = event.getSaldo();
            var interes = event.getInteresGenerado();
            var numeroretiros = event.getNumeroRetirosGratis();
            cuenta.cuentaAhorro = new CuentaAhorro(cuentaAhorroID,numero, saldo, interes, numeroretiros);
        });

        apply((TarjetaDebitoEliminada evento) ->{

            cuenta.cuentaCorriente = null;

        });


    }
}
