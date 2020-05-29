package mecanica;

import embaralhador.FabricaEmbaralhadores;
import palavras.BancoDePalavras;

public class MecanicaErrouPerdeu implements MecanicaDoJogo {
	
	private boolean fim = false;
	private int pontos;
	private String palavra;
	
	private BancoDePalavras bp = new BancoDePalavras();
	private FabricaEmbaralhadores f = new FabricaEmbaralhadores();

	@Override
	public String getNome() {
		return "Errou, perdeu!";
	}

	@Override
	public String descricao() {
		return "Caso você erre a palavra, o jogo termina. A cada palavra certa você ganha 20 pontos.";
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
			this.pontos += 20;
			return true;
		} else {
			this.fim = true;
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
		return 0;
	}

}
