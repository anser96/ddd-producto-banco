package co.com.banco.cliente;

import co.com.banco.command.ActualizarCuentaAhorro;
import co.com.banco.event.CuentaAhorroActualizada;
import co.com.banco.event.CuentaAhorroCreated;
import co.com.banco.usecase.ActualizarCuentaAhorroUseCase;
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
public class ActualizarCuentaAhorroUseCaseTest {
    @InjectMocks
    private ActualizarCuentaAhorroUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void actualizarCuentaAhorro(){

        //arrange
        var cuentaID = CuentaID.of("11");
        var cuentaAhorroID = CuentaAhorroID.of("CAhorro-15");
        var numeroCuenta = NumeroCuenta.of("123456789");
        var saldo = Saldo.of("150000");
        var interesGenerado = InteresGenerado.of("0.6");
        var numeroRetirosGratis = NumeroRetirosGratis.of("6");
        var tipoCuenta = TipoCuenta.of(TipoCuenta.Tipo.Cuenta_Ahorro);


        var command = new ActualizarCuentaAhorro(cuentaID, cuentaAhorroID, numeroCuenta, saldo,
                interesGenerado, numeroRetirosGratis, tipoCuenta);

        when(repository.getEventsBy("11")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var eventos = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getCuentaID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var cuentaAhorroActualizada = (CuentaAhorroActualizada)eventos.get(0);
        Assertions.assertEquals("11", cuentaAhorroActualizada.aggregateRootId());
        Assertions.assertEquals("123456789", cuentaAhorroActualizada.getNumeroCuenta().value());
        Assertions.assertEquals("CAhorro-15", cuentaAhorroActualizada.getCuentaAhorroID().value());
    }

    private List<DomainEvent> history() {

        var cuentaAhorroID = CuentaAhorroID.of("CF12");
        var numeroCuenta = NumeroCuenta.of("545454");
        var evento = new CuentaAhorroCreated(
                cuentaAhorroID,
                numeroCuenta
        );
        evento.setAggregateRootId("Root");
        return List.of(evento);
    }

}
