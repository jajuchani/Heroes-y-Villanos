package competidor;


public class LigaVillano extends Liga {
	
	public LigaVillano(String nombreLiga) {
		
		this.idTipoCompetidor = 4;
		this.nombreCompetidor = nombreLiga;
	}

	@Override
	public String toString() {
		return "Liga de Villanos: " + this.nombreCompetidor;
	}

}
