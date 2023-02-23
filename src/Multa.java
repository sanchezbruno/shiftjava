import java.util.Scanner;

public class Multa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual é a velocidade máxima da via?");
		int velocidademaxima = leitor.nextInt();
		int velocidade = 0; 
		int velocidadessoma = 0;  
		int valormultas = 0;
		int multas = 0;
		
		System.out.println("Quantos veículos passaram na via?");
		int veiculos = leitor.nextInt();
		
		for (int i = 1; i<= veiculos;i++) {
			System.out.println("Qual a velocidade do veículo " + i + "?");
			velocidade = leitor.nextInt();
			
			velocidadessoma += velocidade;
			
			if (velocidade > velocidademaxima)
			{
				if (velocidade < velocidademaxima + 10)
				{
					System.out.println("Multa de 50 reais!");
					valormultas+= 50;
					multas++;
				} else
					if (velocidade < velocidademaxima + 30)
					{
						System.out.println("Multa de 100 reais!");
						valormultas+= 100;
						multas++;
					} else
					{
						System.out.println("Multa de 300 reais!");
						valormultas+= 300;
						multas++;
					}
			}
			
		}
		
		//A)	Velocidade média dos veículos;
		System.out.println("Velocidade média dos veículos: " + (float) (velocidadessoma/veiculos));
		
		//B)	Total de multas em R$
		System.out.println("Total de multas em R$: " + (float) valormultas);
		
		//C)	Total de multas aplicadas
		System.out.println("Total de multas aplicadas: " + multas);
		
		//D)	Percentual de carros multados
		System.out.println("Total de multas aplicadas: " + (float) multas* 100 / veiculos + "%");
		
		
		leitor.close();
	}

}
