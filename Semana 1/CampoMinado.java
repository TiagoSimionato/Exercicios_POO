import java.util.Scanner;
class CampoMinado
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int linhas = leitor.nextInt();
		int colunas = leitor.nextInt();

		int[][] campo = new int[linhas][colunas];
		for (int i = 0; i < linhas; i++)
		{
			for (int j = 0; j < colunas; j++)
			{
				campo[i][j] = leitor.nextInt();
			}
		}

		int linhax = leitor.nextInt();
		int colunax = leitor.nextInt();

		int qtdBombas = 0;
		if (linhax > 0)
		{
			if (colunax > 0 && campo[linhax - 1][colunax - 1] == 1)
			qtdBombas++;
			if (campo[linhax - 1][colunax] == 1)
				qtdBombas++;
			if (colunax < (colunas - 1) && campo[linhax - 1][colunax + 1] == 1)
				qtdBombas++;
		}
		if (linhax < (linhas - 1))
		{
			if (colunax < (colunas - 1) && campo[linhax + 1][colunax + 1] == 1)
				qtdBombas++;
			if (colunax > 0 && campo[linhax + 1][colunax - 1] == 1)
				qtdBombas++;
			if (campo[linhax + 1][colunax] == 1)
				qtdBombas++;
		}
		if (colunax > 0 && campo[linhax][colunax - 1] == 1)
			qtdBombas++;
		if (colunax < (colunas - 1) && campo[linhax][colunax + 1] == 1)
			qtdBombas++;

		System.out.println(qtdBombas);
	}
}