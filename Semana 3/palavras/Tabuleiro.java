package palavras;

public class Tabuleiro
{
	char[][] tabuleiro;

	public Tabuleiro(char[][] matriz)
	{
		this.tabuleiro = new char[matriz.length][matriz[0].length];
		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[0].length; j++)
			{
				tabuleiro[i][j] = matriz[i][j];
			}
		}
	}

	public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz)
	{
		tabuleiro = new char[qtdLinhas][qtdColunas];
		int k = -1;
		for (int i = 0; i < qtdLinhas; i++)
		{
			for (int j = 0; j < qtdColunas; j++)
			{
				tabuleiro[i][j] = dadosMatriz[++k];
			}
		}
	}

	public PalavraEncontrada buscar(String palavra)
	{
		int[] linha = buscarLinha(palavra);
		if (linha[0] == 1)
		{
			return new PalavraEncontrada(palavra, linha[1], linha[2], linha[3], linha[4]);
		}
		int[] coluna = buscarColuna(palavra);
		if (coluna[0] == 1)
		{
			return new PalavraEncontrada(palavra, coluna[1], coluna[2], coluna[3], coluna[4]);
		}
		int[] diagonal = buscarDiagonal(palavra);
		if (diagonal[0] == 1)
		{
			return new PalavraEncontrada(palavra, diagonal[1], diagonal[2], diagonal[3], diagonal[4]);
		}
		return null;
	}

	public PalavraEncontrada[] buscar(String[] palavras)
	{
		PalavraEncontrada[] resultadosParciais = new PalavraEncontrada[palavras.length];
		int encontrado = 0;
		for (int i = 0; i < palavras.length; i++)
		{
			resultadosParciais[i] = buscar(palavras[i]);
			if (resultadosParciais[i] != null)
			{
				encontrado++;
			}
		}

		PalavraEncontrada[] resultadosFinais= new PalavraEncontrada[encontrado];
		int adicionado = 0;
		for (int i = 0; i < resultadosParciais.length; i++)
		{
			if (resultadosParciais[i] != null)
			{
				resultadosFinais[adicionado] = resultadosParciais[i];
				adicionado++;
			}
		}
		return resultadosFinais;
	}

	private int[] buscarLinha(String palavra)
	{
		int[] resultado = new int[5];
		resultado[0] = 0;
		int qtdLetrasIguais = 0;
		int qtdLetrasIguais2 = 0;
		boolean encontrado = false;
		for (int i = 0; i < tabuleiro.length && !encontrado; i++)
		{
			for (int j = 0; j < tabuleiro[0].length; j++)
			{
				if (tabuleiro[i][j] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = i;
					resultado[2] = j - palavra.length() + 1;
					resultado[3] = 1;
					resultado[4] = 1;
					encontrado = true;
					break;
				}

				if (tabuleiro[i][tabuleiro[0].length - 1 - j] == palavra.charAt(qtdLetrasIguais2))
				{
					qtdLetrasIguais2++;
				}
				else
				{
					qtdLetrasIguais2 = 0;
				}

				if (qtdLetrasIguais2 == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = i;
					resultado[2] = tabuleiro[0].length - 1 - j + palavra.length() - 1;
					resultado[3] = 1;
					resultado[4] = 2;
					encontrado = true;
					break;
				}
			}
			qtdLetrasIguais = 0;
		}
		return resultado;
	}

	private int[] buscarColuna(String palavra)
	{
		int[] resultado = new int[5];
		resultado[0] = 0;
		int qtdLetrasIguais = 0;
		int qtdLetrasIguais2 = 0;
		boolean encontrado = false;
		for (int i = 0; i < tabuleiro[0].length && !encontrado; i++)
		{
			for (int j = 0; j < tabuleiro.length; j++)
			{
				if (tabuleiro[j][i] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = j - palavra.length() + 1;
					resultado[2] = i;
					resultado[3] = 2;
					resultado[4] = 1;
					break;
				}

				if (tabuleiro[tabuleiro.length - 1 - j][i] == palavra.charAt(qtdLetrasIguais2))
				{
					qtdLetrasIguais2++;
				}
				else
				{
					qtdLetrasIguais2 = 0;
				}

				if (qtdLetrasIguais2 == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = tabuleiro.length - 1 - j + palavra.length() - 1;
					resultado[2] = i;
					resultado[3] = 2;
					resultado[4] = 2;
					encontrado = true;
					break;
				}
			}
			qtdLetrasIguais = 0;
		}
		return resultado;
	}

	private int[] buscarDiagonal(String palavra)
	{
		int[] resultado = new int[5];
		resultado[0] = 0;
		int qtdLetrasIguais = 0;
		boolean encontrado = false;

		for (int offset = -(tabuleiro.length - 1); offset < tabuleiro[0].length && !encontrado; offset++)
		{
			int x;
			if (offset < 0)
				x = -offset;
			else
				x = 0;

			int y;
			if (offset > 0)
				y = offset;
			else
				y = 0;

			while(x < tabuleiro.length && y < tabuleiro[0].length)
			{
				if (tabuleiro[x][y] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = x - palavra.length() + 1;
					resultado[2] = y - palavra.length() + 1;
					resultado[3] = 3;
					resultado[4] = 2;
					encontrado = true;
					break;
				}
				x++;
				y++;
			}
			qtdLetrasIguais = 0;
		}

		for (int offset = 0; offset < (tabuleiro.length + tabuleiro[0].length - 1) && !encontrado; offset++)
		{
			int x;
			if (offset < tabuleiro.length )
				x = offset;
			else
				x = tabuleiro.length - 1;

			int y;
			if (offset < tabuleiro.length)
				y = tabuleiro[0].length - 1;
			else
				y = (tabuleiro.length + tabuleiro[0].length - 2) - offset;

			while(x > -1 && y > -1)
			{
				if (tabuleiro[x][y] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = x + palavra.length() - 1;
					resultado[2] = y + palavra.length() - 1;
					resultado[3] = 3;
					resultado[4] = 4;
					encontrado = true;
					break;
				}
				x--;
				y--;
			}
			qtdLetrasIguais = 0;
		}

		for (int offset = - (tabuleiro[0].length - 1); offset < tabuleiro.length && !encontrado; offset++)
		{
			int x;
			if (offset < 1 )
				x = tabuleiro.length - 1;
			else
				x = tabuleiro.length - 1 - offset;

			int y;
			if (offset < 1)
				y = -offset;
			else
				y = 0;

			while(x > -1 && y < tabuleiro[0].length)
			{
				if (tabuleiro[x][y] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = x + palavra.length() - 1;
					resultado[2] = y - palavra.length() + 1;
					resultado[3] = 3;
					resultado[4] = 1;
					encontrado = true;
					break;
				}
				x--;
				y++;
			}
			qtdLetrasIguais = 0;
		}

		for (int offset = 0; offset < (tabuleiro.length + tabuleiro[0].length - 1) && !encontrado; offset++)
		{
			int x;
			if (offset < tabuleiro.length )
				x = tabuleiro.length - 1 - offset;
			else
				x = 0;

			int y;
			if (offset < tabuleiro.length)
				y = tabuleiro[0].length - 1;
			else
				y = (tabuleiro.length + tabuleiro[0].length - 2) - offset;

			while(x < tabuleiro.length - 1 && y > -1)
			{
				if (tabuleiro[x][y] == palavra.charAt(qtdLetrasIguais))
				{
					qtdLetrasIguais++;
				}
				else
				{
					qtdLetrasIguais = 0;
				}

				if (qtdLetrasIguais == palavra.length())
				{
					resultado[0] = 1;
					resultado[1] = x - palavra.length() + 1;
					resultado[2] = y + palavra.length() - 1;
					resultado[3] = 3;
					resultado[4] = 3;
					encontrado = true;
					break;
				}
				x++;
				y--;
			}
			qtdLetrasIguais = 0;
		}
		return resultado;
	}
}