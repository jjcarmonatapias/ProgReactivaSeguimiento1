package controller;

import com.tarjetas.tarjetas.controller.CuentaController;
import com.tarjetas.tarjetas.models.Cuenta;
import com.tarjetas.tarjetas.service.CuentaService;
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
public class CuentaControllerTest {

    @Mock
    private CuentaService cuentaService;

    @InjectMocks
    private CuentaController cuentaController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConsultarCuentasExitosos(){
        Cuenta cuenta1 = new Cuenta(1,"1020", "Ahorros", "Cuenta de ahorros");
        Cuenta cuenta2 = new Cuenta(1,"1020", "Ahorros", "Cuenta de ahorros");
        Flux<Cuenta> cuentasEsperadas = Flux.just(cuenta1, cuenta2);

        //se mockea la respuesta del service
        Mockito.when(cuentaService.findAll()).thenReturn(cuentasEsperadas);

        Flux<Cuenta> resultado = cuentaController.consultarCuentas();
        resultado.subscribe();
        assertEquals(cuentasEsperadas, resultado);
    }
}
