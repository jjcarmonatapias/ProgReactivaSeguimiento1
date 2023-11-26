package com.tarjetas.tarjetas.controller;

import com.tarjetas.tarjetas.models.Tarjeta;
import com.tarjetas.tarjetas.service.TarjetaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tarjetas")
@AllArgsConstructor
public class TarjetaController {

    TarjetaService tarjetaService;

    @PostMapping("/agregartarjeta")
    public Mono<Tarjeta> crearTarjeta(@RequestBody Tarjeta tarjeta){
        return tarjetaService.save(tarjeta);
    }

    @GetMapping("/consultarporid/{id}")
    public Mono<Tarjeta> consultarTarjeta(@PathVariable String id){
        return tarjetaService.findById(id);
    }

    @GetMapping("/consultartodo")
    public Flux<Tarjeta> consultarTarjetas(){
        return tarjetaService.findAll();
    }

}
