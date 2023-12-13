package com.tarjetas.tarjetas.controller;

import com.tarjetas.tarjetas.models.VentaDigital;
import com.tarjetas.tarjetas.service.VentaDigitalService;
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
@RequestMapping("/ventadigital")
@AllArgsConstructor
public class VentaDigitalController {

    VentaDigitalService ventaDigitalService;

    @PostMapping("/agregarventadigital")
    public Mono<VentaDigital> crearVentaDigital(@RequestBody VentaDigital ventaDigital){
        return ventaDigitalService.save(ventaDigital);
    }

    @GetMapping("/consultarporid/{id}")
    public Mono<VentaDigital> consultarVentaDigital(@PathVariable String id){
        return ventaDigitalService.findById(id);
    }

    @GetMapping("/consultartodo")
    public Flux<VentaDigital> consultarVentasDigitales(){
        return ventaDigitalService.findAll();
    }
}
