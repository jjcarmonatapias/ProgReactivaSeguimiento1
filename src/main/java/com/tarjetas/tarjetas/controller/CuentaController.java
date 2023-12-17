package com.tarjetas.tarjetas.controller;

import com.tarjetas.tarjetas.models.Cuenta;
import com.tarjetas.tarjetas.service.CuentaService;
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
@RequestMapping("/cuenta")
@AllArgsConstructor
public class CuentaController {

    CuentaService cuentaService;

    @PostMapping("/agregarcuenta")
    public Mono<Cuenta> crearCuenta(@RequestBody Cuenta cuenta){
        return cuentaService.save(cuenta);
    }

    @GetMapping("/consultarporid/{id}")
    public Mono<Cuenta> consultarCuenta(@PathVariable String id){
        return cuentaService.findById(id);
    }

    @GetMapping("/consultartodo")
    public Flux<Cuenta> consultarCuentas(){
        return cuentaService.findAll();
    }

}
