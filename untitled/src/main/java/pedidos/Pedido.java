package pedidos;

import java.util.List;

public class Pedido {
    private List<Item> items;
    private String formaDePago;

    public double calcularTotal() {
        double total = 0;
        double gastosEnvio = calcularGastosEnvio(); // Llamada a la función para calcular los gastos de envío

        // Calcular el total de los productos
        for (Item item : items) {
            if (item.isRebajado()) {
                // Aplicar descuento del 15%
                total += item.getPrecio() * 0.8;
            } else {
                total += item.getPrecio();
            }
        }

        // Añadir los gastos de envío al total
        total += gastosEnvio;

        if ("Contrareembolso".equals(formaDePago)) {
            total += 5;
        }
        if (total > 100) {
            total *= 0.9;
        }
        return total;
    }

    private double calcularGastosEnvio() {
        double gastosEnvio = 0;
        for (Item item : items) {
            if (item.getPeso() > 10 || item.getAltura() > 50 || item.getBase() > 50) {
                gastosEnvio += item.getPeso() * 0.5;
            } else {
                gastosEnvio += item.getPeso() * 0.25;
            }
        }
        return gastosEnvio;
    }
}

    //tipo de refactorizacion Extract Method
    //y esto es dublicate code

