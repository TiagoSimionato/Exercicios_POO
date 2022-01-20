package navegador;

public abstract class AbaNavegador
{
	protected String titulo;

	public AbaNavegador()
	{
		
	}

	public String getTitulo()
	{
		return titulo;
	}

	public abstract String getTipo();
}