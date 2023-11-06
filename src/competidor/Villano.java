package competidor;

import habilidad.*;

public class Villano extends Personaje {
	
	public Villano(String nombreCompetidor, Habilidad habilidad) {
		this.idTipoCompetidor = 2;
		this.nombreCompetidor = nombreCompetidor;
		this.habilidad = new Habilidad(habilidad);
	}

	@Override
	public String toString() {
		return "Villano: " + this.nombreCompetidor;
	}
	
}