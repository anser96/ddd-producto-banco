package co.com.banco.cliente;

import co.com.banco.command.CreateCreditoLibranza;
import co.com.banco.command.CreateTarjetaEPrepago;
import co.com.banco.event.CreditoLibranzaCreated;
import co.com.banco.event.TarjetaEPrepagoCreated;
import co.com.banco.usecase.CreateCreditoLibranzaUseCase;
import co.com.banco.usecase.CreateTarjetaEPrepagoUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateCreditoLibranzaUseCaseTest {
    private CreateCreditoLibranzaUseCase useCase;

    @BeforeEach
    public void setup() {
        useCase = new CreateCreditoLibranzaUseCase();
    }

    @Test
    void createCreditoLibranza(){
        //arrange
        var creditoLibranzaID = new CreditoLibranzaID("100");
        var creditoID = new CreditoID("56");
        var numeroCredito = new NumeroCredito("1111212121");
        var totalDescuentoNomina = new TotalDescuentoNomina("410000");
        var montoDesembolsado = new MontoDesembolsado("5550000000");
        var numeroCuota = new NumeroCuota("36");
        var valorCuota = new ValorCuota("36000");

        var command = new CreateCreditoLibranza(creditoID, creditoLibranzaID,numeroCredito,totalDescuentoNomina,
                montoDesembolsado, numeroCuota,valorCuota);

        //act
        var event = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var creditoLibranzaCreated = (CreditoLibranzaCreated)event.get(0);
        Assertions.assertEquals("9",creditoLibranzaCreated.aggregateRootId());
    }
}
