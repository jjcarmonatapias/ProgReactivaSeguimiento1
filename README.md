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

Agregar una tarjeta: http://localhost:6090/tarjetas/agregartarjeta

Consultar por un id: http://localhost:6090/tarjetas/consultarporid/1

Consultar todas las tarjetas: http://localhost:6090/tarjetas/consultartodo