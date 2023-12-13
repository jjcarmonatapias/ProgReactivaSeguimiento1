# ProgReactivaSeguimiento1
Este repo es creado para implementar la tarea del seguimiento 1 del curso de programación reactiva

@Autor : John Jairo Carmona Tapias

Descripcion: API para la venta y uso de tarjetas de Credito

Dominio:

class Tarjeta

    @Id
    Integer numeroTarjeta;
    String franquicia;
    String descripcion;
	

edpoints:

Agregar una tarjeta (POST): http://localhost:6090/tarjetas/agregartarjeta

ejemplo:

{
    "franquicia": "American Express",
    "descripcion": "Tarjeta de credito American Express morada"
}

Consultar por un id (GET): http://localhost:6090/tarjetas/consultarporid/1

Consultar todas las tarjetas (GET): http://localhost:6090/tarjetas/consultartodo



--------------------------------------------------------

Dominio:

class VentaDigital

    @Id
    Integer solicitud;
    String producto;
    String descripcion;
	

edpoints:

Agregar una tarjeta(POST): http://localhost:6090/ventadigital/agregarventadigital

Ejemplo:

{
    "producto": "Tarjeta de credito",
    "descripcion": "Tarjeta de credito"
}

Consultar por un id (GET): http://localhost:6090/ventadigital/consultarporid/1

Consultar todas las tarjetas (GET): http://localhost:6090/ventadigital/consultartodo