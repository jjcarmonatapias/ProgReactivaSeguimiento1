package controller;

import com.tarjetas.tarjetas.controller.TarjetahabienteController;
import com.tarjetas.tarjetas.models.Tarjetahabiente;
import com.tarjetas.tarjetas.service.TarjetahabienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TarjetahabienteControllerTest {

    @Mock
    private TarjetahabienteService tarjetahabienteService;

    @InjectMocks
    private TarjetahabienteController tarjetahabienteController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsultarTarjetahabienteExitosos(){
        Tarjetahabiente cliente1 = new Tarjetahabiente(1,"1020", "cedula", "John", "cliente");
        Tarjetahabiente cliente2 = new Tarjetahabiente(2,"1021", "cedula", "Jairo", "cliente");
        Flux<Tarjetahabiente> tarjetahabienteEsperados = Flux.just(cliente1, cliente2);

        //se mockea la respuesta del service
        Mockito.when(tarjetahabienteService.findAll()).thenReturn(tarjetahabienteEsperados);

        Flux<Tarjetahabiente> resultado = tarjetahabienteController.consultarTarjetahabientes();
        resultado.subscribe();
        assertEquals(tarjetahabienteEsperados, resultado);
    }
}
