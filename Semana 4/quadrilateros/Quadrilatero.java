package quadrilateros;

public class Quadrilatero
{
	private double ab;
	private double bc;
	private double cd;
	private double da;

	public Quadrilatero()
	{
		
	}

	public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA)
	{
		this.ab = ladoAB;
		this.bc = ladoBC;
		this.cd = ladoCD;
		this.da = ladoDA;
	}

	public double getPerimetro()
	{
		return ab + bc + cd + da;
	}

	public String getPropriedades()
	{
		return "Figura de quatro lados.";
	}
}