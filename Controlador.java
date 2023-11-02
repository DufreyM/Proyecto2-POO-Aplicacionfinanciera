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
    private DeudasYCredito cuenta;
    private Vista vista;
    private IVA IVA; 
    private IUSI IUSI;
    
    public Controlador(){
        scanner = new Scanner(System.in); 
        habitos=new HabitosFinancierosSaludables();
        educacionFinanciera = new EducacionFinanciera();
        presupuesto = new Presupuesto();
        cuenta = new DeudasYCredito();
        vista = new Vista(); 
        IVA = new IVA();
        IUSI = new IUSI(); 
    }

    public void ejecutar(){
        boolean continuar = true;

        while (continuar) {
            vista.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Por si se queda un espacio flotando :)

            switch (opcion) { 
                case 1:
                    //AQUI VA PRESUPUESTO 
                    presupuesto.calculopresupues(); 
            break;
                    
                    
                case 2:
                    //AQUI VA LA FUNCIÓN DE EDUCACIÓN FINANCIERA PERSONAL
                    System.out.println("Bienvenido al tema de Educacion Financiera");
                    System.out.println("Antes de empezar dinos tu edad, para poder darte una experiencia mas personalizada");
                    int edad = scanner.nextInt();
                    educacionFinanciera.setEdadUsuario(edad);
                    if (edad > 18){
                        vista.opcionesplanificacion();
                        int opcionEducacionAdul = scanner.nextInt();
                        switch (opcionEducacionAdul){
                            case 1:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.planificacionFinancieraPersonalAdul();

                            case 2: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.ahorroInversionAdul();

                            case 3: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.gestionDeDeudasAdul();

                            case 4:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.educacionSobreImpuestosAdul();

                            case 5: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.manejoDelCreditoAdul();

                            case 6: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.planificacionParaElFuturoAdul();

                            default:
                            System.out.println("La opcion ingresada no es valida");

                        }

                    }

                    if (edad <= 18){
                        vista.opcionesplanificacion();
                        int opcionEducacionAdol = scanner.nextInt();

                        switch(opcionEducacionAdol){
                            case 1:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.planificacionFinancieraPersonalAdul();

                            case 2: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.ahorroInversionAdolescente();

                            case 3:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.gestionDeDineroAdolescente();

                            case 4:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.educacionSobreImpuestoAdolescente();

                            case 5: 
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.manejoDelCreditoAdolescente();

                            case 6:
                            System.out.println("Aprendamos juntos\n");
                            educacionFinanciera.planificacionParaElFuturoAdolescente();

                            default:
                            System.out.println("La opcion ingresada no es valida");
                        }
                    }
                    
                    break;
                case 3:
                    //AQUI VA DEUDAS Y CRÉDITO
                    cuenta.ejecutarcuenta();
                    break;

                case 4:
                //AQUI VA IMPUESTOS
                    System.out.println("Seleccione el tipo de impuesto (1= IVA ; 2= IUSI): ");
                    int tipoImpuesto = scanner.nextInt(); 
                    switch (tipoImpuesto){
                        case 1: //OPCIONES IVA
                            vista.IVA();
                            IVA.calculoIVA();
                            break; 
                            case 2: //OPCIONES IUSI
                            vista.IUSI();
                            IUSI.calculoIUSI();
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
    
}
