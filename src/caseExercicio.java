import java.util.Scanner;

public class caseExercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a opção desejada:");
		System.out.println("1-Elogio profissional");
		System.out.println("2-Elogio físico");
		System.out.println("3-Elogio pessoal");	
		
		short opcao = sc.nextShort();
		
		System.out.println("Agora informe o nome da pessoa que deseja elogiar:");	
		String nome = sc.next();
		
		switch (opcao) {
		case 1:
			System.out.println("Parabéns pela proatividade, " + nome);
			break;
		case 2:
			System.out.println("Parabéns pela forma física, " + nome);
			break;
		case 3:
			System.out.println("Parabéns pelo cuidado com as pessoas, " + nome);
			break;
		default:
			System.out.println("Você digitou uma opção inválida," + nome);
		}
		
		sc.close();
	}

}
