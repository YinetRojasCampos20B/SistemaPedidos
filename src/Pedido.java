/*
* CLASE PEDIDO
* */

public class Pedido {

    // Atributos de la clase Pedido

    private Cliente cliente;
    private Producto[] productos;
    private int cantidadProductos;
    private String fecha;
    private double total;

    /*
    * CONSTRUCTOR DE LA CLASE PEDIDO
    * */

    public Pedido(Cliente cliente, Producto[] productos, int cantidadProductos, String fecha) {
        this.cliente = cliente;
        this.productos = productos;
        this.cantidadProductos = cantidadProductos;
        this.fecha = fecha;
        total = 0;
    }

    // Método para calcular el total de una compra hecha por el cliente

    public double calcularTotalCompra() {
        double suma = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            suma += productos[i].getPrecio();
        }
        total = suma;
        return total;
    }

    // Método para imprimir el total en consola

    /*
    * GETTERS Y SETTERS DE LA CLASE PEDIDO
    * */

    // Objeto de la clase Cliente

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Arreglo de objetos de la clase Producto

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    // Cantidad de productos

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    // Fecha del pedido

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Total del pedido

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /*
    * Método para imprimir en consola los productos
    *    contenidos dentro del pedido
    * */

    public String imprimirProductosPedido () {
        String resultado = "";
        for (int i = 0; i < cantidadProductos; i++) {
            resultado += "Producto #" + i + ": " + productos[i];
        }
        return resultado;
    }

    /*
    * Método override para imprimir datos de la clase Pedido
    * */

    @Override
    public String toString() {
         return "Pedido del cliente: "+cliente+"{ productos = "+imprimirProductosPedido()+ ", total = "+total+"}";
    }

}
