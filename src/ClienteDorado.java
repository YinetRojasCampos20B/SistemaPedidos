/*
* CLASE HIJA CLIENTE DORADO
* */

public class ClienteDorado extends Cliente {

    // Atributos de la clase hija ClienteDorado

    private short pedidosGratisRestantes;
    private int totalPedidosHistorico;
    private double montoDescuentoCompra;
    private boolean descuentoCompraUsado;

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

    /*
    Método constructor que recibe como parámetros los atributos de la clase madre Cliente (nombre, identificación ,categoría y edad) y los atributos de la clase ClienteDorado, como el total de pedidos histórico, el monto descuento de la compra y si ya usó el descuento de compra), estableciendo por defecto los pedidos gratis restantes en seis (6) y el descuento de la compra en false
    Se usa cuando un cliente ordinario asciente a la membresía dorada
     */

    public ClienteDorado(String nombre, int identificacion, char categoria, short edad, int totalPedidosHistorico, double montoDescuentoCompra) {
        super(nombre, identificacion, categoria, edad);
        pedidosGratisRestantes = 6;
        this.totalPedidosHistorico = totalPedidosHistorico;
        this.montoDescuentoCompra = montoDescuentoCompra;
        descuentoCompraUsado = false;
    }

    /* Método override sobreescrito para mostrar en consola los datos de los objetos creados a partir de la clase hija ClienteDorado
        */
    @Override
    public String toString() {
        if (descuentoCompraUsado) {
            return "Cliente Membresía Dorado { nombre = " + getNombre() + ", identificación = " + getIdentificacion() + ", categoria = " + getCategoria() + ", edad = " + getEdad() + ",  ha usado su descuento de compra = si, total de pedidos históricos = " + totalPedidosHistorico + ", monto de descuento de compra = " + montoDescuentoCompra + ", pedidos restantes = " + pedidosGratisRestantes+"}";
        } else {
            return "Cliente Membresía Dorado { nombre = " + getNombre() + ", identificación = " + getIdentificacion() + ", categoria = " + getCategoria() + ", edad = " + getEdad() + ",  ha usado su descuento de compra = no, total de pedidos históricos = " + totalPedidosHistorico + ", monto de descuento de compra = " + montoDescuentoCompra + ", pedidos restantes = " + pedidosGratisRestantes+"}";
        }
    }

    // GETTERS Y SETTERS DE LA CLASE HIJA CLIENTE DORADO

    // Pedidos gratis restantes
    public short getPedidosGratisRestantes() {
        return pedidosGratisRestantes;
    }

    public void setPedidosGratisRestantes(short pedidosGratisRestantes) {
        this.pedidosGratisRestantes = pedidosGratisRestantes;
    }

    // Total de pedidos histórico

    public int getTotalPedidosHistorico() {
        return totalPedidosHistorico;
    }

    public void setTotalPedidosHistorico(int totalPedidosHistorico) {
        this.totalPedidosHistorico = totalPedidosHistorico;
    }

    // Monto descuento de compra

    public double getMontoDescuentoCompra() {
        return montoDescuentoCompra;
    }

    public void setMontoDescuentoCompra(double montoDescuentoCompra) {
        this.montoDescuentoCompra = montoDescuentoCompra;
    }

    // Descuento de compra usado

    public boolean setDescuentoCompraUsado() {
        return descuentoCompraUsado;
    }

    public void setDescuentoCompraUsado(boolean descuentoCompraUsado) {
        this.descuentoCompraUsado = descuentoCompraUsado;
    }
}
