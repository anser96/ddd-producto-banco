package co.com.banco.cliente;

import co.com.banco.command.CreateCreditoLIversion;
import co.com.banco.command.CreateCreditoLibranza;
import co.com.banco.entity.CreditoLInversion;
import co.com.banco.event.CreditoLibranzaCreated;
import co.com.banco.event.CreditoLibreInversionCreated;
import co.com.banco.usecase.CreateCreditoLInversionUseCase;
import co.com.banco.usecase.CreateCreditoLibranzaUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCreditoLInversionUseCaseTest {
    private CreateCreditoLInversionUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateCreditoLInversionUseCase();
    }

    @Test
    void createCreditoLInversion(){
        //arrange
        var creditoLInversionID = new CreditoLInversionID("15");
        var creditoID = new CreditoID("96");
        var numeroCredito = new NumeroCredito("1111212121");
        var valorSeguroDeuda = new ValorSeguroDeuda("410000");
        var montoDesembolsado = new MontoDesembolsado("5550000000");
        var numeroCuota = new NumeroCuota("36");
        var valorCuota = new ValorCuota("36000");

        var command = new CreateCreditoLIversion(creditoID, creditoLInversionID,numeroCredito,valorSeguroDeuda,
                montoDesembolsado, numeroCuota,valorCuota);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var creditoLInversionCreated = (CreditoLibreInversionCreated)event.get(0);
        Assertions.assertEquals("96",creditoLInversionCreated.aggregateRootId());
    }
}
