package multimidia;

public class Playlist implements Cloneable
{
	private ArquivoMultimidia[] arquivos;
	private int indiceFinalDaLista;

	public Playlist()
	{
		arquivos = new ArquivoMultimidia[10];
		indiceFinalDaLista = 0;
	}

	public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos
	{
		if (indiceFinalDaLista == 10)
			throw new QuantidadeLimiteArquivos();
		else
		{
		    arquivos[indiceFinalDaLista] = arquivo;
		    indiceFinalDaLista++;
		}
	}

	public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido
	{
		if (indiceArquivo < 0 || indiceArquivo > indiceFinalDaLista || arquivos[indiceArquivo] == null)
			throw new IndiceArquivoInvalido(indiceArquivo);

		arquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);
	}

	public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido
	{
		if (indiceArquivo < 0 || indiceArquivo > indiceFinalDaLista || arquivos[indiceArquivo] == null)
			throw new IndiceArquivoInvalido(indiceArquivo);

		for (int i = 0; i <= indiceArquivo; i++)
		{
			ArquivoMultimidia tmp = arquivos[i];
			arquivos[i] = arquivos[indiceArquivo];
			arquivos[indiceArquivo] = tmp;
		}
	}

	public String[] listarArquivos()
	{
		String[] nomesArquivos = new String[indiceFinalDaLista];

		for (int i = 0; i < indiceFinalDaLista; i++)
		{
			nomesArquivos[i] = arquivos[i].toString();
		}
		return nomesArquivos;
	}

	public void ordenarArquivos(int tipo)
	{
		if (tipo == 1)
		{
			ordenarNome();
		}
		else if (tipo == 2)
		{
			ordenarTamanho();
		}
		else
		{

		}
	}

	private void ordenarNome()
	{
		for (int i = 0; i < indiceFinalDaLista; i++)
		{
			int indiceMenor = i;
			for (int j = i; j < indiceFinalDaLista; j++)
			{
				int comparacao = arquivos[indiceMenor].getNomeArquivo().compareTo(arquivos[j].getNomeArquivo());
				if (comparacao > 0)
				{
					indiceMenor = j;
				}
				else if (comparacao == 0)
				{
					if (arquivos[indiceMenor].getTamanhoArquivo() > arquivos[j].getTamanhoArquivo())
					{
						indiceMenor = j;
					}
				}
			}

			ArquivoMultimidia tmp = arquivos[indiceMenor];
			arquivos[indiceMenor] = arquivos[i];
			arquivos[i] = tmp;
		}
	}

	private void ordenarTamanho()
	{
		for (int i = 0; i < indiceFinalDaLista; i++)
		{
			int indiceMenor = i;
			for (int j = i; j < indiceFinalDaLista; j++)
			{
				if (arquivos[indiceMenor].getTamanhoArquivo() > arquivos[j].getTamanhoArquivo())
				{
					indiceMenor = j;
				}
				else if (arquivos[indiceMenor].getTamanhoArquivo() == arquivos[j].getTamanhoArquivo())
				{
					if (arquivos[indiceMenor].getNomeArquivo().compareTo(arquivos[j].getNomeArquivo()) > 0)
					{
						indiceMenor = j;
					}
				}
			}

			ArquivoMultimidia tmp = arquivos[indiceMenor];
			arquivos[indiceMenor] = arquivos[i];
			arquivos[i] = tmp;
		}
	}
}

class QuantidadeLimiteArquivos extends Exception
{
	public QuantidadeLimiteArquivos()
	{
		super("Quantidade limite de arquivos foi atingida.");
	}
}

class IndiceArquivoInvalido extends Exception
{
	private int indiceInvalido;

	public IndiceArquivoInvalido(int indiceInvalido)
	{
		super("Indice de arquivo invalido = " + indiceInvalido);

		this.indiceInvalido = indiceInvalido;
	}

	public int getIndiceInvalido()
	{
		return indiceInvalido;
	}
}