package automotores;

public class Carro extends Veiculo
{
	private int numeroPortas;

	public Carro()
	{
		
	}

	@Override
	public String getTipo()
	{
		return "Carro modelo " + super.getModelo();
	}

	public void setNumeroPortas(int nPortas)
	{
		this.numeroPortas = nPortas;
	}

	public int getNumeroPortas()
	{
		return numeroPortas;
	}
}