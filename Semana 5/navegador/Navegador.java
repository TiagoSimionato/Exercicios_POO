package navegador;

public class Navegador
{
	private AbaNavegador[] listaDeAbas;
	private int numeroAbasAbertas;
	static String[] historico;
	static int qtdHistorico;


	public Navegador(int limiteAbas)
	{
		listaDeAbas = new AbaNavegador[limiteAbas];
		numeroAbasAbertas = 0;
		
		historico = new String[100];
		qtdHistorico = 0;
	}

	public AbaNavegador abrirAba(int tipo, String titulo)
	{
		if (numeroAbasAbertas < listaDeAbas.length)
		{
			AbaNavegador novaAba;
			if (tipo == 1)
			{
				novaAba = new AbaBuscador(titulo);
			}
			else
			{
				novaAba = new AbaRedeSocial(titulo);
			}
			listaDeAbas[numeroAbasAbertas] = novaAba;
			numeroAbasAbertas++;
			return novaAba;
		}
		return null;
	}

	public void fecharAba(AbaNavegador aba)
	{
		for (int i = 0; i < listaDeAbas.length; i++)
		{
			if (aba == listaDeAbas[i])
			{
				numeroAbasAbertas--;
				for (int j = i; j < listaDeAbas.length - 1; j++)
				{
					listaDeAbas[j] = listaDeAbas[j + 1];
				}
				break;
			}
		}
	}

	public String[] getAbas()
	{
		String[] textoAbas = new String[numeroAbasAbertas];

		for (int i = 0; i < numeroAbasAbertas; i++)
		{
			textoAbas[i] = listaDeAbas[i].getTipo() + " " + listaDeAbas[i].getTitulo();
		}

		return textoAbas;
	}

	public String[] getHistorico()
	{
		String[] historicoDasAbas = new String[qtdHistorico];

		for (int i = 0; i < qtdHistorico; i++)
		{
			historicoDasAbas[i] = historico[i];
		}

		return historicoDasAbas;
	}
}