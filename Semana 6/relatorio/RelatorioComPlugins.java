package relatorio;

public class RelatorioComPlugins extends Relatorio
{
	private PluginImpressao pImpressao;

	public RelatorioComPlugins(String autor)
	{
		super(autor);
	}

	public void aplicarPluginTexto(PluginTexto plugin)
	{
		super.setTexto(plugin.aplicar(super.getTexto()));
	}

	public void setPluginImpressao(PluginImpressao p)
	{
		this.pImpressao = p;
	}

	public void imprimirRelatorio()
	{
		pImpressao.imprimir(this);
	}
}