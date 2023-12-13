package com.tarjetas.tarjetas.repositories;

import com.tarjetas.tarjetas.models.VentaDigital;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface VentaDigitalRepository extends R2dbcRepository<VentaDigital, String> {

    Flux<VentaDigital> findByProducto(String producto);
}
