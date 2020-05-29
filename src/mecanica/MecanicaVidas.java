package mecanica;

import embaralhador.FabricaEmbaralhadores;
import palavras.BancoDePalavras;

public class MecanicaVidas implements MecanicaDoJogo {

	private boolean fim = false;
	private int pontos;
	private int vidas = 3;
	private String palavra;
	
	private BancoDePalavras bp = new BancoDePalavras();
	private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
	
	@Override
	public String getNome() {
		return "Mecânica de 3 vidas";
	}

	@Override
	public String descricao() {
		return "Você tem 3 vidas inicialmente e a cada palavra errada você perde 1 vida. A cada palavra certa você ganha 10 pontos.";
	}

	@Override
	public boolean isFim() {
		return this.fim;
	}

	@Override
	public int getPontuacao() {
		return this.pontos;
	}

	@Override
	public boolean verificaPalavra(String resposta) {
		if( palavra.equals(resposta)) {
			this.pontos += 10;
			return true;
		} else {
			this.vidas--;
			if(this.vidas == 0) this.fim = true;
			return false;
		}
	}

	@Override
	public String getPalavraEmbaralhada() {
		return this.f.retornaEmbaralhador().embaralhar(this.getPalavra());
	}

	@Override
	public String getPalavra() {
		this.palavra = this.bp.palavraAleatoria();
		return this.palavra;
	}
	
	@Override
	public int getVidas() {
		return this.vidas;
	}
	
	
	

}
