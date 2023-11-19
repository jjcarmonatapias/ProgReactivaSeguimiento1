package com.tarjetas.tarjetas.repositories;

import com.tarjetas.tarjetas.models.Tarjeta;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface TarjetaRepository extends R2dbcRepository<Tarjeta, String> {

    Flux<Tarjeta> findByFranquicia(String franquicia);
}
