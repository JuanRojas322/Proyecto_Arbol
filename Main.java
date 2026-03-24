import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion = 0;

        System.out.println("--- Árbol Binario de Búsqueda ---");

        while (opcion != 4) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido Inorden");
            System.out.println("3. Buscar un número");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            // Validar que la entrada sea un número
            if (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar la entrada incorrecta
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número a insertar: ");
                    int numInsertar = scanner.nextInt();
                    arbol.insertar(numInsertar);
                    System.out.println("Número " + numInsertar + " insertado.");
                    break;
                case 2:
                    arbol.mostrarInorden();
                    break;
                case 3:
                    System.out.print("Ingresa el número a buscar: ");
                    int numBuscar = scanner.nextInt();
                    if (arbol.buscar(numBuscar)) {
                        System.out.println("El número " + numBuscar + " SÍ existe en el árbol.");
                    } else {
                        System.out.println("El número " + numBuscar + " NO existe en el árbol.");
                    }
                    break;
                case 4:
                    System.out.println("¡Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }
}