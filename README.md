# ProgReactivaSeguimiento1
Este repo es creado para implementar la tarea del seguimiento 1 del curso de programación reactiva

@Autor : John Jairo Carmona Tapias

Descripcion: API para la venta y uso de tarjetas de Credito

Dominio con el CRUD completo: class Tarjeta

Link actuator:

http://localhost:6090/actuator


Modelo:

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

Consultar todas las tarjetas (GET): http://localhost:6090/tarjetas/eliminarporid/1



--------------------------------------------------------

Modelo:

class VentaDigital

    @Id
    Integer solicitud;
    String producto;
    String descripcion;
	

edpoints:

Agregar una VentaDigital(POST): http://localhost:6090/ventadigital/agregarventadigital

Ejemplo:

{
    "producto": "Tarjeta de credito",
    "descripcion": "Tarjeta de credito"
}

Consultar por un id (GET): http://localhost:6090/ventadigital/consultarporid/1

Consultar todas las tarjetas (GET): http://localhost:6090/ventadigital/consultartodo

------------------------------

Modelo:

class Cuenta

   @Id
    Integer id;
    String numero;
    String tipo;
    String descripcion;
	

edpoints:

Agregar una cuenta(POST): http://localhost:6090/cuenta/agregarcuenta

Ejemplo:

{
    "numero": "1020",
	"tipo": "Ahorros",
    "descripcion": "cuenta de ahorros"
}

Consultar por un id (GET): http://localhost:6090/cuenta/consultarporid/1

Consultar todas las tarjetas (GET): http://localhost:6090/cuenta/consultartodo

-------------------------------------------

Modelo:

class Tarjetahabiente

    @Id
    Integer id;
    String documento;
    String tipodocumento;
    String nombre;
    String descripcion;
	

edpoints:

Agregar una Tarjetahabiente(POST): http://localhost:6090/tarjetahabiente/agregartarjetahabiente

Ejemplo:

{
    "documento": "1020",
	"tipodocumento": "cedula",
	"nombre": "John",
    "descripcion": "cliente preferencial"
}

Consultar por un id (GET): http://localhost:6090/tarjetahabiente/consultarporid/1

Consultar todas las tarjetas (GET): http://localhost:6090/tarjetahabiente/consultartodo