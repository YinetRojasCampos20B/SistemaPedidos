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
         * identificación y categoría, sin recibir la edad
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

        ClienteBronce clienteBronce2 = new ClienteBronce( "Rainelis Rosario Rojas", 1434567599, 'B', (short) 21, true, 1, 0.05, "01/09/2026");

        /* Instanciación de objetos de ClienteBronce, usando el método constructor #2, recibiendo como parámetros los atributos de la superclase Cliente (nombre, identificacion, categoria y edad), pero que va a establecer internamente el pedido gratis como verdadero, el descuento acumulado como 0 y la fecha del último pedido como No hay pedidos realizados
        Este es un objeto que representa un cliente ordinario, que recién se encuentra en la membresía de Cliente Bronce
        * */

        ClienteBronce clienteBronce3 = new ClienteBronce( "Donatella Versace", 1234567891, 'A', (short) 68);

        ClienteBronce clienteBronce4 = new ClienteBronce( "Katrina Anne Johnson", 1054567192, 'B', (short) 22);

        /* Instanciación de objetos de ClienteBronce, usando el método constructor #3, recibiendo como parámetros los atributos de la superclase Cliente (nombre, identificacion, categoria y edad), los pedidos del mes y la fecha del último pedido
        * estableciendo el pedido gratis disponible como falso y el descuento acumulado en 0
        Este es un objeto que representa un escenario para cuando el cliente ya gastó su pedido gratis y cuando su indicador de descuento se resetea a cero (0)
        * */

        ClienteBronce clienteBronce5 = new ClienteBronce("Juan Carlos Galliano Guillén", 1234567899, 'A', (short) 65,1, "02/09/2026");

        ClienteBronce clienteBronce6 = new ClienteBronce("Diana Belmonte Ramos", 1230567881, 'B', (short) 22,0, "02/01/2026");

        /*
        INSTANCIACIÓN DE OBJETOS: Clase hija ClientePlata
         */

        /*
        * Instaciación de dos objetos ClientePlata, haciendo uso del método constructor #1 que recibe como parámetros todos los atributos de la super clase Cliente
        *    (nombre, identificación, categoría, edad) y sus atributos propios (probabilidad
        * de cashback, el cashback disponible este semestre, las compras de este semestre y la fecha del último cashback). Este objeto representa a un cliente ordinario que haya sido trasladado a la membresía ClientePlata
        */

        ClientePlata clientePlata1 = new ClientePlata ("Coco Rocha",1123456788, 'B', (short) 34, 0.1, false, 2, "09/07/2026");

        ClientePlata clientePlata2 = new ClientePlata ("Miranda Kerr",1123456782, 'A', (short) 43, 0.01, true, 1, "01/08/2026");

        /*
         * Instaciación de dos objetos ClientePlata, haciendo uso del método constructor #2 que recibe como parámetros todos los atributos de la super clase Cliente
         *    (nombre, identificación, categoría, edad) y los atributos propios de la clase hija  ClientePlata, en este caso,
         * específicamente las compras en el semestre y la fecha del último cashback, asignando
         * un valor false al cashback disponible y cero a la probabilidad del cashback
         *  Este objeto representa a un cliente con membresía Plata que ya haya gastado su cashback
         */

        ClientePlata clientePlata3 = new ClientePlata("Raymond Sinaragua Uchiha", 1009289998, 'A', (short) 41, 10, "19/07/2026");

        ClientePlata clientePlata4 = new ClientePlata("Gwen Marie Bolinnee", 1010987654, 'A', (short) 41, 10, "19/07/2026");

        /*
         * Instaciación de dos objetos ClientePlata, haciendo uso del método constructor #3 que recibe como parámetros todos los atributos de la super clase Cliente
         *    (nombre, identificación, categoría, edad) y los atributos propios de la clase Cliente Plata, específicamente
         * la probabilidad de cashback y la fecha del último cashback realizado
         *  Este objeto representa a un cliente con membresía Plata que no tengan compras realizadas en el semestre pero que tengan historial de probabilidad y fecha de último pedido
         */

        ClientePlata clientePlata5 = new ClientePlata("Tharine Botez Drews", 1121234566,'B', (short) 19, 0.02, "8/05/2026");

        ClientePlata clientePlata6 = new ClientePlata("Adriana Lime Lajas", 1131334986,'A', (short) 45, 0.02, "8/05/2026");


        /*
        INSTANCIACIÓN DE OBJETOS: Clase hija ClienteDorado
         */

        /*
         * Instaciación de dos objetos ClienteDorado, haciendo uso del método constructor #1 que recibe como parámetros todos los atributos de la super clase Cliente
         *    (nombre, identificación, categoría, edad) y los atributos propios y todos los atributos de la clase ClienteDorado (pedidos gratis restantes, total de pedidos histórico, monto descuento de compra y si ya usó el descuento de compra. Se usa en el dado caso de que ya se tengan todos estos parámetros

         */

        ClienteDorado clienteDorado1 = new ClienteDorado("Jinny Kardashian Ramos", 1000987654, 'B', (short) 20, (short) 4, 5, 5000,false);

        ClienteDorado clienteDorado2 = new ClienteDorado("Isabella Nobara Menin", 1010793612, 'A', (short) 25, (short) 3, 7, 10000, false);

        /*
         * Instaciación de dos objetos ClienteDorado, haciendo uso del método constructor #2 que recibe como parámetros todos los atributos de la super clase Cliente
         *    (nombre, identificación, categoría, edad) y los atributos propios y y los atributos de la clase ClienteDorado, en este caso, serían el total de pedidos histórico, el monto descuento de la compra y si ya usó el descuento de compra, estableciendo de manera predeterminada los pedidos gratis restantes en cero (0). Este escenario sse usa cuando los pedidos gratis que poseía el cliente dorado ya fueron gastados en el mes en curso

         */

        ClienteDorado clienteDorado3 = new ClienteDorado("Karly Marina Rojas", 1111239872, 'B', (short) 33, 20, 30000, false);

        ClienteDorado clienteDorado4 = new ClienteDorado("John Doe Campos", 1120232817, 'A', (short) 23, 2, 2500, false);


        /*
         * Instaciación de dos objetos ClienteDorado, haciendo uso del método constructor #3 que recibe como parámetros todos los atributos de la super clase Cliente
         *    (nombre, identificación, categoría, edad) y los atributos de la clase ClienteDorado, como el total de pedidos histórico, el monto descuento de la compra y si ya usó el descuento de compra), estableciendo por defecto los pedidos gratis restantes en seis (6) y el descuento de la compra en false. Es usado en un escenario cuando un cliente ordinario pasa a ostentar una membresía dorada
         */

        ClienteDorado clienteDorado5 = new ClienteDorado("Karlee Annie Madison", 1212198743, 'A', (short) 55, 2, 0);

        ClienteDorado clienteDorado6 = new ClienteDorado("Madelein Jerez", 1821934443, 'B', (short) 19, 3, 3000);

        /*
        * INSTANCIACIÓN DE OBJETOS DE LA CLASE PRODUCTO
        * */

        /*
        Creación de un arreglo de objetos, con un total de tres espacios, de la
        clase Producto, con el propósito de almacenar esta cantidad de objetos en el arreglo
        */

        Producto[] productos = new Producto[3];

        /* Instanciación de tres productos dentro del arreglo de productos
        */

        /* Usando el método constructor #1 para crear un objeto dentro del arreglo de objetos de productos, recibiendo todos los parámetros. Este escenario se usa cuando se conoce el nombre, el precio, el código, la disponibilidad y la categoría del producto
         */

        productos[0] = new Producto ("Jabon Rey en barra 1 unidad 250gr", 2500, 1,true, 'A'); // 'A' de Aseo

        /* Usando el método constructor #2 para crear un objeto dentro del arreglo de objetos de productos, recibiendo el nombre, el precio, el código y la categoría, mientras su disponibilidad está en false. Este escenario se usa cuando hay un producto que se encuentra agotado y por ende, no está disponible para venderse
         */

        productos[1] = new Producto("Arroz Sonora Premium arroba 12,5 kg", 47500, 2, 'D'); // 'D' de Despensa

        /* Usando el método constructor #3 para crear un objeto dentro del arreglo de objetos de productos, recibiendo el nombre, el precio, su disponibilidad y la categoría, mientras su código se establece en cero y su categoría en N de Ninguna. Este escenario se usa en caso de que haya un producto sin código determinado y que no tenga una categoría específica
         */

        productos[2] = new Producto ("Tomate chonto paquete 5u", 2000, false);

        /*
        * INSTANCIANDO UN ARREGLO DE OBJETOS PARA SIMPLIFICAR LA IMPRESIÓN DE LOS CLIENTES Y EVITAR EL SOBREUSO DE LA CLÁUSULA SYSTEM.OUT
        * */

        Cliente[] todosLosClientes = {cliente1, cliente2, cliente3, clienteBronce1, clienteBronce2, clienteBronce3, clienteBronce4, clienteBronce5, clienteBronce6, clientePlata1, clientePlata2, clientePlata3, clientePlata4, clientePlata5, clientePlata6, clienteDorado1, clienteDorado2, clienteDorado3, clienteDorado4,clienteDorado5, clienteDorado6};

        /* Usando un ciclo "for", el cual recorra todo el arreglo de objetos y los imprima en consola según su índice */

        for (int i = 0; i < todosLosClientes.length; i++) {
            System.out.println(todosLosClientes[i]);

        }
    }
}