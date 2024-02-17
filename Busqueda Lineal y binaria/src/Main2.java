import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String[] baseDeDatos = {"Chocolate", "Galletas", "Caramelo", "Pastel", "Helado", "Malvaviscos", "Chicle", "Bombones", "Dulce de leche", "Miel"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el producto que desea buscar:");
        String producto = scanner.nextLine();

        int estante = busquedaLineal(baseDeDatos, producto);

        if (estante == -1) {
            System.out.println("El producto no se encuentra en la base de datos.");
        } else {
            System.out.println("El producto \"" + producto + "\" se encuentra en el estante " + estante);
        }
    }

    public static int busquedaLineal(String[] baseDeDatos, String producto) {
        for (int i = 0; i < baseDeDatos.length; i++) {
            if (baseDeDatos[i].equalsIgnoreCase(producto)) {
                return i;
            }
        }
        return -1;
    }
}
