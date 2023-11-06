package competidor;

import habilidad.*;

public abstract class Competidor implements ComponenteAgrupable {
	
	/*	ID Tipo de competidor:
	 * 	1 - Heroe
	 * 	2 - Vilano
	 * 	3 - Liga Heroe
	 * 	4 - Liga Villano
	 */
	
	protected int idTipoCompetidor;			// Una liga y un personaje no deberian poder llamarse igual.
	protected String nombreCompetidor;
	protected boolean estaEnAlgunaLiga = false;

//	public abstract ArrayList<Competidor> Vencedores(Competidor competidor, Caracteristica caracteristica);		hay que implementar!!
	
	public String getNombreCompetidor() {
		return this.nombreCompetidor;
	}
	
	protected boolean esHeroe() {
		return this.idTipoCompetidor == 1;
	}
	
	protected boolean esVillano() {
		return this.idTipoCompetidor == 2;
	}
	
	protected boolean esLigaHeroe() {
		return this.idTipoCompetidor == 3;
	}
	
	protected boolean esLigaVillano() {
		return this.idTipoCompetidor == 4;
	}
	
	public boolean esGanador(Competidor competidor, Caracteristica caracteristica) {
		
		// La logica consiste en un recorrido ciclico de 4 elementos en un orden (vel, fue, res, des)
		// Primero se determina a partir de que elemento hay que empezar segun el parametro caracteristica.
		// Finaliza el ciclo cuando hay desempate o cuando se recorrio las 4 caracteristicas.

		if(!this.oponenteValido(competidor)) {
			throw new IllegalArgumentException("El competidor no es valido. Deben ser personajes de distinto tipo.");
		}
		
		int resultado = 0;		// Estan empatados
		int vueltas = Habilidad.getCantidadDeCaracteristicas();
		int selector;
		
		if(caracteristica.esVelocidad()) {
			selector = 1;
		}
		if(caracteristica.esFuerza()) {
			selector = 2;
		}
		if(caracteristica.esResistencia()) {
			selector = 3;
		}
		else selector = 4;		// es destreza.
		
		while(resultado == 0 && vueltas > 0) {		
			
			switch(selector) {
			case 1:
				resultado = this.getVelocidadValor() - competidor.getVelocidadValor();
				break;
			case 2:
				resultado = this.getFuerzaValor() - competidor.getFuerzaValor();
				break;	
			case 3:
				resultado = this.getResistenciaValor() - competidor.getResistenciaValor();
				break;	
			case 4:
				resultado = this.getDestrezaValor() - competidor.getDestrezaValor();
				break;	
			}	
			if(selector < Habilidad.getCantidadDeCaracteristicas()) {
				selector++;
			}
			else selector = 1;
		
			vueltas--;
		}
		
		if(resultado > 0) {		// hay que decidir que pasa si empatan.
			return true;
		}
		return false;
	}
	
	private boolean oponenteValido(Competidor competidor) {			
		if(this.esHeroe() || this.esLigaHeroe()) {
			if(competidor.esHeroe() || competidor.esLigaHeroe()) {
				return false;
			}
		}
		if(this.esVillano()|| this.esLigaVillano()) {
			if(competidor.esVillano() || competidor.esLigaVillano()) {
				return false;
			}
		}
		return true; 		// Se da por competidor valido si es una liga vacia.
	}
	
}
