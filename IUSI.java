import java.util.Scanner;

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
                                break; 
                                case 2: 
                                vista.rangosIUSI();
                                break; 
                                case 3:
                                vista.informacionIUSI();
                                break; 
                            }
                        }
}
