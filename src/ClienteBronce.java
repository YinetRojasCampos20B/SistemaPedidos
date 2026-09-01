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

    /*
    public ClienteBronce(String nombre, int identificacion, char categoria, short edad) {
        this(pedidoGratisDisponible, pedidosDelMes);
        P
        E
        N
        D
        I
        E
        N
        T
        E
    }

     */


    /*
    GETTERS Y SETTERS DE LA CLASE HIJA CLIENTE BRONCE
    */

    // Pedido gratis disponible

    public boolean getPedidoGratisDisponible() {
        return pedidoGratisDisponible;
    }

    public void setPedidoGratisDisponible(boolean pedidoGratisDisponible) {
        this.pedidoGratisDisponible = pedidoGratisDisponible;
    }

    // Pedidos del mes

    public int getPedidosDelMes() {
        return pedidosDelMes;
    }

    public void setPedidosDelMes(int pedidosDelMes) {
        this.pedidosDelMes = pedidosDelMes;
    }

    // Descuento acumulado

    public double getDescuentoAcumulado() {
        return descuentoAcumulado;
    }

    public void setDescuentoAcumulado(double descuentoAcumulado) {
        this.descuentoAcumulado = descuentoAcumulado;
    }

    // Fecha del último pedido realizado

    public String getFechaUltimoPedido() {
        return fechaUltimoPedido;
    }

    public void setFechaUltimoPedido(String fechaUltimoPedido) {
        this.fechaUltimoPedido = fechaUltimoPedido;
    }

    /* Método override sobreescrito para mostrar en consola los datos de los objetos creados
          a partir de la clase hija ClienteBronce
    */
    @Override
    public String toString(ClienteBronce clienteBronce) {
        if (clienteBronce.getPedidoGratisDisponible() == true) {
            return "Cliente Membresía Bronce { nombre = " + clienteBronce.getNombre() + ", identificación = " + clienteBronce.getIdentificacion() + ", categoria = " + clienteBronce.getCategoria() + ", edad = " + clienteBronce.getEdad() + ",  tiene pedido gratis disponible = no tiene, pedidos del mes = " + clienteBronce.getPedidosDelMes() + ", descuento acumulado = " + clienteBronce.getDescuentoAcumulado() + ", fecha último pedido" + clienteBronce.getFechaUltimoPedido();
        } else {
            return "Cliente Membresía Bronce { nombre = " + clienteBronce.getNombre() + ", identificación = " + clienteBronce.getIdentificacion() + ", categoria = " + clienteBronce.getCategoria() + ", edad = " + clienteBronce.getEdad() + ",  tiene pedido gratis disponible = si tiene, pedidos del mes = " + clienteBronce.getPedidosDelMes() + ", descuento acumulado = " + clienteBronce.getDescuentoAcumulado() + ", fecha último pedido" + clienteBronce.getFechaUltimoPedido();
        }
    }
}
