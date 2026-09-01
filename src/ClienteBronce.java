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

    public ClienteBronce (String nombre, int identificacion, char categoria, short edad, boolean pedidoGratisDisponible, int pedidosDelMes, double descuentoAcumulado, String fechaUltimoPedido) {
        super(nombre, identificacion, categoria, edad);
        this.pedidoGratisDisponible = pedidoGratisDisponible;
        this.pedidosDelMes = pedidosDelMes;
        this.descuentoAcumulado = descuentoAcumulado;
        this.fechaUltimoPedido = fechaUltimoPedido;
    }

}
