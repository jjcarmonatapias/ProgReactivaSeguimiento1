package com.tarjetas.tarjetas.controller;

import com.tarjetas.tarjetas.models.Tarjeta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {

    @GetMapping("/status")
    public ResponseEntity status() {
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setNumeroTarjeta("1020");
        tarjeta.setFranquicia("Mastercard");
        return new ResponseEntity(tarjeta, HttpStatus.OK);
    }
}
