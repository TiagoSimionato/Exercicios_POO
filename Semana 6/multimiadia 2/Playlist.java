package multimidia;

public class Playlist implements Cloneable
{
	private ArquivoMultimidia[] arquivos;
	private int indiceFinalDaLista;

	public Playlist()
	{
		arquivos = new ArquivoMultimidia[100];
		indiceFinalDaLista = 0;
	}

	public void adicionarItem(ArquivoMultimidia arquivo)
	{
		arquivos[indiceFinalDaLista] = arquivo;
		indiceFinalDaLista++;
	}

	public void renomearItem(int indiceArquivo, String novoNomeArquivo)
	{
		if (arquivos[indiceArquivo] != null)
		{
			arquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);
		}
	}

	public void moverParaInicio(int indiceArquivo)
	{
		if (arquivos[indiceArquivo] != null)
		{
			for (int i = 0; i <= indiceArquivo; i++)
			{
				ArquivoMultimidia tmp = arquivos[i];
				arquivos[i] = arquivos[indiceArquivo];
				arquivos[indiceArquivo] = tmp;

			}
		}
	}

	public String[] listarArquivos()
	{
		String[] nomesArquivos = new String[indiceFinalDaLista];

		for (int i = 0; i < indiceFinalDaLista; i++)
		{
			nomesArquivos[i] = arquivos[i].getNomeArquivo();
		}
		return nomesArquivos;
	}

	@Override
	public Playlist clone() throws CloneNotSupportedException
	{
		Playlist novaPlaylist = (Playlist) super.clone();
		novaPlaylist.arquivos = this.arquivos.clone();

		for (int i = 0; i < indiceFinalDaLista; i++)
		{
			if (arquivos[i] != null)
			{
				novaPlaylist.arquivos[i] = this.arquivos[i].clone();
			}
		}
		
		return novaPlaylist;
	}
}