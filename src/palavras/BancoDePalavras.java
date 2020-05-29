package palavras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	
	private File f;
	private FileReader read;
	private BufferedReader buf;
	
	static private ArrayList<String> palavras = new ArrayList<String>();
	
	public BancoDePalavras() {
		try {
			f = new File("palavras.txt");
			read = new FileReader(f);
			buf = new BufferedReader(read);
			String linha = buf.readLine();
			
			// enquanto houverem palavras no arquivo vou ler e adicionar no ArrayList
			while(linha != null){
				palavras.add(linha);
				linha = buf.readLine();
			}
			
			
		} catch (Exception e) {
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		} finally {
			try {
				read.close();
			} catch (IOException e) {
				System.err.println("Erro no fechamento do arquivo: " + e.getMessage());
			}
		}
	}
	
	public String palavraAleatoria() {
		Random gerador = new Random();
		int index = gerador.nextInt(palavras.size());
		return palavras.get(index);
	}
	
	
	

}
