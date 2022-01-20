// A classe Operacoes nao imprime dados
public class Operacoes {
	private Integer a;
	private Integer b;
	private Integer c;


	private Integer resultadoSoma2;
	private Integer resultadoSoma3;
	private Integer resultadoMultiplica;

	private Integer min;
	private Integer max;

	public void setA(int a)
	{
		this.a = a;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	public int soma2()
	{
		resultadoSoma2 = a + b;
		int atualizaMin = getMin();
		int atualizaMax = getMax();
		return resultadoSoma2.intValue();
	}

	public int soma3()
	{
		resultadoSoma3 = a + b + c;
		int atualizaMin = getMin();
		int atualizaMax = getMax();
		return resultadoSoma3.intValue();
	}

	public int multiplica()
	{
		resultadoMultiplica = a * b;
		int atualizaMin = getMin();
		int atualizaMax = getMax();
		return resultadoMultiplica.intValue();
	}
	
	public int getMin()
	{
		if (min == null)
		{
			if (resultadoSoma2 != null)
			{
				min = resultadoSoma2.intValue();
			}
			else if (resultadoSoma3 != null)
			{
				min = resultadoSoma3.intValue();
			}
			else
			{
				min = resultadoMultiplica.intValue();
			}
		}

		if (resultadoSoma2 != null && resultadoSoma2.intValue() < min.intValue())
		{
			min = resultadoSoma2;
		}
		if (resultadoSoma3 != null && resultadoSoma3.intValue() < min.intValue())
		{
			min = resultadoSoma3;
		}
		if (resultadoMultiplica != null && resultadoMultiplica.intValue() < min.intValue())
		{
			min = resultadoMultiplica;
		}
		return min.intValue();
	}

	public int getMax()
	{
		if (max == null)
		{
			if (resultadoSoma2 != null)
			{
				max = resultadoSoma2.intValue();
			}
			else if (resultadoSoma3 != null)
			{
				max = resultadoSoma3.intValue();
			}
			else
			{
				max = resultadoMultiplica.intValue();
			}
		}
		

		if (resultadoSoma2 != null && resultadoSoma2.intValue() > max.intValue())
		{
			max = resultadoSoma2;
		}
		if (resultadoSoma3 != null && resultadoSoma3.intValue() > max.intValue())
		{
			max = resultadoSoma3;
		}
		if (resultadoMultiplica != null && resultadoMultiplica.intValue() > max.intValue())
		{
			max = resultadoMultiplica;
		}
		return max.intValue();
	}
}