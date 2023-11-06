package main;

import competidor.*;
import habilidad.*;
import interfaceUsuario.*;

public class Main {

	public static void main(String[] args) {
		
		InterfaceUsuario interfaz = new InterfaceUsuario();		
		crearLotePrueba();		// carga los datos en memoria como si los ubiera levantado de archivo .txt

//		interfaz.mostrarLiga("LigaVillanosPrincipal");
//		System.out.println("");
//		interfaz.mostrarLiga("LigaVillanosInterna");
////		
//		interfaz.mostrarDatosPersonajes();
//		interfaz.mostrarHabilidadPersonaje("Heroe0");
		
		
		// imprime resultado esGanador(). si empatan es false
		System.out.println(interfaz.esGanadorPersonajeALiga("Heroe0", "LigaVillanosPrincipal", "resistencia"));
		
	}
	
	public static void crearLotePrueba() {
		
		Heroe vectorH[] = { new Heroe("Heroe0", new Habilidad(100, 100, 100, 100)), 
							new Heroe("Heroe1", new Habilidad(100, 100, 100, 100)),
							new Heroe("Heroe2", new Habilidad(100, 100, 100, 100)),
							new Heroe("Heroe3", new Habilidad(100, 100, 100, 100)),
							new Heroe("Heroe4", new Habilidad(100, 100, 100, 100)),
							new Heroe("Heroe5", new Habilidad(100, 100, 100, 100)) 
							};
		Villano vectorV[] = { 	new Villano("Villano0", new Habilidad(100, 100, 100, 100)),
								new Villano("Villano1", new Habilidad(100, 100, 100, 100)),
								new Villano("Villano2", new Habilidad(100, 100, 100, 100)),	// Liga interna
								new Villano("Villano3", new Habilidad(100, 100, 100, 100)),	//
								new Villano("Villano4", new Habilidad(100, 100, 100, 100)),	///////////////
								new Villano("Villano5", new Habilidad(100, 100, 100, 100)), 
								new Villano("Villano6", new Habilidad(100, 100, 100, 100)), 
								new Villano("Villano7", new Habilidad(100, 100, 100, 100)),	
								new Villano("Villano8", new Habilidad(100, 100, 100, 100)),
								};	
		
		// Primero carga todos los personajes en memoria.
		
		for (Heroe her : vectorH) {	
			Datos.listaPersonajes.put(her.getNombreCompetidor(), her);
		}	
		for (Villano vill : vectorV) {	
			Datos.listaPersonajes.put(vill.getNombreCompetidor(), vill);
		}
		
		// Carga las ligas en memoria (vacias).
		
		LigaVillano ligaVillanos = new LigaVillano("LigaVillanosPrincipal");
		LigaVillano ligaVillanosInterna = new LigaVillano("LigaVillanosInterna");

		Datos.listaLigas.put(ligaVillanos.getNombreCompetidor(), ligaVillanos);
		Datos.listaLigas.put(ligaVillanosInterna.getNombreCompetidor(), ligaVillanosInterna);
		
		// Vincula personajes en memoria con ligas en memoria.
		
		InterfaceUsuario interfaz = new InterfaceUsuario();
		
		interfaz.agregarPersonajeALiga("Villano2", "LigaVillanosInterna");
		interfaz.agregarPersonajeALiga("Villano3", "LigaVillanosInterna");
		interfaz.agregarPersonajeALiga("Villano4", "LigaVillanosInterna");
		
		interfaz.agregarPersonajeALiga("Villano5", "LigaVillanosPrincipal");
		interfaz.agregarPersonajeALiga("Villano6", "LigaVillanosPrincipal");
		interfaz.agregarLigaALiga("LigaVillanosInterna", "LigaVillanosPrincipal");
		interfaz.agregarPersonajeALiga("Villano7", "LigaVillanosPrincipal");
	}
}
