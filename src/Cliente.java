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



}
