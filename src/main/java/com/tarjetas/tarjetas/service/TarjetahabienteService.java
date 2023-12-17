package com.tarjetas.tarjetas.service;

import com.tarjetas.tarjetas.models.Tarjetahabiente;
import com.tarjetas.tarjetas.repositories.TarjetahabienteRepository;
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
public class TarjetahabienteService {

    private final Logger LOGGER = LoggerFactory.getLogger(TarjetahabienteService.class);

    private final TarjetahabienteRepository tarjetahabienteRepository;

    public Mono<Tarjetahabiente> save(Tarjetahabiente tarjeta){
        return tarjetahabienteRepository.save(tarjeta);
    }

    public Mono<Tarjetahabiente> findById(String id){
        return tarjetahabienteRepository.findById(id)
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar el Tarjetahabiente con id = " + id, throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Tarjetahabiente con id = "+ id +" no encontrado").getMostSpecificCause()));
    }


    public Flux<Tarjetahabiente> findAll(){
        return tarjetahabienteRepository.findAll()
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar todos los Tarjetahabiente" , throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Ningun Tarjetahabiente encontrado").getMostSpecificCause()));
    }
}
