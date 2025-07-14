
package tf_grupo08;
public class Facturacion {
    
    private double precioPizza;
    private double precioBebida;
    private double impuesto;
    private double total;

    // Métodos para obtener el precio de la pizza según tamaño
    public double obtenerPrecioPizza(String tamaño) {
        return switch (tamaño.toLowerCase()) {
            case "media" -> 25;
            case "grande" -> 30;
            case "familiar" -> 40;
            default -> 0;
        };
    }

    // Métodos para obtener el precio de la bebida según marca y tamaño
    public double obtenerPrecioBebida(String marca, int litros) {
        marca = marca.toLowerCase();
        if (marca.equals("coca cola") || marca.equals("inka kola")) {
            switch (litros) {
                case 1 -> {
                    return 4;
                }
                case 2 -> {
                    return 6;
                }
                case 3 -> {
                    return 10;
                }
            }
        } else if (marca.equals("fanta")) {
            switch (litros) {
                case 1 -> {
                    return 3;
                }
                case 2 -> {
                    return 5;
                }
                case 3 -> {
                    return 8;
                }
            }
        }
        return 0;
    }

    // Calcular y mostrar factura
    public void generarFactura(String tamañoPizza, String marcaBebida, int litrosBebida) {
        precioPizza = obtenerPrecioPizza(tamañoPizza);
        precioBebida = obtenerPrecioBebida(marcaBebida, litrosBebida);
        double subtotal = precioPizza + precioBebida;
        impuesto = subtotal * 0.18;
        total = subtotal + impuesto;

        // Mostrar detalle de factura
        System.out.println("========= FACTURA =========");
        System.out.printf("Pizza (%s): $%.2f\n", tamañoPizza, precioPizza);
        System.out.printf("Bebida: %s %dL: $%.2f\n", marcaBebida, litrosBebida, precioBebida);
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Impuesto (18%%): $%.2f\n", impuesto);
        System.out.printf("Total a pagar: $%.2f\n", total);
        System.out.println("===========================");
    }
}
    
