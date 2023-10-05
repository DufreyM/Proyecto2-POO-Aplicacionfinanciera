import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("------ Menú ------");
        System.out.println("1. Mostrar Crédito");
        System.out.println("2. Mostrar Deudas");
        System.out.println("3. Cancelar Deudas");
        System.out.println("4. Información de Seguros");
        System.out.println("5. Salir");
        System.out.println("------------------");
    }

    public static void ejecutar() {
        DeudasYCredito deudasYCredito = new DeudasYCredito();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();

            System.out.print("Ingresa el número de la opción que deseas realizar: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    deudasYCredito.mostrarCredito();
                    break;
                case "2":
                    deudasYCredito.mostrarDeudas();
                    break;
                case "3":
                    deudasYCredito.cancelarDeudas();
                    break;
                case "4":
                    System.out.println(Seguros.informacion);
                    System.out.println("Tipos de Seguros:");
                    for (Map.Entry<String, String> entry : Seguros.tipos.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case "5":
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa un número del 1 al 5.");
            }
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
