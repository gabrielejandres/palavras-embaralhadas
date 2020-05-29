package embaralhador;

public class EmbaralhadorTrocaPosicoesAdjacentes implements Embaralhador {

	private String newString = "";
	
	@Override
	public String embaralhar(String palavra) {
		
		for (int i = 0; i < palavra.length(); i = i + 2) {
			if(i + 1 < palavra.length())
				this.newString += palavra.charAt(i+1);
			this.newString += palavra.charAt(i);
		}
		
		return this.newString;
	}

}
