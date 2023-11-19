package com.tarjetas.tarjetas.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class Tarjeta {

    @Id
    Integer numeroTarjeta;
    String franquicia;
}
