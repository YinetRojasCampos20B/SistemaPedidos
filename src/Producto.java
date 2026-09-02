/*
* SUPERCLASE PRODUCTO
* */

public class Producto {

    // Atributos de la superclase Producto

    private String nombre;
    private double precio;
    private int codigo;
    private boolean disponible;

    /*
    * MÉTODOS CONSTRUCTORES DE LA SUPERCLASE PRODUCTO
    * */

    /*
    * Método constructor de la superclase Producto, encargada de modelar los atributos del objeto recibiendo su nombre, precio, código y su disponibilidad
    * */

    public Producto(String nombre, double precio, int codigo, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    /*
    Método constructor que ayudará a construir un objeto de tipo Producto sin disponibilidad conocida
    * */

    public Producto(String nombre, double precio, int codigo) {
        this(nombre, precio, codigo, false);
    }

    /*
    * Método constructor que ayudará a modelar un objeto de tipo Producto sin código particular, es decir, que no haya sido categorizado
    * */

    public Producto(String nombre, double precio, boolean disponible) {
        this(nombre, precio, 0, disponible);
    }
}
