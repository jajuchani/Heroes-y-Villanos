package habilidad;

public abstract class Caracteristica {
	
	/*	ID Tipo de caracteristica:
	 * 	1 - Velocidad
	 * 	2 - Fuerza
	 * 	3 - Resistencia
	 * 	4 - Destreza
	 */
	
	protected int idCaracteristica;
	protected int valor;

	public abstract int getValor();
	
	public boolean esVelocidad() {
		return this.idCaracteristica == 1;
	}
	
	public boolean esFuerza() {
		return this.idCaracteristica == 2;
	}
	
	public boolean esResistencia() {
		return this.idCaracteristica == 3;
	}
	
	public boolean esDestreza() {
		return this.idCaracteristica == 4;
	}

}
