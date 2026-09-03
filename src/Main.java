public class Main {
    public static void main(String[] args) {

        /*
        INSTANCIACIÓN DE OBJETOS: Superclase Cliente
         */

        /* Instanciación de objetos de Cliente usando el método constructor que hace
        uso de todos los atributos como parámetros
         */

        Cliente cliente1 = new Cliente("Maria Martínez", 1345678912, 'A', (short) 28);

        /* Instanciación de objetos de Cliente, usando el método constructor que recibe el nombre,
         * identificación y edad, sin recibir la categoría
         * y estableciendo 'N' Ninguna por defecto internamente */

        Cliente cliente2 = new Cliente("Fernando Fernandez", 1234567884, (short) 32);

        /* Instanciación de objetos de Cliente, usando el método constructor que recibe el nombre,
         * identificación y edad, sin recibir la edad
         * y estableciendo cero (0) por defecto internamente */

        Cliente cliente3 = new Cliente( "Emma Mary Tiglao", 1234567893, 'B');

        /*
        INSTANCIACIÓN DE OBJETOS: Clase hija ClienteBronce
         */

        /* Instanciación de objetos de ClienteBronce usando el método constructor #1,
        que hace uso de todos los atributos como parámetros (nombre, identificación, categoría, si el pedido
        gratis está disponible, los pedidos del mes, el descuento acumulado y la fecha del último pedido
         */

        ClienteBronce clienteBronce1 = new ClienteBronce( "Mario Hernandez", 1234567892, 'A', (short) 20, false, 0, 0.15, "04/09/2025");

        /* Instanciación de objetos de ClienteBronce, usando el método constructor #2, recibiendo como parámetros los atributos de la superclase Cliente (nombre, identificacion, categoria y edad), pero que va a establecer internamente el pedido gratis como verdadero, el descuento acumulado como 0 y la fecha del último pedido como No hay pedidos realizados
        Este es un objeto que representa un cliente ordinario, que recién se encuentra en la membresía de Cliente Bronce
        * */

        ClienteBronce clienteBronce2 = new ClienteBronce( "Donatella Versace", 1234567891, 'A', (short) 68);

        /* Instanciación de objetos de ClienteBronce, usando el método constructor #3, recibiendo como parámetros los atributos de la superclase Cliente (nombre, identificacion, categoria y edad), los pedidos del mes y la fecha del último pedido
        * estableciendo el pedido gratis disponible como falso y el descuento acumulado en 0
        Este es un objeto que representa un escenario para cuando el cliente ya gastó su pedido gratis y cuando su indicador de descuento se resetea a cero (0)
        * */

        ClienteBronce clienteBronce3 = new ClienteBronce("Juan Carlos Galliano Guillén", 1234567899, 'A', (short) 65,1, "02/09/2026");

        /*
        INSTANCIACIÓN DE OBJETOS: Clase hija ClientePlata
         */

        /*
        * Instaciación de un objeto clientePlata1, haciendo uso del método constructor #1 que recibe como parámetros todos los atributos de la super clase Cliente
        *    (nombre, identificación, categoría, edad) y sus atributos propios (probabilidad
        * de cashback, el cashback disponible este semestre, las compras de este semestre y la fecha del último cashback). Este objeto representa a un cliente ordinario que haya sido trasladado a la membresía ClientePlata
        */

        ClientePlata clientePlata1 = new ClientePlata ("Coco Rocha",1123456788, 'B', (short) 34, 0.1, false, 2, "09/07/2026");

        //  Imprimir los valores de los atributos de cada objeto creado a partir de la superclase Cliente

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        // Imprimir los valores de los atributos de cada objeto creado a partir de la clase hija ClienteBronce

        System.out.println(clienteBronce1);
        System.out.println(clienteBronce2);
        System.out.println(clienteBronce3);
    }
}