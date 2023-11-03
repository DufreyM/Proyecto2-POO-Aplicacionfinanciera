//Fecha de creación: 25 de octubre de 2023
//Fecha de última modificación: 01 de noviembre de 2023

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Login {

    private BufferedReader lector;
    private String lector_Linea;
    private String almacenar[] = null;
    
    // Método para acceder al CSV
    public void leerCSV(String nombreDelArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreDelArchivo));

            while ((lector_Linea = lector.readLine()) != null) {
                almacenar = lector_Linea.split(",");
                System.out.println("Nombre: " + almacenar[0] + ", Contraseña: " + almacenar[1]);
            }

            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para almacenar nombre y contraseña 
    public void agregarUsuario(String nombre, String contraseña, String nombreDelArchivo) {
        try {
            PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(nombreDelArchivo, true)));
            escritor.println(nombre + "," + contraseña);
            escritor.close();
            System.out.println("Usuario registrado con éxito.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al registrar el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    //Metodo para verificar datos e iniciar login
    public void IniciarSesion(String nombre, String contraseña, String nombreDelArchivo) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreDelArchivo));
            String linea;
    
            boolean inicioSesionExitoso = false;
    
            while ((linea = lector.readLine()) != null) {
                String[] almacenar = linea.split(",");
                if (almacenar.length == 2 && nombre.equals(almacenar[0]) && contraseña.equals(almacenar[1])) {
                    inicioSesionExitoso = true;
                    break;
                }
            }
    
            lector.close();
    
            if (inicioSesionExitoso == true) {
                System.out.println("Has iniciado sesión.");
            } else {
                System.out.println("Parece que el usuario o contraseña no coinciden.");
                
            }
    
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al abrir o leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
