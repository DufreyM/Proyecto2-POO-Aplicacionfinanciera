/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Proyecto 2. Entrega 2
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 */

import java.util.Scanner;

public class Controlador {
    private HabitosFinancierosSaludables habitos; 
    private Scanner scanner; 
    
    public Controlador(){
        scanner = new Scanner(System.in); 
        habitos=new HabitosFinancierosSaludables();
    }

    public void ejecutar(){
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Por si se queda un espacio flotando :)

            switch (opcion) { //Switch con los posibles casos según el menú. 
                case 1:
                    //AQUI VA PRESUPUESTO Y AHORRO 

                    break;
                case 2:
                    //AQUI VA LA FUNCIÓN DE EDUCACIÓN FINANCIERA PERSONAL 

                    break;
                case 3:
                    //AQUI VA DEUDAS Y CRÉDITO
                    
                    break;
                case 4:
                //AQUI VA IMPUESTOS
                    
                    break;
                case 5:
                    //AQUI VA SEGUROS
                    break;
                case 6:
                   //AQUI VA HÁBITOS FINANCIEROS SALUDABLES
                    String consejoAleatorio = habitos.obtenerConsejo();
                    System.out.println("------------------------------------------------------");
                    System.out.println("CONSEJO FINANCIERO SALUDABLE");
                    System.out.println("------------------------------------------------------");
                    System.out.println(consejoAleatorio); 
                    break;
                case 7: 
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 6."); //Verifica si el usuario ingresa un caso válido
                    break;
            }
        }

        System.out.println("Gracias por usar el sistema. ¡Hasta luego!"); //Despide al usuario
    }

    /**
     * 
     */
    private void mostrarMenu() { //Imprime el menú
        System.out.println("\nMenú:");
        System.out.println("1. Presupuesto y ahorro");
        System.out.println("2. Educación Financiera Personal");
        System.out.println("3. Deudas y Crédito");
        System.out.println("4. Impuestos");
        System.out.println("5. Seguro");
        System.out.println("6. Hábitos financieros saludables");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
