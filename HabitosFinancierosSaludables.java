/**
 * Nombre del programa: Aplicación Financiera
 * Descripción: Proyecto 2. Entrega 2
 * Proyecto realizado para la clase de Programación orientada a objetos
 * Autores: Leonardo Mejía, Genser Catalán, Valentina Moreno
 * Fecha de creación: 28 de septiembre de 2023
 * Fecha de última modificación: 05 de octubre de 2023
 * Fuentes de información: [crédito a toda fuente de información que haya aportado al desarrollo del programa]
 * Admin. (2021). ¿Cuáles son los mejores hábitos financieros y cómo adoptarlos? Saber Más, Ser Más. https://www.sabermassermas.com/habitos-financieros/
 */
import java.util.HashMap; 
import java.util.Map; 
import java.util.Random; 

public class HabitosFinancierosSaludables {
    private Map<Integer, String> consejosFinancieros; 

    /**
     * Diccionario con consejos 
     */
    public HabitosFinancierosSaludables() {
        consejosFinancieros = new HashMap<>(); // Diccionario con todos los posibles consejos que le puedo dar al usuario. 
        consejosFinancieros.put(1,"Gestionar un presupuesto: Mantener un registro claro de tus ingresos y gastos te ayudará a optimizar el uso de tus recursos. Categorizar tus gastos en áreas como educación, vivienda, entretenimiento y transporte puede ser beneficioso.");
        consejosFinancieros.put(2,"Ahorro regular: Reservar una parte de tus ingresos de manera consistente te permitirá estar preparado para emergencias, invertir en proyectos futuros y disfrutar de ciertos lujos sin necesidad de pedir préstamos.");
        consejosFinancieros.put(3, "Reducción de deudas: Priorizar el pago de tus obligaciones cada vez que tengas ingresos adicionales te ayudará a ahorrar dinero en intereses. Esto incluye saldar deudas de tarjetas de crédito, hipotecas, préstamos para vehículos o estudios."); 
        consejosFinancieros.put(4,"Inversión inteligente: Invertir tu dinero es una excelente manera de hacerlo crecer, aunque implica ciertos riesgos. Antes de tomar decisiones, considera factores como el plazo, el rendimiento esperado, el riesgo y la información sobre la inversión.");
        consejosFinancieros.put(5,"Planificación financiera: Identifica ingresos y gastos futuros, tanto a corto plazo (como primas laborales o regalos navideños) como a largo plazo (como la jubilación). No dejes nada al azar y elabora un plan financiero sólido.");
        consejosFinancieros.put(6, "Pago puntual: Pagar tus facturas a tiempo es fundamental para mantener una buena reputación en el sistema financiero. Evita dejar los pagos de servicios públicos o privados para el último momento, ya que esto puede llevar a atrasos o morosidad."); 
        consejosFinancieros.put(7,"Protección financiera: Considera mecanismos que te ayuden a mitigar los impactos económicos de eventos imprevistos, como terremotos, accidentes de tráfico o enfermedades. Mantén un fondo de emergencia y, si es posible, adquiere seguros para estas situaciones.");
        consejosFinancieros.put(8,"Educación financiera: Empodérate en tu relación con el sistema financiero mediante la adquisición de conocimientos en educación financiera. Aprovecha cursos y recursos disponibles para mejorar tus habilidades financieras y alcanzar tus metas.");
        consejosFinancieros.put(9, "Controlar los gastos hormiga: Presta atención a los gastos pequeños y frecuentes, como cafés diarios o compras impulsivas. Estos pueden sumar con el tiempo y afectar tu capacidad de ahorro e inversión."); 
        consejosFinancieros.put(10,"Negociar y buscar ofertas: No temas negociar precios o buscar ofertas y descuentos cuando realices compras importantes. Ahorrar dinero en las compras cotidianas puede marcar una gran diferencia en tu presupuesto general.");
        consejosFinancieros.put(11,"Aprender a decir no: Practica la auto disciplina y evita gastos innecesarios o compras impulsivas. Aprender a decir \"no\" cuando se trata de gastos no planificados puede ayudarte a mantener tus finanzas bajo control.");
        consejosFinancieros.put(12, "Automatizar tus finanzas: Configura pagos y ahorros automáticos. Esto garantiza que cumplas con tus obligaciones financieras y ahorres regularmente sin la tentación de gastar ese dinero en otra cosa."); 
        consejosFinancieros.put(13,"Establecer un fondo de emergencia sólido: Aparte del ahorro regular, asegúrate de tener un fondo de emergencia que cubra al menos tres a seis meses de gastos básicos. Esto te proporcionará tranquilidad en caso de imprevistos financieros.");
        consejosFinancieros.put(14,"Compra localmente: Apoya a los negocios locales siempre que puedas. Comprar productos y servicios en la comunidad no solo respalda la economía local, sino que también puede resultar en ahorros debido a la menor necesidad de viajar a lugares más lejanos.");
        consejosFinancieros.put(15, "Presupuesto para proyectos a largo plazo: Si tienes proyectos a largo plazo, como la construcción o renovación de una vivienda, crea un presupuesto detallado y ahorra gradualmente para alcanzar esas metas financieras."); 
    }

    /**
     * @return retorna el consejo segun el numero aleatorio
     */
    public String obtenerConsejo() { //Para escoger un consejo al azar entre los que se encuentran
        Random random = new Random(); 
        int numeroAleatorio=random.nextInt((consejosFinancieros.size())+1);
        return consejosFinancieros.get(numeroAleatorio);
    }
}
