import dispositivos.LampadaInteligente;

public class GerenciadorLampadas
{
	LampadaInteligente[] lampadas;
	private int totalLampadas = 0;

	public void adicionarLampada()
	{
		if (lampadas == null)
		{
			lampadas = new LampadaInteligente[10];
		}

		LampadaInteligente novaLampada = new LampadaInteligente();
		totalLampadas++;

		for (int i = 0; i < lampadas.length; i++)
		{
			if (lampadas[i] == null)
			{
				lampadas[i] = novaLampada;
				break;
			} 
		}
	}

	public void ligarLampada(int indiceLampada)
	{
		if (!lampadas[indiceLampada].getEstado())
		{
			lampadas[indiceLampada].ligar();
		}
	}

	public void desligarLampada(int indiceLampada)
	{
		if (lampadas[indiceLampada].getEstado())
		{
			lampadas[indiceLampada].desligar();
		}
	}

	public void ligarTodasLampadas()
	{
		for (int i = 0; i < totalLampadas; i++)
		{
			ligarLampada(i);
		}
	}

	public void desligarTodasLampadas()
	{
		for (int i = 0; i < totalLampadas; i++)
		{
			desligarLampada(i);
		}
	}
}