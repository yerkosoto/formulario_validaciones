package negocio;

import java.io.BufferedReader;
import java.io.FileReader;
import datos.Registro;

public class LecturaArchivo {
    
    // metodo para leer y capturar los datos del archivo que son enviados desde ExamenFinal.java
    public static void leerArchivo(String src) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(src));
            String bfLectura;
            while ((bfLectura = buffer.readLine()) != null) {
                String[] datos = bfLectura.split(",");
                String rut = datos[0];
                String contrasena = datos[1];
                datos.Datos aux = new datos.Datos(rut, contrasena);
                Registro.add(aux);
            }
            buffer.close();
        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }
    }
    // metodo para verificar que esté correctamente cargado el archivo
    public static void mostrarRegistros() {
        for (int i = 0; i < Registro.registro.size(); i++) {
            System.out.println("Rut: " + Registro.registro.get(i).getRut() + " Contraseña: " + Registro.registro.get(i).getContrasena());
        }
    }
    static String oli = "16425502-6";
    static String passito = "FPerez";
    
    
    // logica para verificar que tanto el rut como el pass sean iguales
    public static void verifica() {
        for (int i = 0; i < Registro.registro.size(); i++) {
            if (Registro.registro.get(i).getRut() == null ? oli == null : Registro.registro.get(i).getRut().equals(oli) 
                    && Registro.registro.get(i).getContrasena().equals(passito)) {
                System.out.println("Bienvenido");
            }
            else {
                System.out.println("No existe");
            }
        }
    }
    

}
