import java.util.Scanner;

public class caseExercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a op��o desejada:");
		System.out.println("1-Elogio profissional");
		System.out.println("2-Elogio f�sico");
		System.out.println("3-Elogio pessoal");	
		
		short opcao = sc.nextShort();
		
		System.out.println("Agora informe o nome da pessoa que deseja elogiar:");	
		String nome = sc.next();
		
		switch (opcao) {
		case 1:
			System.out.println("Parab�ns pela proatividade, " + nome);
			break;
		case 2:
			System.out.println("Parab�ns pela forma f�sica, " + nome);
			break;
		case 3:
			System.out.println("Parab�ns pelo cuidado com as pessoas, " + nome);
			break;
		default:
			System.out.println("Voc� digitou uma op��o inv�lida," + nome);
		}
		
		sc.close();
	}

}
