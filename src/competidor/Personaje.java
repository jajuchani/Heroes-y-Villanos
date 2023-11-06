package competidor;

import habilidad.*;

public abstract class Personaje extends Competidor {
	
	// falta agregar nombreReal
	protected Habilidad habilidad;
	
	public int getVelocidadValor() {
		return this.habilidad.getVelocidadValor();
	}
	
	public int getFuerzaValor() {
		return this.habilidad.getFuerzaValor();
	}
	
	public int getResistenciaValor() {
		return this.habilidad.getResistenciaValor();
	}
	
	public int getDestrezaValor() {
		return this.habilidad.getDestrezaValor();
	}
	
	public Habilidad getHabilidad() {
		return new Habilidad(this.habilidad);
	}

}