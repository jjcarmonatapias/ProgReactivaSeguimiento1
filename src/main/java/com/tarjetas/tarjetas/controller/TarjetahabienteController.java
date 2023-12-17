package com.tarjetas.tarjetas.controller;

import com.tarjetas.tarjetas.models.Tarjetahabiente;
import com.tarjetas.tarjetas.service.TarjetahabienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tarjetahabiente")
@AllArgsConstructor
public class TarjetahabienteController {

    TarjetahabienteService tarjetahabienteService;

    @PostMapping("/agregartarjetahabiente")
    public Mono<Tarjetahabiente> crearTarjetahabiente(@RequestBody Tarjetahabiente tarjetahabiente){
        return tarjetahabienteService.save(tarjetahabiente);
    }

    @GetMapping("/consultarporid/{id}")
    public Mono<Tarjetahabiente> consultarTarjetahabiente(@PathVariable String id){
        return tarjetahabienteService.findById(id);
    }

    @GetMapping("/consultartodo")
    public Flux<Tarjetahabiente> consultarTarjetahabientes(){
        return tarjetahabienteService.findAll();
    }
}
