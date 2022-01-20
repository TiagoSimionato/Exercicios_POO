package geometria;

public class Cubo implements Comparable<Cubo>
{
	private double lado;

	public Cubo(double lado)
	{
		this.lado = lado;
	}

	public double area()
	{
		return 6 * lado * lado;
	}

	@Override
	public int compareTo(Cubo c)
	{
		return (int) (this.lado - c.lado);
	}

	@Override
	public String toString()
	{
		return String.format("cubo de area %.1f", area());
	}
}