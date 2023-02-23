import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		//while
		int i = 0;
		
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean repete = true;
		
		while (repete) {
			System.out.println("Repetindo");
			System.out.println("Deseja Continuar?");
			repete = sc.nextBoolean();
		}
		
		sc.close();
		
		//do while
		
		i = 100;
		
		do {
			System.out.println(i);
			i--;
		} while (i >= 0);

	}

}
