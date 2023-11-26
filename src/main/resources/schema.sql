CREATE TABLE IF NOT EXISTS
tarjeta(
    numero_tarjeta INT NOT NULL AUTO_INCREMENT,
    franquicia VARCHAR2(20),
    descripcion VARCHAR2(60),
    PRIMARY KEY (numero_tarjeta)
);