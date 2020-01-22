package datos;

import java.util.ArrayList;

public class Registro {
	
	public static ArrayList<Datos> registro = new ArrayList<>(); 
	
	public static void add(Datos dato){
        registro.add(dato);
    }
	
}