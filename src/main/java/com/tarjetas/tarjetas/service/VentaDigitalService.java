package com.tarjetas.tarjetas.service;

import com.tarjetas.tarjetas.models.VentaDigital;
import com.tarjetas.tarjetas.repositories.VentaDigitalRepository;
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
public class VentaDigitalService {

    private final Logger LOGGER = LoggerFactory.getLogger(VentaDigitalService.class);

    private final VentaDigitalRepository ventaDigitalRepository;

    public Mono<VentaDigital> save(VentaDigital ventaDigital){
        return ventaDigitalRepository.save(ventaDigital);
    }

    public Mono<VentaDigital> findById(String id){
        return ventaDigitalRepository.findById(id)
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar una VentaDigital con id = " + id, throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "VentaDigital con id = "+ id +" no encontrada").getMostSpecificCause()));
    }


    public Flux<VentaDigital> findAll(){
        return ventaDigitalRepository.findAll()
                .onErrorResume(throwable -> {
                    LOGGER.error("Error al consultar todas las VentaDigitals" , throwable);
                    return Mono.empty();
                })
                .switchIfEmpty(Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Ninguna VentaDigitals encontrada").getMostSpecificCause()));
    }



}
