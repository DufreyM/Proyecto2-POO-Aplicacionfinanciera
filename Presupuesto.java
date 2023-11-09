//Fecha de creación: 05 de septiembre de 2023
//Fecha de última modificación: 05 de octubre de 2023

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Presupuesto {
    private double presupuesto;
    private double necesidades_basicas;
    private double deudas_pagos;
    private double actividades_recreativas;
    private double ahorro;
    private Scanner scanner;
    private String nombreArchivo;

    public Presupuesto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo; 
        presupuesto = 0;
        necesidades_basicas = 0;
        deudas_pagos = 0;
        actividades_recreativas = 0;
        ahorro = 0;
        scanner = new Scanner(System.in);
    }

    public Presupuesto(int presupuesto, int necesidades_basicas, int deudas_pagos, int actividades_recreativas,
            int ahorro, String nombreArchivo) {
        this.presupuesto = presupuesto;
        this.necesidades_basicas = necesidades_basicas;
        this.deudas_pagos = deudas_pagos;
        this.actividades_recreativas = actividades_recreativas;
        this.ahorro = ahorro;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    public double getNecesidades_basicas() {
        return necesidades_basicas;
    }
    public void setNecesidades_basicas(double necesidades_basicas) {
        this.necesidades_basicas = necesidades_basicas;
    }
    public double getDeudas_pagos() {
        return deudas_pagos;
    }
    public void setDeudas_pagos(double deudas_pagos) {
        this.deudas_pagos = deudas_pagos;
    }
    public double getActividades_recreativas() {
        return actividades_recreativas;
    }
    public void setActividades_recreativas(double actividades_recreativas) {
        this.actividades_recreativas = actividades_recreativas;
    }
    public double getAhorro() {
        return ahorro;
    }
    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }

    /**
     * @return
     */
    public double CalculosNecesidadesBasicas(){
        double resultados_presupuesto1 = presupuesto - necesidades_basicas;
        return resultados_presupuesto1;
    }

    public double CalculosDeudasPagos(){
        double resultados_presupuesto2 = presupuesto - necesidades_basicas - deudas_pagos;
        return resultados_presupuesto2;
    }

    public double CalculosActividadesRecreativas(){
        double resultados_presupuesto3 = presupuesto - necesidades_basicas - deudas_pagos - actividades_recreativas;
        return resultados_presupuesto3;
    }

    /**
     * Calcula el ahorro
     * @return double El ahorro del usuario
     */
    public double CalculosAhorro(){
        double resultados_presupuesto4 = presupuesto - necesidades_basicas - deudas_pagos - actividades_recreativas - ahorro;
        return resultados_presupuesto4;
    }

    public void calculopresupues(){
        System.out.println("\nBienvenido al simulador del presupuesto");
                    System.out.println("A continuacion ingresa tu ingreso mensual");
                    double presu = scanner.nextDouble();
                    setPresupuesto(presu);

                    while (presu > 0) {
                        System.out.println("\nTu presupuesto actual es de: " + presu);
                        System.out.println("Ingresa la cantidad que desees dedicar a los gastos básicos");
                        System.out.println("(Comida, Salud, Vivienda, Transporte y demás)");
                        double basicas = scanner.nextDouble();
                        setNecesidades_basicas(basicas);
                        double presupuestoRestante = CalculosNecesidadesBasicas();
                        System.out.println("\nTe quedan $" + presupuestoRestante + " para otras categorías.");

                        if (presupuestoRestante < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a deudas y pagos");
                        double deudas = scanner.nextDouble();
                        setDeudas_pagos(deudas);
                        double presupuestoRestante2 = CalculosDeudasPagos();
                        System.out.println("\nTe quedan $" + presupuestoRestante2 + " para otras categorías.");

                        if (presupuestoRestante2 < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a Actividades recreativas");
                        double actividades = scanner.nextDouble();
                        setActividades_recreativas(actividades);
                        double presupuestoRestante3 = CalculosActividadesRecreativas();
                        System.out.println("\nTe quedan $" + presupuestoRestante3 + " para otras categorías.");

                        if (presupuestoRestante3 < 0){
                            System.out.println("Oh no! El presupuesto no a alzanzado");
                            break;
                        }
                    
                        System.out.println("Ingresa la cantidad que desees dedicar a Ahorro");
                        double ahorrar = scanner.nextDouble();
                        setAhorro(ahorrar);
                        double presupuestoRestante4 = CalculosAhorro();

                        if (presupuestoRestante4 < 0) {
                            System.out.println("Oh no! Te quedaste sin presupuesto");
                            break; // Terminar el programa si presupuestoRestante4 es menor a 0
                        }

                        System.out.println("\nFelicidades te quedan $" + presupuestoRestante4 + " libres para ti");

                        // Terminar el programa después de mostrar el mensaje de felicitación
                        break;
                    }
    }

    //Metodo para Guardar datos en el CSV
    public void guardarEnCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, false))) {
            writer.write("Presupuesto, Necesidades Basicas, Deuda Pagos, Actividades Recreativas, Ahorro");
            writer.newLine();
            writer.write(presupuesto + "," + necesidades_basicas + "," + deudas_pagos + "," + actividades_recreativas + "," + ahorro);
            writer.newLine();
            System.out.println("Datos guardados en el archivo CSV.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo CSV: " + e.getMessage());
        }
    }

}

