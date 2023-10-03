/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Proyecto 2. Entrega 2
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 */

public class IVA extends Impuestos {
    private double porcentajeIVA;

    public IVA(double monto, double porcentajeIVA) {
        super(monto);
        this.porcentajeIVA = porcentajeIVA;
    }

    @Override
    public double calcularimpuesto() {
        return monto * (porcentajeIVA / 100);
    }
}