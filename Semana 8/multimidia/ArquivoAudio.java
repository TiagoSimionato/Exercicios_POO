package multimidia;

public class ArquivoAudio extends ArquivoMultimidia
{
	boolean audioHD;

	public ArquivoAudio(String nomeArquivo, int tamanho, boolean audioHD)
	{
		super(nomeArquivo, tamanho);
		this.audioHD = audioHD;
	}

	@Override
	public String toString()
	{
		return "Audio: " + super.getNomeArquivo() + " (" + super.getTamanhoArquivo() + ")";
	}
}