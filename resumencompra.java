import java.util.Scanner;

public class resumencompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedimos el nombre del producto
        System.out.print("Ingrese el nombre del producto: ");
        String producto = teclado.nextLine();

        // Pedimos el precio
        System.out.print("Ingrese el precio: ");
        double precio = teclado.nextDouble();

        // Declaramos la variable para el porcentaje de descuento
        double descuento;

        // Estructura de decisión (condicional múltiple)
        if (precio >= 500000) {
            descuento = 20;
        } else if (precio >= 300000) {
            descuento = 15;
        } else if (precio >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        // Definimos el IVA (19%) y realizamos los cálculos
        double iva = 19;
        double valorDescuento = precio * descuento / 100;
        double subtotal = precio - valorDescuento;
        double valorIva = subtotal * iva / 100;
        double total = subtotal + valorIva;

        // Imprimimos el resumen
        System.out.println("\n========== RESUMEN DE COMPRA ==========");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Valor descuento: $" + valorDescuento);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + valorIva);
        System.out.println("TOTAL: $" + total);
    }
}