/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Clase de Impuestos para el 
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 * 
 */

public class Impuestos {
    protected String nombreDelImpuesto; 
    protected double monto; 

    public Impuestos(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double calcularimpuesto(){
        return 0.0; 
    }
}