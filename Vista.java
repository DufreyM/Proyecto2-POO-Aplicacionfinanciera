public class Vista {
    public void mostrarMenu() { //Imprime el menú
        System.out.println("\nMenú:");
        System.out.println("1. Simulador presupuesto");
        System.out.println("2. Educación Financiera Personal");
        System.out.println("3. Deudas y Crédito");
        System.out.println("4. Impuestos");
        System.out.println("5. Seguro");
        System.out.println("6. Hábitos financieros saludables");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void rangosIUSI(){
        System.out.println("De Q0 a Q2,000.00 = exento. ");
        System.out.println("De Q2,000.01 a Q20,000.00 =  0.2 %");
        System.out.println("De Q20,000.01 a Q70,000.00 = 0.6 %");
        System.out.println("De Q70,000.01 en adelante = 0.9 %");
    }

    public void IUSI(){
        System.out.println("Impuesto seleccionado IUSI");
        System.out.println("Seleccione lo que desea hacer"); 
        System.out.println("1. Calcular IUSI sobre bien inmueble");
        System.out.println("2. Mostrar tabla de tangos IUSI");
        System.out.println("3. Información sobre IUSI");
    }

    public void IVA(){
        System.out.println("Impuesto seleccionado IVA");
        System.out.println("Seleccione lo que desea hacer"); 
        System.out.println("1. Calcular IVA general sobre productos");
        System.out.println("2. Calcular IVA pequeño contribuyente");
        System.out.println("3. Información sobre IVA");
        System.out.println("4. Exoneraciones por ley");
    }

    public void opcionesplanificacion(){
        System.out.println("------ Menú ------");
        System.out.println("1. ¿Que es la planificacion financiera?");
        System.out.println("2. Ahorro e Inversion");
        System.out.println("3. Gestion de deudas");
        System.out.println("5. Impuestos");
        System.out.println("6. Credito");
        System.out.println("7. Planificacion para el futuro");
        System.out.println("------------------");
    }

    public void informacionIUSI(){
        System.out.println("El Impuesto Único Sobre Inmuebles, conocido como IUSI, es un tributo municipal que se aplica en Guatemala sobre la propiedad de bienes inmuebles, como terrenos, edificios y construcciones. Este impuesto se calcula en base al valor catastral de la propiedad y se destina a financiar servicios públicos locales, como mantenimiento de calles y obras municipales.");              
    }

    
    
}
