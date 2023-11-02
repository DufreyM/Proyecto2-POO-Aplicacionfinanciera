import java.util.Scanner;

public class DeudasYCredito {
    private double deudas;
    private double credito;
    private double tasaInteres;
    Scanner scanner = new Scanner(System.in);

    public DeudasYCredito() {
        this.deudas = 0;
        this.credito = 0;
        this.tasaInteres = 0.05; // Tasa de interés del 5% 
    }

    public void mostrarCredito() {
        System.out.println("Cantidad de crédito actual: " + this.credito);
    }

    public void mostrarDeudas() {
        double deudas = this.credito + (this.credito * this.tasaInteres); 
        System.out.println("Cantidad de deudas: " + deudas);
    }

    public void tomarPrestamo(double cantidad) {
        if (cantidad > 0) {
            this.credito += cantidad;
            System.out.println("Has tomado un préstamo de " + cantidad + " de crédito.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    public void pagarDeuda(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= this.deudas) {
                this.credito -= cantidad;
                System.out.println("Has pagado " + cantidad + " de deuda.");
            } else {
                System.out.println("La cantidad a pagar es mayor que tu deuda actual.");
            }
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    public void calcularInteres() {
        double interes = this.credito * this.tasaInteres;
        this.credito += interes;
        System.out.println("Se ha calculado un interés de " + interes + " sobre tus deudas.");
    }

            public void ejecutarcuenta(){
            
            
            System.out.println("Menú:");
            System.out.println("1. Mostrar información sobre deuda y crédito");
            System.out.println("2. Tomar préstamo");
            System.out.println("3. Pagar deuda");
            System.out.println("4. Calcular interés sobre deuda");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opciondeudas = scanner.nextInt();

            switch (opciondeudas) {
                case 1:
                    System.out.println("Una deuda es una cantidad de dinero que debes a alguien o alguna entidad.");
                    System.out.println("Un crédito es una cantidad de dinero que te han prestado y que debes devolver.");
                    mostrarCredito();
                    mostrarDeudas();
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad de crédito que deseas tomar prestado: ");
                    double prestamo = scanner.nextDouble();
                    tomarPrestamo(prestamo);
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad de deuda que deseas pagar: ");
                    double pago = scanner.nextDouble();
                    pagarDeuda(pago);
                    break;
                case 4:
                    calcularInteres();
                    break;
            }
        }
    }

