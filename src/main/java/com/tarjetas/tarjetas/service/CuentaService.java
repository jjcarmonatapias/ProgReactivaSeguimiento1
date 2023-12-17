package com.tarjetas.tarjetas.service;

import com.tarjetas.tarjetas.models.Cuenta;
import com.tarjetas.tarjetas.repositories.CuentaRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CuentaService {

    private final Logger LOGGER = LoggerFactory.getLogger(CuentaService.class);

    private final CuentaRepository cuentaRepository;

    public Mono<Cuenta> save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }

    public Mono<Cuenta> findById(String id){
        return cuentaRepository.findById(id)
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar una cuenta con id = " + id, throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Cuenta con id = "+ id +" no encontrada").getMostSpecificCause()));
    }


    public Flux<Cuenta> findAll(){
        return cuentaRepository.findAll()
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar todas las cuentas" , throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Ninguna cuenta encontrada").getMostSpecificCause()));
    }
}
