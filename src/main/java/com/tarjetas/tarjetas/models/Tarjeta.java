package com.tarjetas.tarjetas.models;


import com.tarjetas.tarjetas.service.TarjetaService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class Tarjeta implements MuestraID, MuestraDescripcion{

    @Id
    Integer numeroTarjeta;
    String franquicia;
    String descripcion;

    @Override
    public void muestraClaveUnica(String id) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La tarjeta está creada bajo el identificador: " + id);
    }

    @Override
    public void muestraDescripcion(String descripcion) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La tarjeta tiene la siguiente descripcion: " + descripcion);
    }
}
