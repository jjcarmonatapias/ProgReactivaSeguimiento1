package controller;

import com.tarjetas.tarjetas.controller.TarjetaController;
import com.tarjetas.tarjetas.models.Tarjeta;
import com.tarjetas.tarjetas.service.TarjetaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TarjetaControllerTest {

    @Mock
    private TarjetaService tarjetaService;

    @InjectMocks
    private TarjetaController tarjetaController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsultarTarjetasExitosos(){
        Tarjeta tarjeta1 = new Tarjeta(1,"Mastercard", "Tarjeta Mastercard");
        Tarjeta tarjeta2 = new Tarjeta(2,"Visa", "Tarjeta Visa");
        Flux<Tarjeta> tarjetasEsperadas = Flux.just(tarjeta1, tarjeta2);

        //se mockea la respuesta del service
        Mockito.when(tarjetaService.findAll()).thenReturn(tarjetasEsperadas);

        Flux<Tarjeta> resultado = tarjetaController.consultarTarjetas();
        resultado.subscribe();
        assertEquals(tarjetasEsperadas, resultado);
    }

    @Test
    void testGuardarTarjetaExitoso(){
        Tarjeta tarjeta1 = new Tarjeta(1,"Mastercard", "Tarjeta Mastercard");
        Mono<Tarjeta> tarjetaEsperada = Mono.just(tarjeta1);

        //se mockea la respuesta del service
        Mockito.when(tarjetaService.save(tarjeta1)).thenReturn(tarjetaEsperada);

        Mono<Tarjeta> resultado = tarjetaController.crearTarjeta(tarjeta1);
        resultado.subscribe();
        assertEquals(tarjetaEsperada, resultado);
    }

    @Test
    void testConsultarTarjetaExitoso(){
        Tarjeta tarjeta1 = new Tarjeta(1,"Mastercard", "Tarjeta Mastercard");
        Mono<Tarjeta> tarjetaEsperada = Mono.just(tarjeta1);

        //se mockea la respuesta del service
        Mockito.when(tarjetaService.findById("1")).thenReturn(tarjetaEsperada);

        Mono<Tarjeta> resultado = tarjetaController.consultarTarjeta("1");
        resultado.subscribe();
        assertEquals(tarjetaEsperada, resultado);
    }
}
