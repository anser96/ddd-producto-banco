package co.com.banco.entity;

import co.com.banco.value.*;
import co.com.sofka.domain.generic.AggregateEvent;


public class CuentaAhorro extends AggregateEvent<CuentaAhorroID> {
    protected CuentaAhorroID cuentaAhorroID;
    protected NumeroCuenta numeroCuenta;
    protected Saldo saldo;
    protected InteresGenerado interesGenerado;
    protected NumeroRetirosGratis numeroRetirosGratis;
    protected TipoCuenta tipoCuenta;


    public CuentaAhorro(CuentaAhorroID cuentaAhorroID) {
        super(cuentaAhorroID);
    }
    public CuentaAhorro(CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta, Saldo saldo,
                        InteresGenerado interesGenerado,
                        NumeroRetirosGratis numeroRetirosGratis) {
        super(cuentaAhorroID);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interesGenerado = interesGenerado;
        this.numeroRetirosGratis = numeroRetirosGratis;
    }

   public CuentaAhorro(CuentaAhorroID cuentaAhorroID, TipoCuenta tipoCuenta, NumeroCuenta numeroCuenta) {
        super(cuentaAhorroID);
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
   }

   public void actualizarCuentaAhorro(CuentaAhorroID cuentaAhorroID, NumeroCuenta numeroCuenta, Saldo saldo,
                                      InteresGenerado interesGenerado, NumeroRetirosGratis numeroRetirosGratis) {
        this.cuentaAhorroID = CuentaAhorroID.of(cuentaAhorroID.value());
        this.numeroCuenta = NumeroCuenta.of(numeroCuenta.value());
        this.saldo = Saldo.of(saldo.value());
        this.interesGenerado = InteresGenerado.of(interesGenerado.value());
        this.numeroRetirosGratis = NumeroRetirosGratis.of(numeroRetirosGratis.value());
   }
}
