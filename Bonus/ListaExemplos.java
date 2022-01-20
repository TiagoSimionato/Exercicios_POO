package classificacao;

public class ListaExemplos
{
	private Exemplo[] listaDeExemplos;
	private int indiceFinal;

	public ListaExemplos(int maxQtd)
	{
		listaDeExemplos = new Exemplo[maxQtd];
		indiceFinal = 0;
	}

	public void adicionarExemplo(Exemplo exemplo)
	{
		listaDeExemplos[indiceFinal] = exemplo;
		indiceFinal++;
	}

	public void ordenarPelaDistancia(double[] atributosEntrada)
	{
		double[] resultadoDistancias = new double[listaDeExemplos.length];
		for (int i = 0; i < indiceFinal; i++)
		{
			int menor = i;
			if (resultadoDistancias[menor] == 0)
			{
				resultadoDistancias[menor] = distanciaEuclidiana(listaDeExemplos[menor].getAtributosEntrada(), atributosEntrada);
			}
			for (int j = i + 1; j < indiceFinal; j++)
			{
				if (resultadoDistancias[j] == 0)
				{
					resultadoDistancias[j] = distanciaEuclidiana(listaDeExemplos[j].getAtributosEntrada(), atributosEntrada);
				}
				if (resultadoDistancias[menor] > resultadoDistancias[j])
				{
					menor = j;
				}
			}
			if (menor != i)
			{
				Exemplo tmp = listaDeExemplos[i];
				listaDeExemplos[i] = listaDeExemplos[menor];
				listaDeExemplos[menor] = tmp;

				double resultadoTmp = resultadoDistancias[i];
				resultadoDistancias[i] = resultadoDistancias[menor];
				resultadoDistancias[menor] = resultadoTmp;
			}
		}
	}

	public int getQtdExemplos()
	{
		return indiceFinal;
	}

	public Exemplo[] getExemplos()
	{
		Exemplo[] listaRetorno = new Exemplo[indiceFinal];

		for (int i = 0; i < indiceFinal; i++)
		{
			listaRetorno[i] = listaDeExemplos[i];
		}

		return listaRetorno;
	}

	public Exemplo[] getPrimeirosExemplos(int n)
	{
		Exemplo[] listaRetorno = new Exemplo[n];

		for (int i = 0; i < n; i++)
		{
			listaRetorno[i] = listaDeExemplos[i];
		}

		return listaRetorno;
	}

	public Exemplo[] getUltimosExemplos(int n)
	{
		Exemplo[] listaRetorno = new Exemplo[n];

		int adiconados = 0;
		for (int i = indiceFinal - n; i < listaDeExemplos.length; i++)
		{
			if (listaDeExemplos[i] != null)
			{
				listaRetorno[adiconados] = listaDeExemplos[i];
				adiconados++;
			}
			if (adiconados == n)
				break;
		}

		return listaRetorno;
	}

	private double distanciaEuclidiana(double[] x, double[] y)
	{
		double somatorio = 0;

		for (int i = 0; i < x.length; i++)
		{
			double diferenca = x[i] - y[i];
			somatorio += diferenca * diferenca;
		}

		return raiz(somatorio); 
	}

	private double raiz(double numero)
	{
		double auxiliar = numero / 2;
		double raiz = (auxiliar + 2) / 2;
		
        int cont = 0;
		while (raiz - auxiliar != 0 && cont < 50)
		{
			auxiliar = raiz;
			raiz = (auxiliar + numero/auxiliar) / 2;
			cont++;
		}

		return raiz;
	}
}

class Exemplo
{
	double [] atributosEntrada;
	int rotuloClasse;

	public Exemplo(double[] atributosEntrada, int rotuloClasse)
	{
		this.atributosEntrada = atributosEntrada;
		this.rotuloClasse = rotuloClasse;
	}

	public double[] getAtributosEntrada()
	{
		return atributosEntrada;
	}

	public int getRotuloClasse()
	{
		return rotuloClasse;
	}
}