import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IVA {
    private Scanner scanner; 

public IVA(){
    scanner = new Scanner(System.in);
}
    public void calculoIVA(){ 
    int ivaopciones = scanner.nextInt();
                            switch (ivaopciones){
                                case 1: 
                                System.out.println("La tarifa es del 12% sobre el valor base"); 
                                System.out.println("Ingrese el valor base"); 
                                double monto = scanner.nextDouble(); 
                                double montoconIVA = monto + (monto*0.12); 
                                System.out.println("El monto ingresado con IVA es de: Q." + montoconIVA); 
                                try {
                                FileWriter csvWriter = new FileWriter("IVA-general.csv", true);

                                // Escribir datos en el archivo CSV
                                LocalDateTime fechaHoraActual = LocalDateTime.now();
                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                String fechaHoraFormateada = fechaHoraActual.format(formato);
                                csvWriter.append(String.valueOf(monto));
                                csvWriter.append(",");
                                csvWriter.append(String.valueOf(montoconIVA));
                                csvWriter.append(",");
                                csvWriter.append(String.valueOf(fechaHoraFormateada));
                                csvWriter.append("\n");

                                csvWriter.flush();
                                csvWriter.close();
                                } catch (IOException e) {
                                e.printStackTrace();
                                }
                                break; 
                                case 2: 
                                System.out.println("La tarifa es del 5% sobre el monto de ventas o servicios"); 
                                System.out.println("Esto aplica cuando no se exceden los Q. 150,000.00 en un año calendario");
                                System.out.println("Ingrese el valor base"); 
                                double montopc = scanner.nextDouble(); 
                                double montoconIVApc = montopc + (montopc*0.05); 
                                System.out.println("El monto ingresado con IVA es de: Q." + montoconIVApc); 
                                try {
                                FileWriter csvWriter = new FileWriter("IVA-pequeñocontribuyente.csv", true);

                                // Escribir datos en el archivo CSV
                                LocalDateTime fechaHoraActual = LocalDateTime.now();
                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                String fechaHoraFormateada = fechaHoraActual.format(formato);
                                csvWriter.append(String.valueOf(montopc));
                                csvWriter.append(",");
                                csvWriter.append(String.valueOf(montoconIVApc));
                                csvWriter.append(",");
                                csvWriter.append(String.valueOf(fechaHoraFormateada));
                                csvWriter.append("\n");

                                csvWriter.flush();
                                csvWriter.close();
                                } catch (IOException e) {
                                e.printStackTrace();
                                }
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
} 
}
