package tf_grupo08;

import java.util.Scanner;

public class Menu {

    // Atributos de la clase Menu
    private String tamaño;        // Almacena el tamaño elegido por el usuario
    private String masa;          // Almacena el tipo de masa (mantenido por compatibilidad)
    private String queso;         // Almacena la cantidad de queso elegida
    private String salsa;         // Almacena el tipo de salsa elegida
    private String cantidadSalsa; // Almacena la cantidad de salsa elegida

    // Constructor vacío - se usa cuando no pasamos parámetros
    public Menu() {
    }

    // Constructor con parámetros - se usa cuando ya tenemos los datos
    public Menu(String tamaño, String masa, String queso, String salsa, String cantidadSalsa) {
        this.tamaño = tamaño;           // Asigna el tamaño recibido
        this.masa = masa;               // Asigna la masa recibida
        this.queso = queso;             // Asigna el queso recibido
        this.salsa = salsa;             // Asigna la salsa recibida
        this.cantidadSalsa = cantidadSalsa; // Asigna la cantidad de salsa recibida
    }

    // Métodos getter y setter para cada atributo
    public String getTamaño() {
        return tamaño;  // Devuelve el tamaño actual
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;  // Establece un nuevo tamaño
    }

    public String getMasa() {
        return masa;  // Devuelve la masa actual
    }

    public void setMasa(String masa) {
        this.masa = masa;  // Establece una nueva masa
    }

    public String getQueso() {
        return queso;  // Devuelve la cantidad de queso actual
    }

    public void setQueso(String queso) {
        this.queso = queso;  // Establece una nueva cantidad de queso
    }

    public String getSalsa() {
        return salsa;  // Devuelve el tipo de salsa actual
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;  // Establece un nuevo tipo de salsa
    }

    public String getCantidadSalsa() {
        return cantidadSalsa;  // Devuelve la cantidad de salsa actual
    }

    public void setCantidadSalsa(String cantidadSalsa) {
        this.cantidadSalsa = cantidadSalsa;  // Establece una nueva cantidad de salsa
    }

    // Método para mostrar el menú principal de opciones
    public void mostrarMenuPrincipal() {
        System.out.println("===========================================");
        System.out.println("      BIENVENIDO AL MENÚ DE PIZZAS        ");
        System.out.println("===========================================");
        System.out.println("¡Vamos a crear tu pizza perfecta!");
        System.out.println("");
    }

    // Método para seleccionar el tamaño de la pizza
    public void seleccionarTamaño() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- SELECCIÓN DE TAMAÑO ---");
            System.out.println("1. Mediana");      // Opción 1
            System.out.println("2. Grande");       // Opción 2
            System.out.println("3. Familiar");     // Opción 3
            System.out.print("Ingrese su opción (1-3): ");
            
            // Verificar si el usuario ingresó un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();        // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.tamaño = "Mediana";   // Asignar tamaño mediana
                        System.out.println("Has elegido: Pizza Mediana");
                        valido = true;             // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.tamaño = "Grande";    // Asignar tamaño grande
                        System.out.println("Has elegido: Pizza Grande");
                        valido = true;             // Marcar como válido para salir del bucle
                    }
                    case 3 -> {
                        this.tamaño = "Familiar";  // Asignar tamaño familiar
                        System.out.println("Has elegido: Pizza Familiar");
                        valido = true;             // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1, 2 o 3)");
                }
            } else {
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar el buffer de entrada
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para seleccionar la cantidad de queso
    public void seleccionarQueso() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- SELECCIÓN DE QUESO ---");
            System.out.println("1. Poco queso");     // Opción 1
            System.out.println("2. Queso normal");   // Opción 2
            System.out.println("3. Mucho queso");    // Opción 3
            System.out.print("Ingrese su opción (1-3): ");
            
            // Verificar si el usuario ingresó un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();          // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.queso = "Poco";         // Asignar poco queso
                        System.out.println("Has elegido: Poco queso");
                        valido = true;               // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.queso = "Normal";       // Asignar queso normal
                        System.out.println("Has elegido: Queso normal");
                        valido = true;               // Marcar como válido para salir del bucle
                    }
                    case 3 -> {
                        this.queso = "Mucho";        // Asignar mucho queso
                        System.out.println("Has elegido: Mucho queso");
                        valido = true;               // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1, 2 o 3)");
                }
            } else {
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar el buffer de entrada
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para seleccionar el tipo de salsa
    public void seleccionarTipoSalsa() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- SELECCIÓN DE SALSA ---");
            System.out.println("1. Salsa de tomate natural");  // Opción 1
            System.out.println("2. Salsa BBQ");                // Opción 2
            System.out.print("Ingrese su opción (1-2): ");
            
            // Verificar si el usuario ingresó un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();                     // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.salsa = "Tomate natural";          // Asignar salsa de tomate
                        System.out.println("Has elegido: Salsa de tomate natural");
                        valido = true;                          // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.salsa = "BBQ";                     // Asignar salsa BBQ
                        System.out.println("Has elegido: Salsa BBQ");
                        valido = true;                          // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1 o 2)");
                }
            } else {
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar el buffer de entrada
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para seleccionar la cantidad de salsa
    public void seleccionarCantidadSalsa() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- CANTIDAD DE SALSA ---");
            System.out.println("1. Poca salsa");      // Opción 1
            System.out.println("2. Salsa normal");    // Opción 2
            System.out.println("3. Mucha salsa");     // Opción 3
            System.out.print("Ingrese su opción (1-3): ");
            
            // Verificar si el usuario ingresó un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();           // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.cantidadSalsa = "Poca";  // Asignar poca salsa
                        System.out.println("Has elegido: Poca salsa");
                        valido = true;                // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.cantidadSalsa = "Normal"; // Asignar salsa normal
                        System.out.println("Has elegido: Salsa normal");
                        valido = true;                // Marcar como válido para salir del bucle
                    }
                    case 3 -> {
                        this.cantidadSalsa = "Mucha"; // Asignar mucha salsa
                        System.out.println("Has elegido: Mucha salsa");
                        valido = true;                // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1, 2 o 3)");
                }
            } else {
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar el buffer de entrada
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método principal que ejecuta todo el proceso de selección
    public void procesarPedido() {
        mostrarMenuPrincipal();     // Mostrar el menú de bienvenida
        seleccionarTamaño();        // Llamar al método para elegir tamaño
        seleccionarQueso();         // Llamar al método para elegir queso
        seleccionarTipoSalsa();     // Llamar al método para elegir tipo de salsa
        seleccionarCantidadSalsa(); // Llamar al método para elegir cantidad de salsa
        mostrarResumenPedido();     // Mostrar el resumen final del pedido
    }

    // Método para mostrar el resumen del pedido creado
    public void mostrarResumenPedido() {
        System.out.println("===========================================");
        System.out.println("         RESUMEN DE TU PEDIDO             ");
        System.out.println("===========================================");
        System.out.println("Tamaño: " + this.tamaño);                    // Mostrar tamaño elegido
        System.out.println("Queso: " + this.queso);                      // Mostrar cantidad de queso
        System.out.println("Salsa: " + this.salsa);                      // Mostrar tipo de salsa
        System.out.println("Cantidad de salsa: " + this.cantidadSalsa);  // Mostrar cantidad de salsa
        System.out.println("===========================================");
        System.out.println("¡Tu pizza está lista para preparar!");
        System.out.println("===========================================");
    }
}