/*

* CLASE HIJA CLIENTE PLATA
*
* */

public class ClientePlata extends Cliente {

    // Atributos de la clase hija ClientePlata

    private double probabilidadCashback;
    private boolean cashbackDisponibleEsteSemestre;
    private int comprasEnSemestre;
    private String fechaUltimoCashback;

    /*
    * CONSTRUCTORES DE LA CLASE HIJA CLIENTE PLATA
    * */

    /*

    * Método constructor que recibe como parámetros todos los atributos de la super clase Cliente
    *    (nombre, identificación, categoría, edad) y sus atributos propios, tales como la probabilidad
    * de cashback, el cashback disponible este semestre, las compras de este semestre y la fecha del último cashback
    *
    *  */

    public ClientePlata (String nombre, int identificacion, char categoria, short edad, double probabilidadCashback, boolean cashbackDisponibleEsteSemestre, int comprasEnSemestre, String fechaUltimoCashback) {
        super(nombre, identificacion, categoria, edad);
        this.probabilidadCashback = probabilidadCashback;
        this.cashbackDisponibleEsteSemestre = cashbackDisponibleEsteSemestre;
        this.comprasEnSemestre = comprasEnSemestre;
        this.fechaUltimoCashback = fechaUltimoCashback;

    }

    /*
    *
    * Método constructor que
    *
    * */

    public ClientePlata() {


    }



}
