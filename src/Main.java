import java.util.Scanner;

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

        /* Invocando al método auxiliar imprimirDatosArreglos, otorgandole como argumento el arreglo
        de objetos de los productos, con la finalidad de mostrar su información en la consola
         */

        imprimirDatosArreglos(productos);

        /*
        * INSTANCIANDO UN ARREGLO DE OBJETOS PARA SIMPLIFICAR LA IMPRESIÓN DE LOS CLIENTES Y EVITAR EL SOBREUSO DE LA CLÁUSULA SYSTEM.OUT
        * */

        Cliente[] todosLosClientes = {cliente1, cliente2, cliente3, clienteBronce1, clienteBronce2, clienteBronce3, clienteBronce4, clienteBronce5, clienteBronce6, clientePlata1, clientePlata2, clientePlata3, clientePlata4, clientePlata5, clientePlata6, clienteDorado1, clienteDorado2, clienteDorado3, clienteDorado4,clienteDorado5, clienteDorado6};

        /* Invocando al método auxiliar imprimirDatosArreglos, otorgandole como argumento el arreglo
        de objetos de todos los clientes, con la finalidad de imprimir sus datos en consola
         */

        imprimirDatosArreglos(todosLosClientes);

        /*
        * Inicializando una variable de conteo de productos mediante el llamado al método contarProductos
        * */

        int cantidadProductos = contarProductos(productos);

        /*
        * INSTANCIACIÓN DE OBJETOS DE LA CLASE PEDIDO
        * */

        /*
        * Instanciando un arreglo de objetos para almacenar los pedidos
        * */

        Pedido[] pedidos = new Pedido[3];

        // Creando tres objetos de pedidos dentro del arreglo de objetos de pedidos

        pedidos[0] = new Pedido(cliente1, productos, cantidadProductos, "04/09/2025");

        pedidos[1] = new Pedido(cliente1, productos, cantidadProductos, "09/07/2026");

        pedidos[2] = new Pedido(cliente2, productos, cantidadProductos, "19/02/2026");

        // Usando el método calcular el total de la compra de la clase Pedidos

        pedidos[0].calcularTotalCompra();
        pedidos[1].calcularTotalCompra();
        pedidos[2].calcularTotalCompra();

        /*
        * PROGRAMA DE PRUEBA PARA EMULAR UNA EJECUCIÓN EXITOSA EN
        * EL SISTEMA DE PEDIDOS
        *
        * */

        // Llamando a la utilidad Scanner para recibir datos ingresados desde el teclado

        Scanner entrada = new Scanner(System.in);


        // Inicio del programa emulador

        System.out.println("-----------------------------------------");
        System.out.println("-------------PROGRAMA EMULADOR-----------");
        System.out.println("-----------------------------------------");

        // Mostrar la lista de clientes

        System.out.println("¡Bienvenido al programa emulador de prueba");
        System.out.println("para el sistema de pedidos!");

        System.out.println("-----------------------------------------");

        System.out.println("Seleccione un cliente: ");

        /* Ciclo for que recorre el arreglo de objetos de clientes para imprimirlos en pantalla. No se usa el método de impresión, porque
        aquí sólo se va a mostrar el nombre del cliente. Se va a obtener
        mediante un método getter de la superclase Cliente*/

        for (int i = 0; i < todosLosClientes.length; i++) {
            System.out.println(i + ") "+todosLosClientes[i].getNombre());
        }

        int opcion = entrada.nextInt();

        // Seleccionando el cliente del arreglo de objetos que contiene a todos los clientes

        Cliente clienteSeleccionado = todosLosClientes[opcion];

        int optMenu;

        do {
            System.out.println("1) Ver mi información");
            System.out.println("2) Consultar productos");
            System.out.println("3) Consultar mis pedidos");
            System.out.println("4) Salir");

            // Leer opción del menú

            optMenu = entrada.nextInt();

            // Estructura switch para mostrar las diferentes opciones

            switch (optMenu) {

                // 1) VER MI INFORMACIÓN

                case 1:
                    System.out.println(clienteSeleccionado);
                    break;
                // 2) VER LOS PRODUCTOS DISPONIBLES DE LA TIENDA
                case 2:
                    System.out.println("Estos son todos los productos de la tienda: ");

                    // Verificar que los productos de la tienda estén disponibles, y los imprima en consola

                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].getDisponible() == true) {
                            imprimirDatosArreglos(productos);
                        }
                    }

                    break;
                case 3:

                    /* 3) CONSULTAR MIS PEDIDOS */

                    // Recorrer el arreglo de objetos de pedidos para que imprima los pedidos asociados a un usuario por número de identificación

                    for (int i = 0; i < pedidos.length; i++) {

                        if (pedidos[i].getCliente().getIdentificacion() == clienteSeleccionado.getIdentificacion()) {
                            System.out.println("Estos son tus pedidos: ");
                            imprimirDatosArreglos(pedidos);
                        }
                    }
                    break;
                case 4:

                    /* 4) SALIR*/

                    System.out.println("¡Muchas gracias por usar el sistema de pedidos!");
                    break;
                default:
                    System.out.println("Esa opción no es válida :(");
            }

        } while (optMenu != 4);
    }

    /*
     *
     * FUNCIONES AUXILIARES DEL PROGRAMA PRINCIPAL
     *
     * */

    // Función para imprimir datos de los arreglos de objetos

    public static void imprimirDatosArreglos (Object[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    // Función para contar la cantidad de productos (función escalable)

    public static int contarProductos(Producto[] arregloProductos) {
        int contador = 0;
        for(int i = 0; i < arregloProductos.length; i++) {
            if (arregloProductos[i] != null) {
                contador++;
            }
        }
        return contador;
    }


}