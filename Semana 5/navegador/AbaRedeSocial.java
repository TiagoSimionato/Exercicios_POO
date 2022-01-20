package navegador;

public class AbaRedeSocial extends AbaNavegador
{
	public AbaRedeSocial(String titulo)
	{
		super.titulo = titulo;
	}

	public void postar(String texto)
	{
		//historico pode ser acessado pelo pacote
		Navegador.historico[Navegador.qtdHistorico] = "Post: " + texto;
		Navegador.qtdHistorico++;
	}

	@Override
	public String getTipo()
	{
		return "RedeSocial";
	}
}