public class Paralelogramo
{
	private int ladoA;
	private int ladoB;
	String tipo;

	public Paralelogramo(int ladoA)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoA;
		this.tipo = "Paralelogramo quadrado";
	}

	public Paralelogramo(int ladoA, int ladoB)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		if (ladoA == ladoB)
		{
			this.tipo = "Paralelogramo quadrado";
		}
		else
		{
			this.tipo = "Paralelogramo retangulo";
		}
	}

	public int getArea()
	{
		return ladoA * ladoB;
	}

	public String getTipo()
	{
		return tipo;
	}
}