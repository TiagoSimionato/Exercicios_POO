package multimidia;

public class ArquivoVideo extends ArquivoMultimidia
{
	public int largura;
	public int altura;

	public ArquivoVideo(String nomeArquivo, int largura, int altura)
	{
		super(nomeArquivo);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public String toString()
	{
		return "Video: " + super.getNomeArquivo() + " (" + largura + " x " + altura + ")";
	}
}