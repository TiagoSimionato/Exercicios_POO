package geometria;

public class Comparacao<T>
{
	public static <T extends Comparable<T>> T maiorElemento(T[] v) 
	{
		int maior = 0;
		for (int i = 1; i < v.length; i++)
		{
			if (v[maior].compareTo(v[i]) < 0)
			{
				maior = i;
			}
		}
		return v[maior];
	}

	public static <T extends Comparable<T>> T menorElemento(T[] v) 
	{
		int menor = 0;
		for (int i = 1; i < v.length; i++)
		{
			if (v[menor].compareTo(v[i]) > 0)
			{
				menor = i;
			}
		}
		return v[menor];
	}
}