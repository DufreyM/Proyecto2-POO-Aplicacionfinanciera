import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IUSI {
    private Scanner scanner; 
    private Vista vista;

public IUSI(){
    vista = new Vista(); 
    scanner = new Scanner(System.in); 
    }

    public void calculoIUSI(){ 
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

                                    LocalDateTime fechaHoraActual = LocalDateTime.now();
                                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                                    String fechaHoraFormateada = fechaHoraActual.format(formato);
                                try {
                                FileWriter csvWriter = new FileWriter("iusi-calculos.csv", true);

                                // Escribir datos en el archivo CSV
                                csvWriter.append(String.valueOf(vinmueble));
                                csvWriter.append(",");
                                csvWriter.append(String.valueOf(totalIUSI));
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
                                vista.rangosIUSI();
                                break; 
                                case 3:
                                vista.informacionIUSI();
                                break; 
                                case 4: 
                                
                            }
                }
        }
