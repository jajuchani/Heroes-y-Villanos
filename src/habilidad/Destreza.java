package habilidad;


public class Destreza extends Caracteristica{

	public Destreza() {
		this.idCaracteristica = 4;	
		this.valor = 0;
	}
	
	public Destreza(int valor) {
		this.idCaracteristica = 4;	
		if(valor < 0) {
			throw new IllegalArgumentException("El valor de destreza debe ser mayor igual a cero.");
		}
		this.valor = valor;		
	}
	
	public Destreza(Destreza destreza) {
		this.idCaracteristica = 4;	
		this.valor = destreza.valor;		
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public Destreza getDestreza() {
		return new Destreza(this.valor);
	}
	
	public void setValor(int valorNuevo) {
		if(valorNuevo < 0) {
			throw new IllegalArgumentException("El valor de destreza debe ser mayor igual a cero.");
		}
		this.valor = valorNuevo;
	}
	
	public void setValor(Destreza destreza) {
		this.valor = destreza.valor;
	}
	
	@Override
	public String toString() {
		return "Destreza=" + this.valor;
	}
}
