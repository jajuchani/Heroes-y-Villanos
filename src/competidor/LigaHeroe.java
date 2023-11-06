package competidor;


public class LigaHeroe extends Liga {
	
	public LigaHeroe(String nombreLiga) {
		
		this.idTipoCompetidor = 3;
		this.nombreCompetidor = nombreLiga;
	}

	@Override
	public String toString() {
		return "Liga de heroes: " + this.nombreCompetidor;
	}

}