/**
 * SUPERCLASE CLIENTE
 * **/

public class Cliente {

    // Atributos de la superclase Cliente

    private String nombre;
    private int identificacion;
    private char categoria; // Valores 'A' o 'B'
    private short edad;

    // Constructores de la superclase Cliente

    // Constructor de Cliente que recibe todos los atributos como parámetros (nombre, id, categoria y edad)

    public Cliente (String nombre, int identificacion, char categoria, short edad) {

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.categoria = categoria;
        this.edad = edad;

    }

    // Constructor de Cliente que recibe los atributos nombre, identificación y edad, sin categoria

    public Cliente (String nombre, int identificacion, short edad) {
        this(nombre, identificacion, 'N', edad);
    }

    // Constructor de Cliente que recibe los atributos nombre, identificación y categoría, sin edad

    public Cliente (String nombre, int identificacion, char categoria) {
        this(nombre, identificacion, categoria, (short) 0); // Casteo a tipo de dato short
    }

    // Getters y setters de la superclase Cliente

    // Nombre

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Identificación

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    // Categoría

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    // Edad


    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }


    // Método override para mostrar en consola los datos

    @Override
    public String toString () {
        return "Cliente { nombre = '"+ nombre + "', identificacion = " + identificacion + ", categoria = " + categoria + ", edad = " + edad + "}";

    }

}
