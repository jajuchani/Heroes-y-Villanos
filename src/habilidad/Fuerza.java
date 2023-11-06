package habilidad;


public class Fuerza extends Caracteristica {

	public Fuerza() {
		this.idCaracteristica = 2;
		this.valor = 0;
	}
	
	public Fuerza(int valor) {
		this.idCaracteristica = 2;
		if(valor < 0) {
			throw new IllegalArgumentException("El valor de fuerza debe ser mayor igual a cero.");
		}
		this.valor = valor;
	}
	
	public Fuerza(Fuerza fuerza) {
		this.idCaracteristica = 2;
		this.valor = fuerza.valor;
	}

	public int getValor() {
		return this.valor;
	}
	
	public Fuerza getFuerza() {
		return new Fuerza(this.valor);
	}
	
	public void setValor(int valorNuevo) {
		if(valorNuevo < 0) {
			throw new IllegalArgumentException("El valor de fuerza debe ser mayor igual a cero.");
		}
		this.valor = valorNuevo;
	}
	
	public void setValor(Fuerza fuerza) {
		this.valor = fuerza.valor;
	}
	
	@Override
	public String toString() {
		return "Fuerza=" + this.valor;
	}
}
