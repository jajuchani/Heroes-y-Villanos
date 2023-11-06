package habilidad;


public class Velocidad extends Caracteristica {
	
	public Velocidad() {
		this.idCaracteristica = 1;
		this.valor = 0;
	}
	
	public Velocidad(int valor) {
		this.idCaracteristica = 1;
		if(valor < 0) {
			throw new IllegalArgumentException("El valor de velocidad debe ser mayor igual a cero.");
		}
		this.valor = valor;
	}
	
	public Velocidad(Velocidad velocidad) {
		this.idCaracteristica = 1;
		this.valor = velocidad.valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public Velocidad getVelocidad() {
		return new Velocidad(this.valor);
	}
	
	public void setValor(int valorNuevo) {
		if(valorNuevo < 0) {
			throw new IllegalArgumentException("El valor de velocidad debe ser mayor igual a cero.");
		}
		this.valor = valorNuevo;
	}
	
	public void setValor(Velocidad velocidad) {
		this.valor = velocidad.valor;
	}
	
	@Override
	public String toString() {
		return "Velocidad=" + this.valor;
	}
	
}