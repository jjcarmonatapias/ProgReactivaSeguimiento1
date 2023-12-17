package controller;

import com.tarjetas.tarjetas.controller.VentaDigitalController;
import com.tarjetas.tarjetas.models.VentaDigital;
import com.tarjetas.tarjetas.service.VentaDigitalService;
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
public class VentaDigitalControllerTest {

    @Mock
    private VentaDigitalService ventaDigitalService;

    @InjectMocks
    private VentaDigitalController ventaDigitalController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsultarCuentasExitosos(){
        VentaDigital ventaDigital1 = new VentaDigital(1,"tajeta amex", "tajeta amex");
        VentaDigital ventaDigital2 = new VentaDigital(2,"tarjeta visa", "tarjeta visa");
        Flux<VentaDigital> ventasEsperadas = Flux.just(ventaDigital1, ventaDigital2);

        //se mockea la respuesta del service
        Mockito.when(ventaDigitalService.findAll()).thenReturn(ventasEsperadas);

        Flux<VentaDigital> resultado = ventaDigitalController.consultarVentasDigitales();
        resultado.subscribe();
        assertEquals(ventasEsperadas, resultado);
    }
}
