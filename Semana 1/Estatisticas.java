import java.util.Scanner;

class Estatisticas
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int entrada = leitor.nextInt();
		
		int soma = 0;
		double media;
		int qtdEntradas = 0;
		int minimo = entrada;
		int maximo = entrada;
		while (entrada > -1)
		{
			soma += entrada;
			qtdEntradas++;
			if (minimo > entrada)
				minimo = entrada;
			if (maximo < entrada)
				maximo = entrada;
			entrada = leitor.nextInt();
		}
		media = (double) soma /  (double)qtdEntradas;
		System.out.println(soma);
		System.out.println(String.format("%.2f", media));
		System.out.println(minimo);
		System.out.println(maximo);
	}
}