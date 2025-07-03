package tf_grupo08;

import java.util.Scanner;

public class Menu {

    // Atributos de la clase Menu para la pizza
    private String tamaño;        // Almacena el tamaño elegido por el usuario
    private String masa;          // Almacena el tipo de masa (mantenido por compatibilidad)
    private String queso;         // Almacena la cantidad de queso elegida
    private String salsa;         // Almacena el tipo de salsa elegida
    private String cantidadSalsa; // Almacena la cantidad de salsa elegida
    
    // NUEVOS ATRIBUTOS para las bebidas
    private boolean deseaBebida;  // Almacena si el usuario quiere bebida (true = sí, false = no)
    private String tipoBebida;    // Almacena el tipo de bebida elegida (Coca-Cola, Inka Kola, Fanta)
    private String tamañoBebida;  // Almacena el tamaño de la bebida (personal, 1L, 2L, 3L)
    private boolean conHielo;     // Almacena si quiere la bebida con hielo (true = sí, false = no)

    // Constructor vacío - se usa cuando no pasamos parámetros
    public Menu() {
        // Inicializar los nuevos atributos con valores por defecto
        this.deseaBebida = false;   // Por defecto no quiere bebida
        this.tipoBebida = "";       // Sin bebida seleccionada
        this.tamañoBebida = "";     // Sin tamaño seleccionado
        this.conHielo = false;      // Por defecto sin hielo
    }

    // Constructor con parámetros - se usa cuando ya tenemos los datos
    public Menu(String tamaño, String masa, String queso, String salsa, String cantidadSalsa) {
        this.tamaño = tamaño;           // Asigna el tamaño recibido
        this.masa = masa;               // Asigna la masa recibida
        this.queso = queso;             // Asigna el queso recibido
        this.salsa = salsa;             // Asigna la salsa recibida
        this.cantidadSalsa = cantidadSalsa; // Asigna la cantidad de salsa recibida
        
        // Inicializar los nuevos atributos con valores por defecto
        this.deseaBebida = false;
        this.tipoBebida = "";
        this.tamañoBebida = "";
        this.conHielo = false;
    }

    // Métodos getter y setter para cada atributo existente
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

    // NUEVOS MÉTODOS getter y setter para las bebidas
    public boolean isDeseaBebida() {
        return deseaBebida;  // Devuelve si desea bebida
    }

    public void setDeseaBebida(boolean deseaBebida) {
        this.deseaBebida = deseaBebida;  // Establece si desea bebida
    }

    public String getTipoBebida() {
        return tipoBebida;  // Devuelve el tipo de bebida
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;  // Establece el tipo de bebida
    }

    public String getTamañoBebida() {
        return tamañoBebida;  // Devuelve el tamaño de bebida
    }

    public void setTamañoBebida(String tamañoBebida) {
        this.tamañoBebida = tamañoBebida;  // Establece el tamaño de bebida
    }

    public boolean isConHielo() {
        return conHielo;  // Devuelve si quiere con hielo
    }

    public void setConHielo(boolean conHielo) {
        this.conHielo = conHielo;  // Establece si quiere con hielo
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
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            // Si el usuario escribió un número, devuelve true
            // Si el usuario escribió letras o símbolos, devuelve false
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
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
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
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            // Si el usuario escribió un número, devuelve true
            // Si el usuario escribió letras o símbolos, devuelve false
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
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
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
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            // Si el usuario escribió un número, devuelve true
            // Si el usuario escribió letras o símbolos, devuelve false
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
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
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
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            // Si el usuario escribió un número, devuelve true
            // Si el usuario escribió letras o símbolos, devuelve false
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
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // ***** NUEVOS MÉTODOS PARA LA FUNCIONALIDAD DE BEBIDAS *****

    // Método para preguntar si el usuario desea alguna bebida
    public void preguntarSiDeseaBebida() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- ¿DESEA ALGUNA BEBIDA? ---");
            System.out.println("1. Sí");         // Opción 1 - Sí quiere bebida
            System.out.println("2. No");         // Opción 2 - No quiere bebida
            System.out.print("Ingrese su opción (1-2): ");
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();       // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.deseaBebida = true;  // El usuario SÍ quiere bebida
                        System.out.println("¡Perfecto! Vamos a elegir tu bebida");
                        valido = true;            // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.deseaBebida = false; // El usuario NO quiere bebida
                        System.out.println("De acuerdo, solo será la pizza");
                        valido = true;            // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1 o 2)");
                }
            } else {
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para seleccionar el tipo de bebida (solo se ejecuta si deseaBebida = true)
    public void seleccionarTipoBebida() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- SELECCIÓN DE BEBIDA ---");
            System.out.println("1. Coca-Cola");     // Opción 1
            System.out.println("2. Inka Kola");     // Opción 2
            System.out.println("3. Fanta");         // Opción 3
            System.out.print("Ingrese su opción (1-3): ");
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();          // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.tipoBebida = "Coca-Cola";  // Asignar Coca-Cola
                        System.out.println("Has elegido: Coca-Cola");
                        valido = true;                  // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.tipoBebida = "Inka Kola";  // Asignar Inka Kola
                        System.out.println("Has elegido: Inka Kola");
                        valido = true;                  // Marcar como válido para salir del bucle
                    }
                    case 3 -> {
                        this.tipoBebida = "Fanta";      // Asignar Fanta
                        System.out.println("Has elegido: Fanta");
                        valido = true;                  // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1, 2 o 3)");
                }
            } else {
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para seleccionar el tamaño de la bebida
    public void seleccionarTamañoBebida() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- TAMAÑO DE BEBIDA ---");
            System.out.println("1. Personal");      // Opción 1
            System.out.println("2. 1 litro");       // Opción 2
            System.out.println("3. 2 litros");      // Opción 3
            System.out.println("4. 3 litros");      // Opción 4
            System.out.print("Ingrese su opción (1-4): ");
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();          // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.tamañoBebida = "Personal";  // Asignar tamaño personal
                        System.out.println("Has elegido: Tamaño Personal");
                        valido = true;                   // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.tamañoBebida = "1 litro";   // Asignar 1 litro
                        System.out.println("Has elegido: 1 litro");
                        valido = true;                   // Marcar como válido para salir del bucle
                    }
                    case 3 -> {
                        this.tamañoBebida = "2 litros";  // Asignar 2 litros
                        System.out.println("Has elegido: 2 litros");
                        valido = true;                   // Marcar como válido para salir del bucle
                    }
                    case 4 -> {
                        this.tamañoBebida = "3 litros";  // Asignar 3 litros
                        System.out.println("Has elegido: 3 litros");
                        valido = true;                   // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1, 2, 3 o 4)");
                }
            } else {
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método para preguntar si quiere la bebida con hielo
    public void preguntarSiConHielo() {
        Scanner entrada = new Scanner(System.in);  // Crear objeto Scanner para leer entrada
        int opcion;                                // Variable para almacenar la opción elegida
        boolean valido = false;                    // Variable para controlar si la opción es válida

        // Bucle que se repite hasta que el usuario ingrese una opción válida
        do {
            System.out.println("--- ¿DESEA SU BEBIDA CON HIELO? ---");
            System.out.println("1. Sí");         // Opción 1 - Sí quiere hielo
            System.out.println("2. No");         // Opción 2 - No quiere hielo
            System.out.print("Ingrese su opción (1-2): ");
            
            // hasNextInt() revisa si lo que escribió el usuario es un número
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();       // Leer el número ingresado
                
                // Evaluar la opción elegida
                switch (opcion) {
                    case 1 -> {
                        this.conHielo = true;     // El usuario SÍ quiere hielo
                        System.out.println("Perfecto, su bebida será servida con hielo");
                        valido = true;            // Marcar como válido para salir del bucle
                    }
                    case 2 -> {
                        this.conHielo = false;    // El usuario NO quiere hielo
                        System.out.println("De acuerdo, su bebida será servida sin hielo");
                        valido = true;            // Marcar como válido para salir del bucle
                    }
                    default -> System.out.println("Error: Ingrese una opción válida (1 o 2)");
                }
            } else {
                // Si lo que escribió NO es un número, mostrar error
                System.out.println("Error: Debe ingresar un número");
                entrada.next(); // Limpiar lo que escribió para evitar problemas
            }
            System.out.println(""); // Línea en blanco para mejor presentación
        } while (!valido); // Continuar mientras no sea válido
    }

    // Método principal que ejecuta todo el proceso de selección
    public void procesarPedido() {
        mostrarMenuPrincipal();        // Mostrar el menú de bienvenida
        seleccionarTamaño();           // Llamar al método para elegir tamaño
        seleccionarQueso();            // Llamar al método para elegir queso
        seleccionarTipoSalsa();        // Llamar al método para elegir tipo de salsa
        seleccionarCantidadSalsa();    // Llamar al método para elegir cantidad de salsa
        
        // ***** NUEVA FUNCIONALIDAD DE BEBIDAS *****
        preguntarSiDeseaBebida();      // Preguntar si quiere bebida
        
        // Solo si el usuario quiere bebida, ejecutar los siguientes métodos
        if (this.deseaBebida) {
            seleccionarTipoBebida();    // Elegir tipo de bebida
            seleccionarTamañoBebida();  // Elegir tamaño de bebida
            preguntarSiConHielo();      // Preguntar si quiere hielo
        }
        
        mostrarResumenPedido();        // Mostrar el resumen final del pedido
    }

    // Método para mostrar el resumen del pedido creado (MODIFICADO)
    public void mostrarResumenPedido() {
        System.out.println("===========================================");
        System.out.println("         RESUMEN DE TU PEDIDO             ");
        System.out.println("===========================================");
        
        // Información de la pizza
        System.out.println("PIZZA:");
        System.out.println("- Tamaño: " + this.tamaño);                    // Mostrar tamaño elegido
        System.out.println("- Queso: " + this.queso);                      // Mostrar cantidad de queso
        System.out.println("- Salsa: " + this.salsa);                      // Mostrar tipo de salsa
        System.out.println("- Cantidad de salsa: " + this.cantidadSalsa);  // Mostrar cantidad de salsa
        
        // Información de la bebida (solo si eligió bebida)
        if (this.deseaBebida) {
            System.out.println("");
            System.out.println("BEBIDA:");
            System.out.println("- Tipo: " + this.tipoBebida);               // Mostrar tipo de bebida
            System.out.println("- Tamaño: " + this.tamañoBebida);           // Mostrar tamaño de bebida
            // Mostrar si quiere hielo o no
            if (this.conHielo) {
                System.out.println("- Con hielo: Sí");
            } else {
                System.out.println("- Con hielo: No");
            }
        } else {
            System.out.println("");
            System.out.println("BEBIDA: No seleccionada");
        }
        
        System.out.println("===========================================");
        System.out.println("¡Tu pedido está listo para preparar!");
        System.out.println("===========================================");
    }
}