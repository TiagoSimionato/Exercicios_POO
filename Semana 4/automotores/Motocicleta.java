package automotores;

public class Motocicleta extends Veiculo
{
	private boolean temCarroLateral;

	public Motocicleta()
	{
		
	}

	@Override
	public String getTipo()
	{
		return "Motocicleta modelo " + super.getModelo();
	}

	public void setTemCarroLateral(boolean temCarroLateral)
	{
		this.temCarroLateral = temCarroLateral;
	}

	public boolean getTemCarroLateral()
	{
		return temCarroLateral;
	}
}