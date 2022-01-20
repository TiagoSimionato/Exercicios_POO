package chat;

public abstract class Mensagem
{
	protected int likes;
	protected Mensagem resposta;
	protected Mensagem respondeu;
	protected boolean ehResposta;

	protected Mensagem()
	{
		likes = 0;
		resposta = null;
		respondeu = null;
		ehResposta = false;
	}

	public void like()
	{
		likes++;
	}

	public void responder(Mensagem resposta)
	{
		this.resposta = resposta;
		resposta.respondeu = this;
		resposta.ehResposta = true;
	}

	public abstract String getRepresentacao();
}

class MensagemTexto extends Mensagem
{
	private String texto;

	MensagemTexto(String texto)
	{
		super();
		this.texto = texto;
	}

	@Override
	public String getRepresentacao()
	{
		String representacao = texto;

		if (super.ehResposta)
		{
			String textoRespondido = super.respondeu.getRepresentacao();
			for (int i = 0; i < textoRespondido.length(); i++)
			{
				if (textoRespondido.substring(i, i + 8).compareTo(" (likes=") == 0)
				{
					textoRespondido = textoRespondido.substring(0, i);
					break;
				}
			}
			representacao += " RESPOSTA A [" + textoRespondido + "]";
		}

		representacao += " (likes=" + super.likes + ")";

		return representacao;
	}
}

class MensagemImagem extends Mensagem
{
	private String arquivoImagem;
	private int largura;
	private int altura;

	public MensagemImagem(String arquivoImagem, int largura, int altura)
	{
		super();
		this.arquivoImagem = arquivoImagem;
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public String getRepresentacao()
	{
		String representacao = arquivoImagem + " " + largura + "x" + altura;

		if (super.ehResposta)
		{
			String textoRespondido = super.respondeu.getRepresentacao();
			for (int i = 0; i < textoRespondido.length(); i++)
			{
				if (textoRespondido.substring(i, i + 8).compareTo(" (likes=") == 0)
				{
					textoRespondido = textoRespondido.substring(0, i);
					break;
				}
			}
			representacao += " RESPOSTA A [" + textoRespondido + "]";
		}

		representacao += " (likes=" + super.likes + ")";

		return representacao;
	}
}