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
    
    public Controlador(){
        scanner = new Scanner(System.in); 
        habitos=new HabitosFinancierosSaludables();
        educacionFinanciera = new EducacionFinanciera();
        presupuesto = new Presupuesto();
        cuenta = new DeudasYCredito();
        vista = new Vista(); 
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
                    System.out.println("\nBienvenido al simulador del presupuesto");
                    System.out.println("A continuacion ingresa tu ingreso mensual, únicamente números enteros (0000)");
                    int presu = scanner.nextInt();
                    presupuesto.setPresupuesto(presu);

                    while (presu > 0) {
                        System.out.println("\nTu presupuesto actual es de: " + presu);
                        System.out.println("Ingresa la cantidad que desees dedicar a los gastos básicos");
                        System.out.println("(Comida, Salud, Vivienda, Transporte y demás)");
                        int basicas = scanner.nextInt();
                        presupuesto.setNecesidades_basicas(basicas);
                        double presupuestoRestante = presupuesto.CalculosNecesidadesBasicas();
                        System.out.println("\nTe quedan $" + presupuestoRestante + " para otras categorías.");

                        if (presupuestoRestante < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a deudas y pagos");
                        int deudas = scanner.nextInt();
                        presupuesto.setDeudas_pagos(deudas);
                        double presupuestoRestante2 = presupuesto.CalculosDeudasPagos();
                        System.out.println("\nTe quedan $" + presupuestoRestante2 + " para otras categorías.");

                        if (presupuestoRestante2 < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a Actividades recreativas");
                        int actividades = scanner.nextInt();
                        presupuesto.setActividades_recreativas(actividades);
                        double presupuestoRestante3 = presupuesto.CalculosActividadesRecreativas();
                        System.out.println("\nTe quedan $" + presupuestoRestante3 + " para otras categorías.");

                        if (presupuestoRestante3 < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a Ahorro");
                        int ahorrar = scanner.nextInt();
                        presupuesto.setAhorro(ahorrar);
                        double presupuestoRestante4 = presupuesto.CalculosAhorro();

                        if (presupuestoRestante4 < 0) {
                            System.out.println("Oh no! Te quedaste sin presupuesto");
                            break; // Terminar el programa si presupuestoRestante4 es menor a 0
                        }

                        System.out.println("\nFelicidades te quedan $" + presupuestoRestante4 + " libres para ti");

                        // Terminar el programa después de mostrar el mensaje de felicitación
                        break;
                    }
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
                    System.out.println("Seleccione el tipo de impuesto (1= IVA ; 2= ISR): ");
                    int tipoImpuesto = scanner.nextInt(); 
                    switch (tipoImpuesto){
                        case 1: //OPCIONES IVA
                            vista.IVA();
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
                                vista.exentosIVA();
                                break; 
                            }
                            break; 
                            case 2: //OPCIONES IUSI
                            vista.IUSI();
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
                                vista.rangosIUSI();
                                break; 
                                case 3:
                                vista.informacionIUSI();
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
    
}
