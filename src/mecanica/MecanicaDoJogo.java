package mecanica;

public interface MecanicaDoJogo {

	public String getNome(); 
	
	public String descricao();
	
	public boolean isFim();
	
	public int getPontuacao();
	
	public boolean verificaPalavra(String resposta);
	
	public String getPalavraEmbaralhada();
	
	public String getPalavra();
	
	public int getVidas();

}
