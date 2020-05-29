package mecanica;

public class FabricaMecanicaDoJogo {
	
	public MecanicaDoJogo retornaMecanica(int i) {
		
		if(i == 1){
			return new MecanicaErrouPerdeu();
		}
		return new MecanicaVidas();
	}

}
