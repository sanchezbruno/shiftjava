import java.util.Scanner;

public class ifElseExercicio {

	public static void main(String[] args) {
		/** * Uma ONG resolveu prestar um servi�o bem diferente: 
		 * ela oferece vans para buscar pessoas com qualquer tipo de dificuldade 
		 * de locomo��o para poderem votar. 
		 * 
		 * * Para evitar problemas no momento do embarque, voc� foi 
		 * convidado a criar um programa que valide a idade dos passageiros: * 
		 * 
		 * * Caso tenham 16 anos ou menos, n�o podem votar (e nem embarcar). 
		 * 
		 * * Caso tenham entre 16 anos e 18 incompletos ou mais de 65 anos, 
		 * podem optar por votar ou n�o. 
		 * 
		 * * Caso tenham entre 18 e 65 anos incompletos, * devem votar obrigatoriamente. 
		 * 
		 * * Crie um programa que receba a idade dos passageiros em potencial e 
		 * indique se podem embarcar e votar. */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		short idade = sc.nextShort();
		
		if (idade <= 16) {
			System.out.println("Voc� n�o pode votar e nem embarcar.");
		} else
			if (idade <= 18 || idade >= 65) {
				System.out.println("Voc� pode embarcar e votar se quiser.");
			} else {
				System.out.println("Voc� deve votar e pode embarcar.");
			}
				
		
		sc.close();
		
	}

}
