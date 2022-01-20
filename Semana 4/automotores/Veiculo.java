package automotores;

public class Veiculo
{
	private String modelo;

	public Veiculo()
	{

	}

	public String getTipo()
	{
		return "Veiculo generico modelo " + modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	protected String getModelo()
	{
		return modelo;	
	}
}