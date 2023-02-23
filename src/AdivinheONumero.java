import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

	public static void main(String[] args) {
		Random rnd = new Random(); //Inicia Aleat�rio 
		int x = rnd.nextInt(100); //Gera um n�mero aleat�rio (0 a 99) 
/*
		1. Fa�a um la�o de repeti��o que solicite ao usu�rio digitar um n�mero; 
		2. O la�o encerra quando o usu�rio acertar o n�mero; 
		3. Se o n�mero do usu�rio for menor que o oculto, escrever: "MAIOR", se o n�mero do usu�rio for maior que o oculto, escrever: "MENOR".
*/
		int palpite = -1;
		Scanner leitor = new Scanner(System.in);
		do {
			System.out.println("Qual � o n�mero?");
			palpite = leitor.nextInt();
			
			if (x!=palpite)
				if (x<palpite)
					System.out.println("Errou! � menor!");
				else
					System.out.println("Errou! � maior!");
		} while (x!=palpite);

		System.out.println("Acertou!");
		leitor.close();
	}

}
