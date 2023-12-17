package com.tarjetas.tarjetas.service;

import com.tarjetas.tarjetas.models.Tarjeta;
import com.tarjetas.tarjetas.repositories.TarjetaRepository;
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
public class TarjetaService {

    private final Logger LOGGER = LoggerFactory.getLogger(TarjetaService.class);

    private final TarjetaRepository tarjetaRepository;

    public Mono<Tarjeta> save(Tarjeta tarjeta){
        return tarjetaRepository.save(tarjeta);
    }

    public Mono<Tarjeta> findById(String id){
        return tarjetaRepository.findById(id)
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar una tarjeta con id = " + id, throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Tarjeta con id = "+ id +" no encontrada").getMostSpecificCause()));
    }


    public Flux<Tarjeta> findAll(){
        return tarjetaRepository.findAll()
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar todas las tarjetas" , throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Ninguna tarjetas encontrada").getMostSpecificCause()));
    }

    public Mono<Void> deleteById(String id){
        return tarjetaRepository.deleteById(id)
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al eliminar una tarjeta con id = " + id, throwable);
                    return Mono.empty();
                });
    }



}
