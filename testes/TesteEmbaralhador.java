import static org.junit.Assert.*;

import org.junit.Test;

import embaralhador.EmbaralhadorInverso;
import embaralhador.EmbaralhadorTrocaPosicoesAdjacentes;

public class TesteEmbaralhador {

	@Test
	public void testEmbaralhadorInverso() {
		EmbaralhadorInverso e = new EmbaralhadorInverso();
		assertEquals("eleirbag", e.embaralhar("gabriele"));
	}
	
	@Test
	public void testEmbaralhadorTrocaAdjacentes() {
		EmbaralhadorTrocaPosicoesAdjacentes e = new EmbaralhadorTrocaPosicoesAdjacentes();
		assertEquals("agrbeiel", e.embaralhar("gabriele"));
	}

}
