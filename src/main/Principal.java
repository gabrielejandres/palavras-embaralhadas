package main;

import java.util.Scanner;

import mecanica.FabricaMecanicaDoJogo;
import mecanica.MecanicaDoJogo;

public class Principal {
	
	
	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		FabricaMecanicaDoJogo fm = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mec;
		
		System.out.println("*** Jogo das Palavras Embaralhadas *** \n");
		System.out.println("Escolha a mecânica do jogo: ");
		System.out.println("1 - Errou, perdeu");
		System.out.println("2 - Mecânica de vidas");
		
		System.out.print("Sua escolha => ");
		int op = scanner.nextInt();
		
		if(op == 1 || op == 2) {
			mec = fm.retornaMecanica(op);
			System.out.println("Jogando no modo: " + mec.getNome() + " - " + mec.descricao());
			System.out.println("\n");
			
			while(!mec.isFim()) {
				System.out.println("Adivinhe a palavra: " + mec.getPalavraEmbaralhada());
				System.out.print("Sua resposta => ");
				scanner = new Scanner(System.in);
				String resposta = scanner.nextLine().toLowerCase();
				if (mec.verificaPalavra(resposta)) {
					System.out.println("Muito bem! Você acertou :) \n");
				} else {
					System.out.println("Poxa! Você errou :( \n");
					if (op == 2) System.out.println("Você tem " +  mec.getVidas() + " vidas");
				}
			}
			
			System.out.println("Sua pontuação final: " + mec.getPontuacao());
			
		} else {
			System.out.println("Opção inválida!");	
			System.exit(0);
		}
		
	}

}
