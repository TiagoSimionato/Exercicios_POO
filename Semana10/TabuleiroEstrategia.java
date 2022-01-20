package jogo;

public class TabuleiroEstrategia extends Tabuleiro
{
	private EstrategiaJogo jogador1;
	private EstrategiaJogo jogador2;

	public void setStrategyJogador1(EstrategiaJogo jogador1)
	{
		this.jogador1 = jogador1;
	}

	public void setStrategyJogador2(EstrategiaJogo jogador2)
	{
		this.jogador2 = jogador2;
	}

	public void jogarPartida()
	{
		while(getJogadorVencedor() == '.')
		{
			int[] jogadaImpar = jogador1.getProximaJogada(super.getTabuleiro(), 'X');
			super.jogar('X', jogadaImpar[0], jogadaImpar[1]);
			if(getJogadorVencedor() == '.')
			{
				int[] jogadaPar = jogador2.getProximaJogada(super.getTabuleiro(), 'O');
				super.jogar('O', jogadaPar[0], jogadaPar[1]);
			}
		}
	}
}