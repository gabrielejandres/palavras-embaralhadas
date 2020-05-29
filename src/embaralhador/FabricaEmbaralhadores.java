package embaralhador;

import java.util.Random;

public class FabricaEmbaralhadores {
	
	public Embaralhador retornaEmbaralhador() {
		Random r = new Random();
		if(r.nextInt() % 2 == 0){
			return new EmbaralhadorInverso();
		}
		return new EmbaralhadorTrocaPosicoesAdjacentes();
	}

}
