import java.util.Scanner;

class Potencias2
{
	public static boolean potencia2(int n)
	{
		if (n < 1)
			return false;
		while (n > 1)
		{
			if (n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);

		int numeros = leitor.nextInt();

		int qtd = 0;
		int novaEntrada;
		for (int i = 0; i < numeros; i++)
		{
			novaEntrada = leitor.nextInt();
			if (potencia2(novaEntrada)) 
				qtd++;
		}
		System.out.println(qtd);
	}
}