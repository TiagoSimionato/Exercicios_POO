package relatorio;

public class ImpressaoLimiteLargura implements PluginImpressao
{
	private int largura;

	public ImpressaoLimiteLargura(int largura)
	{
		this.largura = largura;
	}

	@Override
	public void imprimir(Relatorio r)
	{
		String texto = r.getTexto();
		String linha;
		boolean imprimiuTudo = false;

		while(!imprimiuTudo)
		{
			int indiceFinalUltimaPalavra = 0;

			for (int i = 0; i <= largura && i < texto.length(); i++)
			{
				if (texto.charAt(i) == ' ')
				{
					indiceFinalUltimaPalavra = i;
				}

				if (i == texto.length() - 1 && i < largura)
				{
					imprimiuTudo = true;
				}
			}
			if (!imprimiuTudo)
			{
    			linha = texto.substring(0, indiceFinalUltimaPalavra);
    			texto = texto.substring(indiceFinalUltimaPalavra + 1);
    			Impressao.imprimirLinha(linha);
			}
			else
			{
				Impressao.imprimirLinha(texto);
			}
			
		}
	}
}