import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

	public static void main(String[] args) {
		Random rnd = new Random(); //Inicia Aleatório 
		int x = rnd.nextInt(100); //Gera um número aleatório (0 a 99) 
/*
		1. Faça um laço de repetição que solicite ao usuário digitar um número; 
		2. O laço encerra quando o usuário acertar o número; 
		3. Se o número do usuário for menor que o oculto, escrever: "MAIOR", se o número do usuário for maior que o oculto, escrever: "MENOR".
*/
		int palpite = -1;
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.println("Qual é o número?");
			palpite = leitor.nextInt();
			
			if (x!=palpite)
				if (x<palpite)
					System.out.println("Errou! É menor!");
				else
					System.out.println("Errou! É maior!");
		} while (x!=palpite);

		System.out.println("Acertou!");
		leitor.close();
	}

}
