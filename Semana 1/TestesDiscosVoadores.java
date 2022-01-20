import java.util.Scanner;

class TestesDiscosVoadores
{
	public static void ordenaLinha(int[][] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			int menorLinha = i;
			for (int j = i + 1; j < m.length; j++)
			{
				for (int k = 0; k < m[0].length; k++)
				{
					if (m[j][k] < m[menorLinha][k])
					{
						menorLinha = j;
						break;
					}
					else if (m[j][k] > m[menorLinha][k])
					{
						break;
					}

				}
			}
			if (menorLinha != i)
			{
				for (int k = 0; k < m[0].length; k++)
				{
					int tmp = m[menorLinha][k];
					m[menorLinha][k] = m[i][k];
					m[i][k] = tmp;
				}
			}
		}
	}

	public static void ordenaColuna(int[][] m)
	{
		for (int i = 0; i < m[0].length; i++)
		{
			int menorColuna = i;
			for (int j = i + 1; j < m[0].length; j++)
			{
				for (int k = 0; k < m.length; k++)
				{
					if (m[k][j] < m[k][menorColuna])
					{
						menorColuna = j;
						break;
					}
					else if (m[k][j] > m[k][menorColuna])
					{
						break;
					}

				}
			}
			if (menorColuna != i)
			{
				for (int k = 0; k < m.length; k++)
				{
					int tmp = m[k][menorColuna];
					m[k][menorColuna] = m[k][i];
					m[k][i] = tmp;
				}
			}
		}
	}

	public static void imprimeMatriz(int[][] m)
	{
		for (int i = 0; i < m.length; i++)
		{
			for (int j = 0; j < m[0].length; j++)
			{
				System.out.print(m[i][j]);
				if (j != m[0].length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int linha = leitor.nextInt();
		int coluna = leitor.nextInt();

		int[][] m = new int[linha][coluna];
		for (int i = 0; i < linha; i++)
		{
			for (int j = 0; j < coluna; j++)
			{
				m[i][j] = leitor.nextInt();
			}
		}

		ordenaLinha(m);
		imprimeMatriz(m);
		ordenaColuna(m);
		System.out.println();
		imprimeMatriz(m);
	}
}