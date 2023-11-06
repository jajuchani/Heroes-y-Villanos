package habilidad;


public class Habilidad {
	
	private static final int cantidadDeCaracteristicas = 4;
	
	private Velocidad velocidad;
	private Fuerza fuerza;
	private Resistencia resistencia;
	private Destreza destreza;
	
	public Habilidad(Velocidad velocidad, Fuerza fuerza, Resistencia resistencia, Destreza destreza) {
		this.velocidad = new Velocidad(velocidad);
		this.fuerza = new Fuerza(fuerza);
		this.resistencia = new Resistencia(resistencia);
		this.destreza = new Destreza(destreza);
	}
	
	public Habilidad(Habilidad habilidad) {
		this.velocidad = new Velocidad(habilidad.getVelocidadValor());
		this.fuerza = new Fuerza(habilidad.getFuerzaValor());
		this.resistencia = new Resistencia(habilidad.getResistenciaValor());
		this.destreza = new Destreza(habilidad.getDestrezaValor());
	}
	
	public Habilidad(int velocidad, int fuerza, int resistencia, int destreza) {
		this.velocidad = new Velocidad(velocidad);
		this.fuerza = new Fuerza(fuerza);
		this.resistencia = new Resistencia(resistencia);
		this.destreza = new Destreza(destreza);
	}
	
	public static int getCantidadDeCaracteristicas() {
		return cantidadDeCaracteristicas;
	}
	
	public int getVelocidadValor() {
		return this.velocidad.getValor();
	}
	
	public int getFuerzaValor() {
		return this.fuerza.getValor();
	}
	
	public int getResistenciaValor() {
		return this.resistencia.getValor();
	}
	
	public int getDestrezaValor() {
		return this.destreza.getValor();
	}
	
	public Velocidad getVelocidad() {
		return new Velocidad(this.velocidad.getValor());
	}
	
	public Fuerza getFuerza() {
		return new Fuerza(this.fuerza.getValor());
	}
	
	public Resistencia getResistencia() {
		return new Resistencia(this.resistencia.getValor());
	}
	
	public Destreza getDestreza() {
		return new Destreza(this.destreza.getValor());
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = new Velocidad(velocidad);
	}
	
	public void setFuerza(int fuerza) {
		this.fuerza = new Fuerza(fuerza);
	}
	
	public void setResistencia(int resistencia) {
		this.resistencia = new Resistencia(resistencia);
	}
	
	public void setDestreza(int destreza) {
		this.destreza = new Destreza(destreza);
	}
	
	public void setVelocidad(Velocidad velocidad) {
		this.velocidad = new Velocidad(velocidad);
	}
	
	public void setFuerza(Fuerza fuerza) {
		this.fuerza = new Fuerza(fuerza);
	}
	
	public void setResistencia(Resistencia resistencia) {
		this.resistencia = new Resistencia(resistencia);
	}
	
	public void setDestreza(Destreza destreza) {
		this.destreza = new Destreza(destreza);
	}

	@Override
	public String toString() {
		return "Habilidad: [" + velocidad.toString() + ", " + fuerza.toString() + ", " +
					resistencia.toString() + ", " + destreza.toString() + "]";
	}

}