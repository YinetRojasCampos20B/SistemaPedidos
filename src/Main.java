public class Main {
    public static void main(String[] args) {

        /*
        INSTANCIACIÓN DE OBJETOS: Superclase Cliente
         */

        /* Instanciación de objetos de Cliente usando el método constructor que hace
        uso de todos los atributos como parámetros
         */

        Cliente cliente1 = new Cliente("Maria Martínez", 23456789, 'A', (short) 28);

        /* Instanciación de objetos de Cliente, usando el método constructor que recibe el nombre,
         * identificación y edad, sin recibir la categoría
         * y estableciendo 'N' Ninguna por defecto internamente */

        Cliente cliente2 = new Cliente("Fernando Fernandez", 76543210, (short) 32);

        /* Instanciación de objetos de Cliente, usando el método constructor que recibe el nombre,
         * identificación y edad, sin recibir la edad
         * y estableciendo cero (0) por defecto internamente */

        Cliente cliente3 = new Cliente( "Emma Mary Tiglao", 657483920, 'B');

        /*
        INSTANCIACIÓN DE OBJETOS: Clase hija ClienteBronce
         */

        /* Instanciación de objetos de ClienteBronce usando el método constructor #1,
        que hace uso de todos los atributos como parámetros (nombre, identificación, categoría, si el pedido
        gratis está disponible, los pedidos del mes, el descuento acumulado y la fecha del último pedido
         */

        ClienteBronce clienteBronce1 = new ClienteBronce( "Mario Hernandez", 1234567, 'A', (short) 20, false, 0, 0.15, "04/09/2025");

        /* Instanciación de objetos de ClienteBronce, usando el método constructor #2, recibiendo como parámetros los atributos de la superclase Cliente (nombre, identificacion, categoria y edad), pero que va a establecer internamente el pedido gratis como verdadero, el descuento acumulado como 0 y la fecha del último pedido como No hay pedidos realizados
        Este es un objeto que representa un cliente ordinario, que recién se encuentra en la membresía de Cliente Bronce
        * */

        ClienteBronce clienteBronce2 = new ClienteBronce( "Donatella Versace", 1234567, 'A', (short) 68);

        //  Imprimir los valores de los atributos de cada objeto creado a partir de la superclase Cliente

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        // Imprimir los valores de los atributos de cada objeto creado a partir de la clase hija ClienteBronce

        System.out.println(clienteBronce1);
        System.out.println(clienteBronce2);

    }
}