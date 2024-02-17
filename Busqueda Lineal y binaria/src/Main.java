import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] baseDeDatos = {"Bombones", "Caramelo", "Chicle", "Chocolate", "Dulce de leche", "Galletas", "Helado", "Malvaviscos", "Miel", "Pastel"};
        Arrays.sort(baseDeDatos);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el producto que desea buscar:");
        String producto = scanner.nextLine();

        int estante = busquedaBinaria(baseDeDatos, producto);

        if (estante == -1) {
            System.out.println("El producto no se encuentra en la base de datos.");
        } else {
            System.out.println("El producto \"" + producto + "\" se encuentra en el estante " + estante);
        }
    }

    public static int busquedaBinaria(String[] baseDeDatos, String producto) {
        int izquierda = 0;
        int derecha = baseDeDatos.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = producto.compareTo(baseDeDatos[medio]);

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                derecha = medio - 1;
            } else {
                izquierda = medio + 1;
            }
        }
        return -1;
    }
}
