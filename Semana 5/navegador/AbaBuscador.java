package navegador;

public class AbaBuscador extends AbaNavegador
{
	public AbaBuscador(String titulo)
	{
		super.titulo = titulo;
	}

	public void buscar(String expressao)
	{
		//historico pode ser acessado pelo pacote
		Navegador.historico[Navegador.qtdHistorico] = "Busca: " + expressao;
		Navegador.qtdHistorico++;
	}

	@Override
	public String getTipo()
	{
		return "Buscador";
	}
}