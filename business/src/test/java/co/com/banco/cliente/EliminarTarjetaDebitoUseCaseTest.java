package co.com.banco.cliente;

import co.com.banco.event.*;
import co.com.banco.usecase.EliminarTarjetaCreditoUseCase;
import co.com.banco.usecase.EliminarTarjetaDebitoUseCase;
import co.com.banco.value.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
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
public class EliminarTarjetaDebitoUseCaseTest {
    @InjectMocks
    private EliminarTarjetaDebitoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void eliminarTarjetaDebito() {
        var tarjetaDebitoID = TarjetaDebitoID.of("12");
        var tarjetaID = TarjetaID.of("25");
        var numeroTarjeta = NumeroTarjeta.of("55555");
        var fecharVencimiento = FechaVencimiento.of("25/20/2025");
        var cvv = Cvv.of("025");
        var nombrePropietario = NombrePropietario.of("Arman");
        var saldo = Saldo.of("50000000");
        var franquicia = Franquicia.of("Visa");

        var evento = new TarjetaCuentaAhorroActualizada(tarjetaID, tarjetaDebitoID,
                numeroTarjeta, fecharVencimiento, cvv, saldo, nombrePropietario, franquicia);

        when(repository.getEventsBy("25")).thenReturn(history());
        useCase.addRepository(repository);
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(evento))
                .orElseThrow()
                .getDomainEvents();

        var tarjetaDebitoEliminada = (TarjetaDebitoEliminada)events.get(0);
        Assertions.assertEquals("12",tarjetaDebitoEliminada.getTarjetaDebitoID().value());
    }

    private List<DomainEvent> history() {

        var tarjetaDebitoID = TarjetaDebitoID.of("12");
        var numroTarjeta = NumeroTarjeta.of("545454");
        var evento = new TarjetaDebitoCreated(
                tarjetaDebitoID,
                numroTarjeta
        );
        evento.setAggregateRootId("Root");
        return List.of(evento);
    }
}
