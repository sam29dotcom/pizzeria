package tf_grupo08;

import java.util.Scanner;

public class Menu {

    private String tamaño;
    private String masa;
    private String queso;
    private String salsa;
    private String cantidadSalsa;
    private boolean deseaBebida;
    private String tipoBebida;
    private String tamañoBebida;
    private boolean conHielo;

    public Menu() {
        this.deseaBebida = false;
        this.tipoBebida = "";
        this.tamañoBebida = "";
        this.conHielo = false;
    }

    public Menu(String tamaño, String masa, String queso, String salsa, String cantidadSalsa) {
        this.tamaño = tamaño;
        this.masa = masa;
        this.queso = queso;
        this.salsa = salsa;
        this.cantidadSalsa = cantidadSalsa;
        this.deseaBebida = false;
        this.tipoBebida = "";
        this.tamañoBebida = "";
        this.conHielo = false;
    }

    // Getters y Setters
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getCantidadSalsa() {
        return cantidadSalsa;
    }

    public void setCantidadSalsa(String cantidadSalsa) {
        this.cantidadSalsa = cantidadSalsa;
    }

    public boolean isDeseaBebida() {
        return deseaBebida;
    }

    public void setDeseaBebida(boolean deseaBebida) {
        this.deseaBebida = deseaBebida;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public String getTamañoBebida() {
        return tamañoBebida;
    }

    public void setTamañoBebida(String tamañoBebida) {
        this.tamañoBebida = tamañoBebida;
    }

    public boolean isConHielo() {
        return conHielo;
    }

    public void setConHielo(boolean conHielo) {
        this.conHielo = conHielo;
    }

    public void mostrarMenuPrincipal() {
        System.out.println("===========================================");
        System.out.println("      BIENVENIDO AL MENÚ DE PIZZAS        ");
        System.out.println("===========================================");
        System.out.println("¡Vamos a crear tu pizza perfecta!");
        System.out.println("");
    }

    private int leerOpcion(Scanner entrada, int min, int max) {
        int opcion;
        while (true) {
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.printf("Error: Ingrese una opción válida (%d-%d): ", min, max);
                }
            } else {
                System.out.println("Error: Debe ingresar un número");
                entrada.next();
            }
        }
    }

    public void seleccionarTamaño() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- SELECCIÓN DE TAMAÑO ---");
        System.out.println("1. Mediana\n2. Grande\n3. Familiar");
        System.out.print("Ingrese su opción (1-3): ");

        int opcion = leerOpcion(entrada, 1, 3);
        String[] tamaños = {"", "Mediana", "Grande", "Familiar"};
        this.tamaño = tamaños[opcion];
        System.out.println("Has elegido: Pizza " + this.tamaño + "\n");
    }

    public void seleccionarQueso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- SELECCIÓN DE QUESO ---");
        System.out.println("1. Poco queso\n2. Queso normal\n3. Mucho queso");
        System.out.print("Ingrese su opción (1-3): ");

        int opcion = leerOpcion(entrada, 1, 3);
        String[] quesos = {"", "Poco", "Normal", "Mucho"};
        this.queso = quesos[opcion];
        System.out.println("Has elegido: " + (opcion == 2 ? "Queso normal" : quesos[opcion] + " queso") + "\n");
    }

    public void seleccionarTipoSalsa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- SELECCIÓN DE SALSA ---");
        System.out.println("1. Salsa de tomate natural\n2. Salsa BBQ");
        System.out.print("Ingrese su opción (1-2): ");

        int opcion = leerOpcion(entrada, 1, 2);
        this.salsa = (opcion == 1) ? "Tomate natural" : "BBQ";
        System.out.println("Has elegido: Salsa " + (opcion == 1 ? "de tomate natural" : "BBQ") + "\n");
    }

    public void seleccionarCantidadSalsa() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- CANTIDAD DE SALSA ---");
        System.out.println("1. Poca salsa\n2. Salsa normal\n3. Mucha salsa");
        System.out.print("Ingrese su opción (1-3): ");

        int opcion = leerOpcion(entrada, 1, 3);
        String[] cantidades = {"", "Poca", "Normal", "Mucha"};
        this.cantidadSalsa = cantidades[opcion];
        System.out.println("Has elegido: " + cantidades[opcion] + " salsa\n");
    }

    public void preguntarSiDeseaBebida() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- ¿DESEA ALGUNA BEBIDA? ---");
        System.out.println("1. Sí\n2. No");
        System.out.print("Ingrese su opción (1-2): ");

        int opcion = leerOpcion(entrada, 1, 2);
        this.deseaBebida = (opcion == 1);
        System.out.println(deseaBebida ? "¡Perfecto! Vamos a elegir tu bebida" : "De acuerdo, solo será la pizza");
        System.out.println("");
    }

    public void seleccionarTipoBebida() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- SELECCIÓN DE BEBIDA ---");
        System.out.println("1. Coca-Cola\n2. Inka Kola\n3. Fanta");
        System.out.print("Ingrese su opción (1-3): ");

        int opcion = leerOpcion(entrada, 1, 3);
        String[] bebidas = {"", "Coca-Cola", "Inka Kola", "Fanta"};
        this.tipoBebida = bebidas[opcion];
        System.out.println("Has elegido: " + this.tipoBebida + "\n");
    }

    public void seleccionarTamañoBebida() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- TAMAÑO DE BEBIDA ---");
        System.out.println("1. Personal\n2. 1 litro\n3. 2 litros\n4. 3 litros");
        System.out.print("Ingrese su opción (1-4): ");

        int opcion = leerOpcion(entrada, 1, 4);
        String[] tamaños = {"", "Personal", "1 litro", "2 litros", "3 litros"};
        this.tamañoBebida = tamaños[opcion];
        System.out.println("Has elegido: " + (opcion == 1 ? "Tamaño Personal" : this.tamañoBebida) + "\n");
    }

    public void preguntarSiConHielo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- ¿DESEA SU BEBIDA CON HIELO? ---");
        System.out.println("1. Sí\n2. No");
        System.out.print("Ingrese su opción (1-2): ");

        int opcion = leerOpcion(entrada, 1, 2);
        this.conHielo = (opcion == 1);
        System.out.println(conHielo ? "Perfecto, su bebida será servida con hielo" : "De acuerdo, su bebida será servida sin hielo");
        System.out.println("");
    }

    public boolean preguntarNuevoPedido() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- ¿QUIERES HACER UN NUEVO PEDIDO? ---");
        System.out.println("1. Sí\n2. No");
        System.out.print("Ingrese su opción (1-2): ");

        int opcion = leerOpcion(entrada, 1, 2);
        boolean nuevoPedido = (opcion == 1);
        System.out.println(nuevoPedido ? "¡Perfecto! Vamos a crear un nuevo pedido" : "¡Gracias por tu compra! ¡Hasta pronto!");
        System.out.println("");
        return nuevoPedido;
    }

    public void reiniciarPedido() {
        this.tamaño = null;
        this.masa = null;
        this.queso = null;
        this.salsa = null;
        this.cantidadSalsa = null;
        this.deseaBebida = false;
        this.tipoBebida = "";
        this.tamañoBebida = "";
        this.conHielo = false;
    }

    public void iniciarSistema() {
        boolean continuarPidiendo = true;
        while (continuarPidiendo) {
            procesarPedido();
            continuarPidiendo = preguntarNuevoPedido();
            if (continuarPidiendo) {
                reiniciarPedido();
                System.out.println("");
            }
        }
    }

    public void procesarPedido() {
        mostrarMenuPrincipal();
        seleccionarTamaño();
        seleccionarQueso();
        seleccionarTipoSalsa();
        seleccionarCantidadSalsa();
        preguntarSiDeseaBebida();

        if (this.deseaBebida) {
            seleccionarTipoBebida();
            seleccionarTamañoBebida();
            preguntarSiConHielo();
        }

        mostrarResumenPedido();
    }

    public void mostrarResumenPedido() {
        System.out.println("===========================================");
        System.out.println("         RESUMEN DE TU PEDIDO             ");
        System.out.println("===========================================");
        System.out.println("PIZZA:");
        System.out.println("- Tamaño: " + this.tamaño);
        System.out.println("- Queso: " + this.queso);
        System.out.println("- Salsa: " + this.salsa);
        System.out.println("- Cantidad de salsa: " + this.cantidadSalsa);

        if (this.deseaBebida) {
            System.out.println("\nBEBIDA:");
            System.out.println("- Tipo: " + this.tipoBebida);
            System.out.println("- Tamaño: " + this.tamañoBebida);
            System.out.println("- Con hielo: " + (this.conHielo ? "Sí" : "No"));
        } else {
            System.out.println("\nBEBIDA: No seleccionada");
        }

        System.out.println("===========================================");
        generarFactura();
    }

    public void generarFactura() {
        Facturacion factura = new Facturacion();
        String tamañoPizza = convertirTamañoPizza(this.tamaño);

        if (this.deseaBebida) {
            int litrosBebida = convertirTamañoBebida(this.tamañoBebida);
            factura.generarFactura(tamañoPizza, this.tipoBebida, litrosBebida);
        } else {
            factura.generarFactura(tamañoPizza, "", 0);
        }
    }

    private String convertirTamañoPizza(String tamaño) {
        return switch (tamaño.toLowerCase()) {
            case "mediana" ->
                "media";
            case "grande" ->
                "grande";
            case "familiar" ->
                "familiar";
            default ->
                "media";
        };
    }

    private int convertirTamañoBebida(String tamañoBebida) {
        return switch (tamañoBebida.toLowerCase()) {
            case "1 litro" ->
                1;
            case "2 litros" ->
                2;
            case "3 litros" ->
                3;
            default ->
                0;
        };
    }
}
