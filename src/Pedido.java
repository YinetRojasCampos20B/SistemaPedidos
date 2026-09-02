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

    public double calcularTotalCompra(Producto[]) {

    }
}
