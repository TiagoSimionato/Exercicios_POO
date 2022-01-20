package multimidia;

public abstract class ArquivoMultimidia
{
	private String nomeArquivo;
	private int tamanho; 

	public ArquivoMultimidia(String nomeArquivo, int tamanho)
	{
		this.nomeArquivo = nomeArquivo;
		this.tamanho = tamanho;
	}

	public final void setNomeArquivo(String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	}

	public final String getNomeArquivo()
	{
		return nomeArquivo;
	}

	public final int getTamanhoArquivo()
	{
		return tamanho;
	}
}