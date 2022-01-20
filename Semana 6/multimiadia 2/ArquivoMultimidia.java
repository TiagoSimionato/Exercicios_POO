package multimidia;

public abstract class ArquivoMultimidia implements Cloneable
{
	private String nomeArquivo;

	public ArquivoMultimidia(String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	}

	public final void setNomeArquivo(String nomeArquivo)
	{
		this.nomeArquivo = nomeArquivo;
	}

	public final String getNomeArquivo()
	{
		return nomeArquivo;
	}

	@Override
	public ArquivoMultimidia clone() throws CloneNotSupportedException
	{
		return (ArquivoMultimidia) super.clone();
	}
}