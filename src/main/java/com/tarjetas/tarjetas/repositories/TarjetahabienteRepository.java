package com.tarjetas.tarjetas.repositories;

import com.tarjetas.tarjetas.models.Tarjetahabiente;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface TarjetahabienteRepository extends R2dbcRepository<Tarjetahabiente, String> {

    Flux<Tarjetahabiente> findByTipodocumento(String tipodocumento);
}
