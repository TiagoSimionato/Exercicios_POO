import dispositivos.LampadaInteligente;

public class GerenciadorLampadas
{
	private LampadaInteligente[] lampadas;
	private int indiceUltimoElemento;

	public GerenciadorLampadas()
	{
		indiceUltimoElemento = 0;
		lampadas = new LampadaInteligente[10];
	}

	public void adicionarLampada()
	{
		lampadas[indiceUltimoElemento] = new LampadaInteligente();
		indiceUltimoElemento++;
	}

	public void ligarLampada(int indiceLampada) throws LampadaEstaLigada
	{
		if (lampadas[indiceLampada].getEstado())
			throw new LampadaEstaLigada();

		lampadas[indiceLampada].ligar();
	}

	public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada
	{
		if (!lampadas[indiceLampada].getEstado())
			throw new LampadaEstaDesligada();

		lampadas[indiceLampada].desligar();
	}
}

class LampadaEstaLigada extends Exception
{
	public LampadaEstaLigada()
	{
		super("A lampada ja esta ligada.");
	}
}

class LampadaEstaDesligada extends Exception
{
	public LampadaEstaDesligada()
	{
		super("A lampada ja esta desligada.");
	}
}