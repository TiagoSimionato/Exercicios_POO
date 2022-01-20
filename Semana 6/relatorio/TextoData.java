package relatorio;

public class  TextoData implements PluginTexto
{
	private int dia;
	private int mes;
	private int ano;

	public TextoData(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String aplicar(String texto)
	{
		return texto + " (DATA: " + dia + "/" + mes + "/" + ano + ")";
	}
}