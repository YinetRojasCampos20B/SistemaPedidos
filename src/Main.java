public class Main {
    public static void main(String[] args) {

        // Instanciación de los objetos de la clase Cliente

        // Instanciación de objetos de Cliente usando el método constructor que hace uso de todos los atributos como parámetros

        Cliente cliente1 = new Cliente("Maria", 23456789, 'A', (short) 28);

        /* Instanciación de objetos de Cliente, usando el método constructor que recibe el nombre,
         * identificación y edad, sin recibir la categoría
         * y estableciendo 'N' Ninguna por defecto internamente */

        Cliente cliente2 = new Cliente("Fernando", 76543210, (short) 32);

        //  Imprimir los valores de los atributos de cada objeto creado a partir de la clase Cliente

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}