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
                                    
                    }
} 
}
