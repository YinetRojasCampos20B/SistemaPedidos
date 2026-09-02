/*
* CLASE HIJA CLIENTE DORADO
* */

public class ClienteDorado extends Cliente {

    // Atributos de la clase hija ClienteDorado

    private final short pedidosGratisRestantes;
    private final int totalPedidosHistorico;
    private final double montoDescuentoCompra;
    private final boolean descuentoCompraUsado;

    /*
    * MÉTODOS CONSTRUCTORES DE LA CLASE HIJA
    * CLIENTE DORADO
    * */

    /*
    * Método constructor que recibe como parámetros los atributos de la clase madre Cliente (nombre, identificación ,categoría y edad) y todos los atributos de la clase ClienteDorado (pedidos gratis restantes, total de pedidos histórico, monto descuento de compra y si ya usó el descuento de compra).
    *    Se usa para construir objetos que ya tengan todos estos parámetros.
    * */

    public ClienteDorado(String nombre, int identificacion, char categoria, short edad, short pedidosGratisRestantes, int totalPedidosHistorico, double montoDescuentoCompra,boolean descuentoCompraUsado) {
        super(nombre, identificacion, categoria, edad);
        this.pedidosGratisRestantes = pedidosGratisRestantes;
        this.totalPedidosHistorico = totalPedidosHistorico;
        this.montoDescuentoCompra = montoDescuentoCompra;
        this.descuentoCompraUsado = descuentoCompraUsado;

    }

    /*
    Método constructor que recibe como parámetros los atributos de la clase madre Cliente (nombre, identificación ,categoría y edad) y los atributos de la clase ClienteDorado, como el total de pedidos histórico, el monto descuento de la compra y si ya usó el descuento de compra), estableciendo por defecto los pedidos gratis restantes en cero (0)
    Se usa cuando los pedidos gratis que tiene el cliente dorado han sido usados durante ese mes
     */

    public ClienteDorado(String nombre, int identificacion, char categoria, short edad, int totalPedidosHistorico, double montoDescuentoCompra, boolean descuentoCompraUsado) {
        super(nombre, identificacion, categoria, edad);
        pedidosGratisRestantes = 0;
        this.totalPedidosHistorico = totalPedidosHistorico;
        this.montoDescuentoCompra = montoDescuentoCompra;
        this.descuentoCompraUsado = descuentoCompraUsado;
    }
}
