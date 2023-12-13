package com.tarjetas.tarjetas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class VentaDigital implements MuestraID, MuestraDescripcion{

    @Id
    Integer solicitud;
    String producto;
    String descripcion;

    @Override
    public void muestraClaveUnica(String id) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La venta digital está creada bajo el identificador: " + id);
    }

    @Override
    public void muestraDescripcion(String descripcion) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La venta digital tiene la siguiente descripcion: " + descripcion);
    }
}
