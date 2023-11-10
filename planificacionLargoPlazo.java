import java.util.Scanner;

public class planificacionLargoPlazo {
    private double montoObjetivo;
    private double aportacionMensual;

    public void establecerMeta(double montoObjetivo) {
        this.montoObjetivo = montoObjetivo;
        System.out.println("Opciones de plazo para pagar la meta:");
        System.out.println("1. 6 meses");
        System.out.println("2. 12 meses");
        System.out.println("3. 24 meses");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularAportacionMensual(6);
                break;
            case 2:
                calcularAportacionMensual(12);
                break;
            case 3:
                calcularAportacionMensual(24);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void calcularAportacionMensual(int plazoEnMeses) {
        this.aportacionMensual = montoObjetivo / plazoEnMeses;
        System.out.println("Cuota mensual para pagar en " + plazoEnMeses + " meses: $" + aportacionMensual);
    }

    public static void main(String[] args) {
        

        
    }
}
