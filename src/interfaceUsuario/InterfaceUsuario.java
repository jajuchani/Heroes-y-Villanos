package interfaceUsuario;

import java.util.Map;

import competidor.*;
import habilidad.*;

public class InterfaceUsuario {
	
	public void mostrarDatosPersonajes() {			// para test!!
		
		Personaje personaje;
		
		System.out.println("Lista de los personajes en memoria: ");
		
		for(Map.Entry<String, Personaje> entry : Datos.listaPersonajes.entrySet()) {
		personaje = entry.getValue();
		
		System.out.println(personaje.toString());
		}	
	}
	
	public void mostrarDatosLigas() {			// para test!!
		
		Liga liga;
		
		System.out.println("Lista de los ligas en memoria: ");
		
		for(Map.Entry<String, Liga> entry : Datos.listaLigas.entrySet()) {
		liga = entry.getValue();
		
		System.out.println(liga.toString());
		}	
	}

	
	public boolean agregarPersonajeALiga(String nombrePersonaje, String nombreLiga) {      // para tesstttt!!
		
		if(!Datos.listaPersonajes.containsKey(nombrePersonaje)) {
			System.out.println("No esta el personaje " + nombrePersonaje + " en memoria.");
			return false;
		}
		if(!Datos.listaLigas.containsKey(nombreLiga)) {
			System.out.println("No esta la liga " + nombreLiga + " en memoria.");
			return false;
		}
		
		Liga liga = Datos.listaLigas.get(nombreLiga);
		Competidor competidor = Datos.listaPersonajes.get(nombrePersonaje);
		
		return liga.agregarCompetidor(competidor);	
	
	}
	
	public boolean agregarLigaALiga(String nombreLigaAgregada, String nombreLigaOrigen) {      // para tesstttt!!
		
		if(!Datos.listaLigas.containsKey(nombreLigaAgregada)) {
			System.out.println("No esta el personaje " + nombreLigaAgregada + " en memoria.");
			return false;
		}
		if(!Datos.listaLigas.containsKey(nombreLigaOrigen)) {
			System.out.println("No esta la liga " + nombreLigaOrigen + " en memoria.");
			return false;
		}
		
		Liga liga1 = Datos.listaLigas.get(nombreLigaAgregada);
		Liga liga2 = Datos.listaLigas.get(nombreLigaOrigen);
		
		return liga2.agregarCompetidor(liga1);	
	
	}
	
	public boolean esGanadorPersonajeAPersonaje(String nombrePersonaje, String nombreOponente, String nombreCaracteristica) {		// SOlo para testtt
		
		if(!Datos.listaPersonajes.containsKey(nombrePersonaje)) {
			System.out.println("No esta el personaje " + nombrePersonaje + " en memoria.");
			return false;
		}
		if(!Datos.listaPersonajes.containsKey(nombreOponente)) {
			System.out.println("No esta el oponente " + nombreOponente + " en memoria.");
			return false;
		}
		
		Personaje personaje = Datos.listaPersonajes.get(nombrePersonaje);
		Personaje oponente = Datos.listaPersonajes.get(nombreOponente);
		
		switch(nombreCaracteristica.toLowerCase()) {
		case "velocidad":
			return personaje.esGanador(oponente, new Velocidad());
		case "fuerza":
			return personaje.esGanador(oponente, new Fuerza());
		case "resistencia":
			return personaje.esGanador(oponente, new Resistencia());
		case "destreza":
			return personaje.esGanador(oponente, new Fuerza());
		default:
			throw new IllegalArgumentException("Nombre de caracteristica no valido.");
		}	
	}
	
	public boolean mostrarLiga(String nombreLiga) {			// para test
		
		if(!Datos.listaLigas.containsKey(nombreLiga)) {
			System.out.println("No esta el personaje " + nombreLiga + " en memoria.");
			return false;
		}
		
		Liga ligaParaMostrar = Datos.listaLigas.get(nombreLiga);
		
		System.out.println(ligaParaMostrar.toString());
		ligaParaMostrar.mostrarLiga();
		
		return true;
	}
	
	public boolean esGanadorPersonajeALiga(String nombrePersonaje, String nombreLigaOponente, String nombreCaracteristica) {		// SOlo para testtt		
		
		if(!Datos.listaPersonajes.containsKey(nombrePersonaje)) {
			System.out.println("No esta el personaje " + nombrePersonaje + " en memoria.");
			return false;
		}
		if(!Datos.listaLigas.containsKey(nombreLigaOponente)) {
			System.out.println("No esta la liga oponente " + nombreLigaOponente + " en memoria.");
			return false;
		}
		Personaje personaje = Datos.listaPersonajes.get(nombrePersonaje);
		Liga oponente = Datos.listaLigas.get(nombreLigaOponente);
		
		switch(nombreCaracteristica.toLowerCase()) {
		case "velocidad":
			return personaje.esGanador(oponente, new Velocidad());
		case "fuerza":
			return personaje.esGanador(oponente, new Fuerza());
		case "resistencia":
			return personaje.esGanador(oponente, new Resistencia());
		case "destreza":
			return personaje.esGanador(oponente, new Fuerza());
		default:
			throw new IllegalArgumentException("Nombre de caracteristica no valido.");
		}	
	}
	
	public void mostrarHabilidadPersonaje(String nombrePersonaje) {			// Sola para testtt
		
		if(!Datos.listaPersonajes.containsKey(nombrePersonaje)) {
			System.out.println("No esta el personaje " + nombrePersonaje + " en memoria.");
			return;
		}
		Personaje personaje = Datos.listaPersonajes.get(nombrePersonaje);
			
		System.out.println(personaje.getNombreCompetidor() + " " + personaje.getHabilidad().toString());
				
	}

	
}
