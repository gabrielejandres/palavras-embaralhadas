package embaralhador;

public class EmbaralhadorInverso implements Embaralhador {

	private String inversa = "";
	
	@Override
	public String embaralhar(String palavra) {
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			this.inversa += palavra.charAt(i);
		}
		
		return this.inversa;
	}
	
	

}
