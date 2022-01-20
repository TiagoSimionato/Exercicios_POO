package matematica;

public class Fracao
{
	private int denominador;
	private int numerador;

	public Fracao()
	{
		this.denominador = 1;
		this.numerador = 1;
	}

	public Fracao(int numerador)
	{
		this.denominador = 1;
		this.numerador = numerador;
	}

	public Fracao(int numerador, int denominador)
	{
		int maiorDivisorComum = mdc(numerador, denominador);
		this.denominador = denominador / maiorDivisorComum;
		this.numerador = numerador / maiorDivisorComum;
	}

	public String getRepresentacao()
	{
		return ("" + numerador + "/" + denominador);
	}

	public Fracao somar(Fracao f2)
	{
		return somar(this, f2);
	}

	public static Fracao somar(Fracao f1, Fracao f2)
	{
		int denominador1 = f1.denominador * f2.denominador;
		int numerador1 = f1.numerador * f2.denominador;
		int denominador2 = f2.denominador * f1.denominador;
		int numerador2 = f2.numerador * f1.denominador;

		return new Fracao(numerador1 + numerador2, denominador1);
	}

	public static Fracao somar(Fracao[] fracoes)
	{
		Fracao resultado = new Fracao(0);
		for (int i = 0; i < fracoes.length; i++)
		{
			resultado = somar(resultado, fracoes[i]);
		}
		return resultado;
	}

	public static Fracao multiplicar(Fracao f1, Fracao f2)
	{
		return new Fracao(f1.numerador * f2.numerador, f1.denominador * f2.denominador);
	}

	public static int mdc(int a, int b)
	{
		while (a != b)
		{
			if (a > b)
			{
				a = a - b;
			}
			else
			{
				b = b - a;
			}
		}
		return a;
	}
}