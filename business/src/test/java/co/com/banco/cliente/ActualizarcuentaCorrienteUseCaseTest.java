package co.com.banco.cliente;

import co.com.banco.command.ActualizarCuentaAhorro;
import co.com.banco.command.ActualizarCuentaCorriente;
import co.com.banco.event.*;
import co.com.banco.usecase.ActualizarCuentaAhorroUseCase;
import co.com.banco.usecase.ActualizarCuentaCorrienteUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ActualizarcuentaCorrienteUseCaseTest {
    @InjectMocks
    private ActualizarCuentaCorrienteUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarCuentaCorriente(){

        //arrange
        var cuentaID = CuentaID.of("11");
        var cuentaCorrienteID = CuentaCorrienteID.of("CCorriente-15");
        var numeroCuenta = NumeroCuenta.of("123456789");
        var sobregiro = SobreGiro.of("150000");
        var cantidadCheques = CantChequesDisponibles.of("6");



        var command = new ActualizarCuentaCorriente(cuentaID, cuentaCorrienteID, numeroCuenta, sobregiro,
                cantidadCheques);

        when(repository.getEventsBy("11")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var eventos = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getCuentaID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var cuentaCorrienteActualizada = (CuentaCorrienteActualizada)eventos.get(0);
        Assertions.assertEquals("11", cuentaCorrienteActualizada.aggregateRootId());
        Assertions.assertEquals("123456789", cuentaCorrienteActualizada.getNumeroCuenta().value());
        Assertions.assertEquals("CCorriente-15", cuentaCorrienteActualizada.getCuentaCorrienteID().value());
    }

    private List<DomainEvent> history() {

        var cuentaCorrienteID = CuentaCorrienteID.of("CF12");
        var numeroCuenta = NumeroCuenta.of("545454");
        var evento = new CuentaCorrienteCreated(
                cuentaCorrienteID,
                numeroCuenta
        );
        evento.setAggregateRootId("Root");
        return List.of(evento);
    }
}
