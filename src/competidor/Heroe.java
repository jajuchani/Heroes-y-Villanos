package competidor;

import habilidad.*;

public class Heroe extends Personaje {
	
	public Heroe(String nombreCompetidor, Habilidad habilidad) {
		this.idTipoCompetidor = 1;
		this.nombreCompetidor = nombreCompetidor;
		this.habilidad = new Habilidad(habilidad);
	}

	@Override
	public String toString() {
		return "Heroe: " + this.nombreCompetidor;
	}

}
