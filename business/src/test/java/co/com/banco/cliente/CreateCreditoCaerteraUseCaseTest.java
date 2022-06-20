package co.com.banco.cliente;

import co.com.banco.command.CreateCreditoCartera;
import co.com.banco.command.CreateCreditoLIversion;
import co.com.banco.event.CreditoCarteraCreated;
import co.com.banco.event.CreditoLibranzaCreated;
import co.com.banco.usecase.CreateCreditoCarteraUseCase;
import co.com.banco.usecase.CreateCreditoLInversionUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCreditoCaerteraUseCaseTest {
    private CreateCreditoCarteraUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateCreditoCarteraUseCase();
    }

    @Test
    void createCreditoCartera(){
        //arrange
        var creditoCarteraID = new CreditoCarteraID("15");
        var creditoID = new CreditoID("96");
        var numeroCredito = new NumeroCredito("1111212121");
        var entidadLiquidada = new EntidadLiquidada("coomeva");
        var saldoFavor = new SaldoFavor("410000");
        var montoDesembolsado = new MontoDesembolsado("5550000000");
        var numeroCuota = new NumeroCuota("36");
        var valorCuota = new ValorCuota("36000");

        var command = new CreateCreditoCartera(creditoID, creditoCarteraID,numeroCredito,entidadLiquidada,
                saldoFavor,montoDesembolsado, numeroCuota,valorCuota);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var creditoCarteraCreated = (CreditoCarteraCreated)event.get(0);
        Assertions.assertEquals("96",creditoCarteraCreated.aggregateRootId());
    }
}
