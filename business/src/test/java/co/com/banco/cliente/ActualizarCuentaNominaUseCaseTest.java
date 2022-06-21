package co.com.banco.cliente;

import co.com.banco.command.ActualizarCuentaAhorro;
import co.com.banco.command.ActualizarCuentaNomina;
import co.com.banco.event.CuentaAhorroActualizada;
import co.com.banco.event.CuentaAhorroCreated;
import co.com.banco.event.CuentaNominaActualizada;
import co.com.banco.event.CuentaNominaCreated;
import co.com.banco.usecase.ActualizarCuentaNominaUseCase;
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
public class ActualizarCuentaNominaUseCaseTest {
    @InjectMocks
    private ActualizarCuentaNominaUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarCuentaNomina(){

        //arrange
        var cuentaID = CuentaID.of("11");
        var cuentaNominaID = CuentaNominaID.of("CNom-15");
        var numeroCuenta = NumeroCuenta.of("123456789");
        var saldo = Saldo.of("150000");
        var interesGenerado = InteresGenerado.of("0.6");
        var anticipo = AnticipoPermitido.of("6000");



        var command = new ActualizarCuentaNomina(cuentaID, cuentaNominaID, numeroCuenta, saldo,
                interesGenerado, anticipo);

        when(repository.getEventsBy("11")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var eventos = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getCuentaID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var cuentaNominaActualizada = (CuentaNominaActualizada)eventos.get(0);
        Assertions.assertEquals("11", cuentaNominaActualizada.aggregateRootId());
        Assertions.assertEquals("123456789", cuentaNominaActualizada.getNumeroCuenta().value());
        Assertions.assertEquals("CNom-15", cuentaNominaActualizada.getNominaID().value());
    }

    private List<DomainEvent> history() {

        var cuentaNominaID = CuentaNominaID.of("CF12");
        var numeroCuenta = NumeroCuenta.of("545454");
        var evento = new CuentaNominaCreated(
                cuentaNominaID,
                numeroCuenta
        );
        evento.setAggregateRootId("Root");
        return List.of(evento);
    }
}
