package multimidia;

public class ArquivoAudio extends ArquivoMultimidia
{
	boolean audioHD;

	public ArquivoAudio(String nomeArquivo, boolean audioHD)
	{
		super(nomeArquivo);
		this.audioHD = audioHD;
	}

	@Override
	public String toString()
	{
		if (audioHD)
		{
			return "Audio: " + super.getNomeArquivo() + " (HD = true)";
		}
		else 
		{
			return "Audio: " + super.getNomeArquivo() + " (HD = false)";
		}
	}
}