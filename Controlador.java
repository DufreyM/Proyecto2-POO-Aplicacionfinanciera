/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Proyecto 2. Entrega 2
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 */

import java.util.Map;
import java.util.Scanner;

public class Controlador {
    private HabitosFinancierosSaludables habitos; 
    private EducacionFinanciera educacionFinanciera;
    private Presupuesto presupuesto;
    private Scanner scanner; 
    private DeudasYCredito deudasyCredito;
    
    public Controlador(){
        scanner = new Scanner(System.in); 
        habitos=new HabitosFinancierosSaludables();
        educacionFinanciera = new EducacionFinanciera();
        presupuesto = new Presupuesto();
        DeudasYCredito deudasYCredito = new DeudasYCredito();
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
                    System.out.println("Bienvenido al tema de Educacion Financiera");
                    System.out.println("Antes de empezar dinos tu edad, para poder darte una experiencia mas personalizada");
                    int edad = scanner.nextInt();
                    educacionFinanciera.setEdadUsuario(edad);
                    System.out.println(edad);
                    

                    break;
                case 3:
                    //AQUI VA DEUDAS Y CRÉDITO
                    System.out.println("------ Menú ------");
                    System.out.println("1. Mostrar Crédito");
                    System.out.println("2. Mostrar Deudas");
                    System.out.println("3. Cancelar Deudas");
                    System.out.println("5. Salir");
                    System.out.println("------------------");

                        System.out.print("Ingresa el número de la opción que deseas realizar: ");
                        int opcioncredito = scanner.nextInt();
            
                        switch (opcioncredito) {
                            case 1:
                                
                                break;
                            case 2:
                             
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                scanner.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, ingresa un número del 1 al 5.");
                        }

                    break;

                case 4:
                //AQUI VA IMPUESTOS
                    System.out.println("Seleccione el tipo de impuesto (1= IVA ; 2= ISR): ");
                    int tipoImpuesto = scanner.nextInt(); 
                    Impuestos impuesto = null; 
                    switch (tipoImpuesto){
                        case 1: //OPCIONES IVA
                            System.out.println("Impuesto seleccionado IVA");
                            System.out.println("Seleccione lo que desea hacer"); 
                            System.out.println("1. Calcular IVA sobre productos");
                            System.out.println("2. Calcular IVA pequeño contribuyente");
                            System.out.println("3. Información sobre IVA");
                            System.out.println("4. Exoneraciones por ley");
                            int ivaopciones = scanner.nextInt();
                            switch (ivaopciones){
                                case 1: 
                                System.out.println("La tarifa es del 12% sobre el valor base"); 
                                System.out.println("Ingrese el valor base"); 
                                double monto = scanner.nextDouble(); 
                                double montoconIVA = monto + (monto*0.12); 
                                System.out.println("El monto ingresado con IVA es de: Q." + montoconIVA); 
                                break; 
                                case 2: 
                                System.out.println("La tarifa es del 5% sobre el monto de ventas o servicios"); 
                                System.out.println("Esto aplica cuando no se exceden los Q. 150,000.00 en un año calendario");
                                System.out.println("Ingrese el valor base"); 
                                double montopc = scanner.nextDouble(); 
                                double montoconIVApc = montopc + (montopc*0.5); 
                                System.out.println("El monto ingresado con IVA es de: Q." + montoconIVApc); 
                                break; 
                                case 3: 
                                System.out.println("El Impuesto al Valor Agregado (IVA) es un impuesto indirecto que grava el valor agregado en cada etapa de la cadena de producción y comercialización. Los contribuyentes registrados deben presentar declaraciones mensuales y pagar el IVA correspondiente a la Superintendencia de Administración Tributaria (SAT) de Guatemala.\r\n" + //
                                        "\r\n" + //
                                        ""); 
                                break; 
                                case 4: 
                                System.out.println("Estan exentos de IVA: ");
                                System.out.println("Colegios Privados, universidades, IGGS, Entidades religiosas, Confederación deportiva y Comité Olímpico"); 
                                break; 
                            }
                            break; 
                            case 2: //OPCIONES IUSI
                            System.out.println("Impuesto seleccionado IUSI");
                            System.out.println("Seleccione lo que desea hacer"); 
                            System.out.println("1. Calcular IUSI sobre bien inmueble");
                            System.out.println("2. Mostrar tabla de tangos IUSI");
                            System.out.println("3. Información sobre IUSI");
                            int iusiopciones = scanner.nextInt();
                            switch (iusiopciones){
                                case 1: 
                                System.out.println("Ingrese el valor de su bien inmueble (sin valor decimal)");
                                double totalIUSI = 0; 
                                int vinmueble = scanner.nextInt(); 
                                if(vinmueble < 2000){
                                    System.out.println("Estas exento de este impuesto");
                                    totalIUSI = 0; 
                                }
                                if(vinmueble > 2000 & vinmueble < 20000){
                                    totalIUSI = vinmueble * 0.002; 
                                }
                                if(vinmueble > 20000 & vinmueble < 70000){
                                    totalIUSI = vinmueble * 0.006; 
                                }
                                if(vinmueble > 70000){
                                    totalIUSI = vinmueble * 0.009; 
                                }
                                    System.out.println("Total a pagar por IUSI es:"+ totalIUSI);
                                break; 
                                case 2: 
                                System.out.println("De Q0 a Q2,000.00 = exento. ");
                                System.out.println("De Q2,000.01 a Q20,000.00 =  0.2 %");
                                System.out.println("De Q20,000.01 a Q70,000.00 = 0.6 %");
                                System.out.println("De Q70,000.01 en adelante = 0.9 %");
                                break; 
                                case 3:
                                System.out.println("El Impuesto Único Sobre Inmuebles, conocido como IUSI, es un tributo municipal que se aplica en Guatemala sobre la propiedad de bienes inmuebles, como terrenos, edificios y construcciones. Este impuesto se calcula en base al valor catastral de la propiedad y se destina a financiar servicios públicos locales, como mantenimiento de calles y obras municipales."); 
                                break; 
                            }

                            break;
                    }

                    break;
                case 5:
                    //AQUI VA SEGUROS
                    System.out.println(Seguros.informacion);
                    System.out.println("Tipos de Seguros:");
                    for (Map.Entry<String, String> entry : Seguros.tipos.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }

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
