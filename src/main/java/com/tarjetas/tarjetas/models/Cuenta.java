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
public class Cuenta implements MuestraID, MuestraDescripcion{

    @Id
    Integer id;
    String numero;
    String tipo;
    String descripcion;

    @Override
    public void muestraClaveUnica(String id) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La cuenta está creada bajo el identificador: " + id);
    }

    @Override
    public void muestraDescripcion(String descripcion) {
        final Logger LOGGER = LoggerFactory.getLogger(Tarjeta.class);
        LOGGER.info("La cuenta tiene la siguiente descripcion: " + descripcion);
    }
}
