package presentacion;
import negocio.LecturaArchivo;
import negocio.Cuadros;

public class ExamenFinal {

    public static void main(String[] args) {
        LecturaArchivo.leerArchivo("C:\\Users\\Lenovo\\Desktop\\EXAMeN FINAL\\usuarios.txt");
        
        LecturaArchivo.mostrarRegistros();
        
        Cuadros.cuadrito();
        
        LecturaArchivo.verifica();
    }

}
