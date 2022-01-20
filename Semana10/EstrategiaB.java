package jogo;

public class EstrategiaB implements EstrategiaJogo
{
	@Override
	public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador)
	{
		if (dadosTabuleiro[1][1] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 1;
			coordenadas[1] = 1;
			return coordenadas;
		}
		else if (dadosTabuleiro[0][0] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 0;
			coordenadas[1] = 0;
			return coordenadas;
		}
		else if (dadosTabuleiro[0][2] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 0;
			coordenadas[1] = 2;
			return coordenadas;
		}
		else if (dadosTabuleiro[2][0] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 2;
			coordenadas[1] = 0;
			return coordenadas;
		}
		else if (dadosTabuleiro[2][2] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 2;
			coordenadas[1] = 2;
			return coordenadas;
		}
		else if (dadosTabuleiro[0][1] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 0;
			coordenadas[1] = 1;
			return coordenadas;
		}
		else if (dadosTabuleiro[1][0] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 1;
			coordenadas[1] = 0;
			return coordenadas;
		}
		else if (dadosTabuleiro[1][2] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 1;
			coordenadas[1] = 2;
			return coordenadas;
		}
		else if (dadosTabuleiro[2][1] == '.')
		{
			int[] coordenadas = new int[2];
			coordenadas[0] = 2;
			coordenadas[1] = 1;
			return coordenadas;
		}
	}
}