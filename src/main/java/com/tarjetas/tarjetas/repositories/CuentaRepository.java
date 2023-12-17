package com.tarjetas.tarjetas.repositories;

import com.tarjetas.tarjetas.models.Cuenta;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface CuentaRepository extends R2dbcRepository<Cuenta, String> {

    Flux<Cuenta> findByTipo(String tipo);
}
