import java.util.Scanner;

class Piramide
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int linhas = leitor.nextInt();

		for (int i = linhas; i > 0; i--)
		{
			for (int j = - (linhas - 1); j < linhas; j++)
			{
				if (j > (linhas - i) || j < (i - linhas) )
					System.out.print("-");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
}