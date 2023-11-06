package competidor;

import java.util.ArrayList;
import java.util.List;

public abstract class Liga extends Competidor {
	
	List<Competidor> competidoresEnLiga = new ArrayList<Competidor>();
	
	public int getVelocidadValor() {
		
		int sumatoriaVelocidad = 0;
		int numeroDeCompetidores = this.competidoresEnLiga.size();
		
		if(numeroDeCompetidores == 0) {
			return 0;
		}
		
		for(Competidor competidor : this.competidoresEnLiga) {
			sumatoriaVelocidad += competidor.getVelocidadValor();
		}
		return sumatoriaVelocidad / numeroDeCompetidores;
	}
	
	public int getFuerzaValor() {
		
		int sumatoriaFuerza = 0;
		int numeroDeCompetidores = this.competidoresEnLiga.size();
		
		if(numeroDeCompetidores == 0) {
			return 0;
		}

		for(Competidor competidor : this.competidoresEnLiga) {
			sumatoriaFuerza += competidor.getFuerzaValor();
		}
		return sumatoriaFuerza / numeroDeCompetidores;
	}
	
	public int getResistenciaValor() {
		
		int sumatoriaResistencia = 0;
		int numeroDeCompetidores = this.competidoresEnLiga.size();
		
		if(numeroDeCompetidores == 0) {
			return 0;
		}

		for(Competidor competidor : this.competidoresEnLiga) {
			sumatoriaResistencia += competidor.getResistenciaValor();
		}
		return sumatoriaResistencia / numeroDeCompetidores;
	}
	
	public int getDestrezaValor() {
		
		int sumatoriaDestreza = 0;
		int numeroDeCompetidores = this.competidoresEnLiga.size();
		
		if(numeroDeCompetidores == 0) {
			return 0;
		}

		for(Competidor competidor : this.competidoresEnLiga) {
			sumatoriaDestreza += competidor.getDestrezaValor();
		}
		return sumatoriaDestreza / numeroDeCompetidores;
	}

	public boolean agregarCompetidor(Competidor competidor) {
		
		if(competidor.estaEnAlgunaLiga) {
			return false;
		}	
		if(this.esLigaHeroe() && !competidor.esHeroe() && !competidor.esLigaHeroe()) {
			return false;
		}
		else if(this.esLigaVillano() && !competidor.esVillano() && !competidor.esLigaVillano()) {
			return false;
		}	
		if(this.competidoresEnLiga.contains(competidor)) {
			return false;
		}
		this.competidoresEnLiga.add(competidor);
		competidor.estaEnAlgunaLiga = true;
	
		return true;
	}
	
	public boolean eliminarCompetidor(Competidor competidor){
		
		if(this.esLigaHeroe() && !competidor.esHeroe() && !competidor.esLigaHeroe()) {
			return false;
		}
		else if(this.esLigaVillano() && !competidor.esVillano() && !competidor.esLigaVillano()) {
			return false;
		}	
		if(this.competidoresEnLiga.remove(competidor)) {
			competidor.estaEnAlgunaLiga = false;
			return true;
		}
		return false;
	}
	
	public void mostrarLiga() {
		
		for(Competidor competidor : this.competidoresEnLiga) {
			System.out.println(competidor.toString());
		}
	}

}

