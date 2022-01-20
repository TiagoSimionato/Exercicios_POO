package relatorio;

public class ImpressaoSimples implements PluginImpressao
{
	public ImpressaoSimples()
	{

	}

	@Override
	public void imprimir(Relatorio r)
	{
		Impressao.imprimirLinha(r.getTexto());
	}
}