package habilidad;


public class Resistencia extends Caracteristica {

	public Resistencia() {
		this.idCaracteristica = 3;
		this.valor = 0;
	}
	
	public Resistencia(int valor) {
		this.idCaracteristica = 3;
		if(valor < 0) {
			throw new IllegalArgumentException("El valor de resistencia debe ser mayor igual a cero.");
		}
		this.valor = valor;
	}
		
	public Resistencia(Resistencia resistencia) {
		this.idCaracteristica = 3;
		this.valor = resistencia.valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public Resistencia getResistencia() {
		return new Resistencia(this.valor);
	}
	
	public void setValor(int valorNuevo) {
		if(valorNuevo < 0) {
			throw new IllegalArgumentException("El valor de resistencia debe ser mayor igual a cero.");
		}
		this.valor = valorNuevo;
	}
	
	public void setValor(Resistencia resistencia) {
		this.valor = resistencia.valor;
	}
	
	@Override
	public String toString() {
		return "Resistencia=" + this.valor;
	}
}