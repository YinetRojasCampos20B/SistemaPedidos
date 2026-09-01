/*
* CLASE HIJA CLIENTE BRONCE
*/

public class ClienteBronce extends Cliente {

    // Atributos de la clase hija ClienteBronce

    boolean pedidoGratisDisponible;
    int pedidosDelMes;
    double descuentoAcumulado;
    String fechaUltimoPedido;

    // Constructores de la clase hija ClienteBronce

    /* Constructor que recibe todos los atributos de la superclase Cliente
    y de la clase hija ClienteBronce
     */

    public ClienteBronce (String nombre, int identificacion, char categoria, short edad, boolean pedidoGratisDisponible, int pedidosDelMes, double descuentoAcumulado, String fechaUltimoPedido) {
        super(nombre, identificacion, categoria, edad);
        this.pedidoGratisDisponible = pedidoGratisDisponible;
        this.pedidosDelMes = pedidosDelMes;
        this.descuentoAcumulado = descuentoAcumulado;
        this.fechaUltimoPedido = fechaUltimoPedido;
    }

    /*
     Constructor que reciba como parámetros los atributos de la superclase Cliente
    (nombre, identificacion, categoria y edad), pero que va a establecer el pedido gratis como verdadero,
    el descuento acumulado como 0 y la fecha del último pedido como No hay pedidos realizados

    Va a ser utilizado para cuando el estado de un cliente ordinario se actualice a ClienteBronce
     */

    public ClienteBronce (String nombre, int identificacion, char categoria, short edad) {
        super(nombre, identificacion, categoria, edad);
        pedidoGratisDisponible = true;
        descuentoAcumulado = 0;
        fechaUltimoPedido = "No hay pedidos realizados";
    }



}
