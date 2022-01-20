package dispositivos;

public class Gerenciador
{
	private DispositivoInteligente[] dispositivos;
	private int indiceUltimoDispositivo;

	public Gerenciador()
	{
		dispositivos = new DispositivoInteligente[10];
		indiceUltimoDispositivo = 0;
	}

	public void adicionarDispositivo(DispositivoInteligente d)
	{
		dispositivos[indiceUltimoDispositivo] = d;
		indiceUltimoDispositivo++;
	}

	public void ligarTodosDispositivos()
	{
		for (int i = 0; i < indiceUltimoDispositivo; i++)
		{
			dispositivos[i].ligar();
		}
	}

	public void desligarTodosDispositivos()
	{
		for (int i = 0; i < indiceUltimoDispositivo; i++)
		{
			dispositivos[i].desligar();
		}
	}
}

abstract class DispositivoInteligente
{
	boolean estado;

	public DispositivoInteligente()
	{
		estado = false;
	}

	public void ligar()
	{
		estado = true;
	}

	public void desligar()
	{
		estado = false;
	}

	public boolean getEstado()
	{
		return estado;
	}
}

class LampadaInteligente extends DispositivoInteligente
{
	public LampadaInteligente()
	{
		super();
	}
}

class TomadaInteligente extends DispositivoInteligente
{
	public TomadaInteligente()
	{
		super();
	}
}

class InterruptorInteligente extends DispositivoInteligente
{
	public InterruptorInteligente()
	{
		super();
	}
}