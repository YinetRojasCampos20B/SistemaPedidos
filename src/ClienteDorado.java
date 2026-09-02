/*
* CLASE HIJA CLIENTE DORADO
* */

public class ClienteDorado extends Cliente {

    // Atributos de la clase hija ClienteDorado

    private short pedidosGratisRestantes;
    private int totalPedidosHistorico;
    private double montoDescuentoCompra;
    private boolean beneficioCompraUsado;

    /*
    * MÉTODOS CONSTRUCTORES DE LA CLASE HIJA
    * CLIENTE DORADO
    * */

    /*
    * Método constructor que recibe como parámetros los atributos de la clase madre Cliente (nombre, identificación ,categoría y edad) y todos los atributos de la clase ClienteDorado (pedidos gratis restantes, total de pedidos histórico, monto descuento de compra y si ya usó el beneficio de compra).
    *    Se usa para construir objetos que ya tengan todos estos parámetros.
    * */

    public ClienteDorado(String nombre, int identificacion, char categoria, short edad, short pedidosGratisRestantes, int totalPedidosHistorico, double montoDescuentoCompra,boolean beneficioCompraUsado) {
        super(nombre, identificacion, categoria, edad);
        this.pedidosGratisRestantes = pedidosGratisRestantes;
        this.totalPedidosHistorico = totalPedidosHistorico;
        this.montoDescuentoCompra = montoDescuentoCompra;
        this.beneficioCompraUsado = beneficioCompraUsado;

    }

}
