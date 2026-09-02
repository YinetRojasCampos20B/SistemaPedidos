/*
* CLASE PRODUCTO
* */

public class Producto {

    // Atributos de la clase Producto

    private String nombre;
    private double precio;
    private int codigo;
    private boolean disponible;
    private char categoria; // 'V' para Víveres, 'A' para Aseo, 'C' para Cuidado Personal

    /*
    * MÉTODOS CONSTRUCTORES DE LA CLASE PRODUCTO
    * */

    /*
    * Método constructor de la clase Producto, encargada de modelar los atributos del objeto recibiendo su nombre, precio, código y su disponibilidad
    * */

    public Producto(String nombre, double precio, int codigo, boolean disponible, char categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    /*
    Método constructor que ayudará a construir un objeto de tipo Producto sin disponibilidad conocida, recibiendo como parámetros los atributos del nombre, el precio, el código y la categoría, estableciendo su disponibilidad en false
    * */

    public Producto(String nombre, double precio, int codigo, char categoria) {
        this(nombre, precio, codigo, false, categoria);
    }

    /*
    * Método constructor que ayudará a modelar un objeto de tipo Producto sin código particular, es decir, que no haya sido catalogado, recibiendo como parámetros los atributos del nombre, el precio y su disponibilidad, estableciendo su código en cero (0) y su categoria en N de Ninguna
    * */

    public Producto(String nombre, double precio, boolean disponible) {
        this(nombre, precio, 0, disponible, 'N');
    }




}
