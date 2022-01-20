package palavras;

public class PalavraEncontrada
{
	private String palavra;
	private int linha;
	private int coluna;
	private int tipo;
	private int direcao;

	public PalavraEncontrada(String palavra, int linha, int coluna, int tipo, int direcao) 
	{
		this.palavra = palavra;
		this.linha = linha;
		this.coluna = coluna;
		this.tipo = tipo;
		this.direcao = direcao;
	}

	public String getPalavra()
	{
		return palavra;
	}

	public int[] getPosicao()
	{
		return new int[] {linha, coluna};
	}

	public int getTipo()
	{
		return tipo;
	}

	public int getDirecao()
	{
		return direcao;
	}
}