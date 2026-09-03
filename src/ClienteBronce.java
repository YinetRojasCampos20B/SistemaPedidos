/*
* CLASE HIJA CLIENTE BRONCE
*/

public class ClienteBronce extends Cliente {

    // Atributos de la clase hija ClienteBronce

    private boolean pedidoGratisDisponible;
    private int pedidosDelMes;
    private double descuentoAcumulado;
    private String fechaUltimoPedido;

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
        pedidosDelMes = 0;
        descuentoAcumulado = 0;
        fechaUltimoPedido = "No hay pedidos realizados";
    }


    /*
    * Constructor que reciba como parámetros los atributos de la superclase Cliente
    (nombre, identificacion, categoria y edad), los pedidos del mes y la fecha del último pedido
    * estableciendo el pedido gratis disponible como falso y el descuento acumulado en 0
    Este escenario se usa para cuando el cliente ya gastó su pedido gratis y cuando su indicador de descuento se resetea.
    * * */

    public ClienteBronce(String nombre, int identificacion, char categoria, short edad, int pedidosDelMes, String fechaUltimoPedido) {
        super(nombre, identificacion, categoria, edad);
        this.pedidosDelMes = pedidosDelMes;
        pedidoGratisDisponible = false;
        descuentoAcumulado = 0;
       this.fechaUltimoPedido = fechaUltimoPedido;

    }

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
    public String toString() {
        if (pedidoGratisDisponible) {
            return "Cliente Membresía Bronce { nombre = " + getNombre() + ", identificación = " + getIdentificacion() + ", categoria = " + getCategoria() + ", edad = " + getEdad() + ",  tiene pedido gratis disponible = si tiene, pedidos del mes = " + pedidosDelMes + ", descuento acumulado = " + descuentoAcumulado + ", fecha último pedido" + fechaUltimoPedido+"}";
        } else {
            return "Cliente Membresía Bronce { nombre = " + getNombre() + ", identificación = " + getIdentificacion() + ", categoria = " + getCategoria() + ", edad = " + getEdad() + ",  tiene pedido gratis disponible = no tiene, pedidos del mes = " + pedidosDelMes + ", descuento acumulado = " + descuentoAcumulado + ", fecha último pedido" + fechaUltimoPedido+"}";
        }
    }
}
