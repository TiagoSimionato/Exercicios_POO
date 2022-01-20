public class OperacoesStrings
{
	private String texto;

	void setTexto(String texto)
	{
		this.texto = texto;
	}

	String getTexto()
	{
		return texto;
	}

	int contaPalavras()
	{
		int palavras = 0;
		byte espaco = 0;
		byte contabilizado = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) != ' ' && contabilizado == 0 && texto.charAt(i) != '.')
			{
				palavras++;
				contabilizado = 1;
				espaco = 0;
			}
			else if (texto.charAt(i) == ' ' && espaco == 0)
			{
				espaco = 1;
				contabilizado = 0;
			}
		}
		return palavras;
	}

	double comprimentoMedioPalavras()
	{
		int palavras = contaPalavras();
		int [] comprimentos = new int[palavras];
		palavras = 0;
		byte espaco = 0;
		byte contabilizado = 0;
		int caracteresPAtual = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) != ' ' && contabilizado == 0 && texto.charAt(i) != '.')
			{
				palavras++;
				contabilizado = 1;
				espaco = 0;
			}
			else if (texto.charAt(i) == ' ' && espaco == 0)
			{
				espaco = 1;
				contabilizado = 0;
			}

			if (texto.charAt(i) != ' ' && texto.charAt(i) != '.')
			{
				caracteresPAtual++;
			}
			if ((texto.charAt(i) == ' ' || texto.length() - 1 == i) && caracteresPAtual != 0)
			{
				comprimentos[palavras - 1] = caracteresPAtual;
				caracteresPAtual = 0;
			}
		}
		double media = 0;
		for (int i = 0; i < comprimentos.length; i++)
		{
			media += comprimentos[i];
		}
		media = media / (double) palavras;
		return media;
	}

	String maiorPalavra()
	{
		int caracteresPAtual = 0;
		int maisCaracteres = 0;
		int indiceMC = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) != ' ' && texto.charAt(i) != '.')
			{
				caracteresPAtual++;
			}
			if ((texto.charAt(i) == ' ' || texto.length() - 1 == i) && caracteresPAtual != 0)
			{
				if (caracteresPAtual > maisCaracteres)
				{
					maisCaracteres = caracteresPAtual;
					if (texto.charAt(i) == ' ' || texto.charAt(i) == '.')
					{
						indiceMC = i - 1;
					}
					else 
					{
						indiceMC = i;
					}
					
				}
				caracteresPAtual = 0;
			}
		}
		int indiceComeco = indiceMC;
		int indiceFinal = indiceMC;
		while (indiceMC > -1 && texto.charAt(indiceMC) != ' ')
		{
			indiceComeco = indiceMC;
			indiceMC--;
		}
		return texto.substring(indiceComeco, indiceFinal + 1);
	}

	int comprimentoMaiorPalavra()
	{
		int caracteresPAtual = 0;
		int maisCaracteres = 0;
		for (int i = 0; i < texto.length(); i++)
		{
			if (texto.charAt(i) != ' ' && texto.charAt(i) != '.')
			{
				caracteresPAtual++;
			}
			if (texto.charAt(i) == ' ' || texto.length() - 1 == i)
			{
				if (caracteresPAtual > maisCaracteres)
				{
					maisCaracteres = caracteresPAtual;
				}
				caracteresPAtual = 0;
			}
		}
		return maisCaracteres;
	}
}