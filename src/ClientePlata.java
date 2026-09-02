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
    * Es usado en el caso de que el cliente ordinario haya sido trasladado a ClientePlata
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
    * Método constructor que recibe como parámetros todos los atributos de la super clase Cliente
    * (nombre, identificación, categoría, edad) y los atributos propios de la clase hija  ClientePlata, en este caso,
    * específicamente las compras en el semestre y la fecha del último cashback, asignando
    * un valor false al cashback disponible y cero a la probabilidad del cashback
    * Se usa cuando el cliente Plata ya gastó su cashback
    * */

    public ClientePlata(String nombre, int identificacion, char categoria, short edad, int comprasEnSemestre, String fechaUltimoCashback) {
        super(nombre, identificacion, categoria, edad);
        this.comprasEnSemestre = comprasEnSemestre;
        this.fechaUltimoCashback = fechaUltimoCashback;
        probabilidadCashback = 0;
        cashbackDisponibleEsteSemestre = false;
    }

    /*
    * Método constructor que recibe como parámetros todos los atributos de la super clase Cliente
     * (nombre, identificación, categoría, edad) y los atributos propios de la clase Cliente Plata, específicamente
     * la probabilidad de cashback y la fecha del último cashback realizado
     * Se usa para instanciar objetos de la clase hija ClientePlata que no tengan
     * compras hechas este semestre, pero que tengan historial de probabilidad y fecha
    * */

    public ClientePlata (String nombre, int identificacion, char categoria, short edad, double probabilidadCashback, String fechaUltimoCashback) {
        super(nombre, identificacion, categoria, edad);
        this.probabilidadCashback = probabilidadCashback;
        this.fechaUltimoCashback = fechaUltimoCashback;
        comprasEnSemestre = 0;
        cashbackDisponibleEsteSemestre = true;
    }


}
