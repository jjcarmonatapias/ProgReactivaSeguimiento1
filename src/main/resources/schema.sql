CREATE TABLE IF NOT EXISTS
tarjeta(
    numero_tarjeta INT NOT NULL AUTO_INCREMENT,
    franquicia VARCHAR2(20),
    descripcion VARCHAR2(60),
    PRIMARY KEY (numero_tarjeta)
);

CREATE TABLE IF NOT EXISTS
VENTA_DIGITAL(
    solicitud INT NOT NULL AUTO_INCREMENT,
    producto VARCHAR2(20),
    descripcion VARCHAR2(60),
    PRIMARY KEY (solicitud)
);

CREATE TABLE IF NOT EXISTS
CUENTA(
    id INT NOT NULL AUTO_INCREMENT,
    numero VARCHAR2(20),
    tipo VARCHAR2(60),
    descripcion VARCHAR2(60),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS
TARJETAHABIENTE(
    id INT NOT NULL AUTO_INCREMENT,
    documento VARCHAR2(20),
    tipodocumento VARCHAR2(60),
    nombre VARCHAR2(60),
    descripcion VARCHAR2(60),
    PRIMARY KEY (id)
);

INSERT INTO tarjeta (franquicia, descripcion) VALUES ('MasterCard','Tarjeta mastercard Black');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('MasterCard','Tarjeta mastercard Oro');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('MasterCard','Tarjeta mastercard plata');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Visa','Tarjeta Visa clasica');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Visa','Tarjeta Visa Gold');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Visa','Tarjeta Visa Seleccion');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Visa','Tarjeta Visa Joven');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Amex','Tarjeta Amex Libre');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Amex','Tarjeta Amex internacional');
INSERT INTO tarjeta (franquicia, descripcion) VALUES ('Amex','Tarjeta Amex azul');

------
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta MasterCard','Tarjeta mastercard Black');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta MasterCard','Tarjeta mastercard Oro');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta MasterCard','Tarjeta mastercard plata');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Visa','Tarjeta Visa clasica');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Visa','Tarjeta Visa Gold');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Visa','Tarjeta Visa Seleccion');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Visa','Tarjeta Visa Joven');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Amex','Tarjeta Amex Libre');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Amex','Tarjeta Amex internacional');
INSERT INTO VENTA_DIGITAL (producto, descripcion) VALUES ('Tarjeta Amex','Tarjeta Amex azul');

--------
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1020','Ahorros', 'Cuenta de Ahorros');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1021','Ahorros', 'Cuenta de Ahorros');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1022','Ahorros', 'Cuenta de Ahorros');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1023','Ahorros', 'Cuenta de Ahorros');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1024','Ahorros', 'Cuenta de Ahorros');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1025','Corriente', 'Cuenta Corriente');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1026','Corriente', 'Cuenta Corriente');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1027','Corriente', 'Cuenta Corriente');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1028','Corriente', 'Cuenta Corriente');
INSERT INTO CUENTA (numero, tipo, descripcion) VALUES ('1029','Corriente', 'Cuenta Corriente');

-------
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1020','cedula','John', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1021','cedula','Jairo', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1022','cedula','Edwin', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1023','cedula','Luis Felipe', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1024','cedula','Juan Fernando', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1025','cedula','Johan', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1026','cedula','Kakaroto', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1027','cedula','Bardock', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1028','cedula','Raditz', 'Cliente Empresarial');
INSERT INTO TARJETAHABIENTE (documento, tipodocumento, nombre, descripcion) VALUES ('1029','cedula','Milk', 'Cliente Empresarial');
