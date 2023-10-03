/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Proyecto 2. Entrega 2
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 */
import java.util.HashMap; 
import java.util.Map; 
import java.util.Random; 

public class HabitosFinancierosSaludables {
    private Map<Integer, String> consejosFinancieros; 

    public HabitosFinancierosSaludables() {
        consejosFinancieros = new HashMap<>(); // Diccionario con todos los posibles consejos que le puedo dar al usuario. 
        consejosFinancieros.put(1,"a");
        consejosFinancieros.put(2,"e");
        consejosFinancieros.put(3, "i"); 
        consejosFinancieros.put(4,"o");
        consejosFinancieros.put(5,"u");
        consejosFinancieros.put(6, "q"); 
        consejosFinancieros.put(7,"f");
        consejosFinancieros.put(8,"l");
        consejosFinancieros.put(9, "m"); 
        consejosFinancieros.put(10,"n");
        consejosFinancieros.put(11,"o");
        consejosFinancieros.put(12, "p"); 
        consejosFinancieros.put(13,"w");
        consejosFinancieros.put(14,"ñ");
        consejosFinancieros.put(15, "z"); 
    }

    public String obtenerConsejo() { //Para escoger un consejo al azar entre los que se encuentran
        Random random = new Random(); 
        int numeroAleatorio=random.nextInt((consejosFinancieros.size())+1);
        return consejosFinancieros.get(numeroAleatorio);
    }
}
