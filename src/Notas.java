import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos na turma?");
		int alunos = sc.nextInt();
		float notas = 0;
		
		for (int iterador = 1; iterador <= alunos; iterador ++) {
			System.out.println("Qual a nota do próximo aluno?");
			notas += sc.nextInt();
			}
		
		System.out.println("A média da sala é: " + (notas/alunos));
		
		sc.close();
	}

}
