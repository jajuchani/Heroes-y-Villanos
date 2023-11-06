package interfaceUsuario;

import java.util.Map;
import java.util.HashMap;

import competidor.*;

public class Datos {
	public static final Map<String, Personaje> listaPersonajes = new HashMap<>();
	public static final Map<String, Liga> listaLigas = new HashMap<>();
	
	public static Map<String, Personaje> getListaPersonajes(){
		return listaPersonajes;
	}
	
	public static Map<String, Liga> getListaLigas(){
		return listaLigas;
	}

}
