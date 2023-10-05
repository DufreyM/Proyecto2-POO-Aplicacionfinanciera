import java.util.HashMap;
import java.util.Map;

public class Seguros {
    public static Map<String, String> tipos = new HashMap<>();

    static {
        tipos.put("Seguro de Vida", "Ofrece protección financiera a los beneficiarios en caso de fallecimiento del asegurado.");
        tipos.put("Seguro de Salud", "Cubre los gastos médicos y hospitalarios del asegurado.");
        tipos.put("Seguro de Automóvil", "Proporciona cobertura en caso de accidente o robo del vehículo asegurado.");
    }

    public static String informacion = "Un seguro financiero es un contrato en el cual una entidad (la aseguradora) proporciona garantía de compensación por un evento futuro incierto que pueda causar pérdida financiera.";
}
