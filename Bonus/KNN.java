package classificacao;

public class KNN
{
	private int k;
	private ListaExemplos lista;
	private No inicio;

	public KNN(int k)
	{
		this.k = k;
		this.inicio = null;
	}

	public void setDadosTreinamento(ListaExemplos lista)
	{
		this.lista = lista;
	}

	public int predizer(double[] atributosEntrada) throws Exception, ExcecaoDadosInvalidos
	{
		if (lista == null)
			throw new Exception("Dados de treinamento - nao inicializado.");

		if (lista.getExemplos()[0].atributosEntrada.length != atributosEntrada.length)
			throw new ExcecaoDadosInvalidos(lista.getExemplos()[0].atributosEntrada.length, atributosEntrada.length);

		lista.ordenarPelaDistancia(atributosEntrada);
		/*if (inicio != null)
			limparLista(inicio);*/
		inicio = null;

		for (int i = 0; i < k; i++)
		{
			No alvo = buscarNo(lista.getExemplos()[i].getRotuloClasse());
			if (alvo == null)
			{
				adicionarNo(lista.getExemplos()[i].getRotuloClasse());
			}
			else
			{
				alvo.frequencia++;
			}
		}

		No atual = inicio;
		No rotuloPrevisto = inicio;
		while(atual != null)
		{
			if (atual.frequencia > rotuloPrevisto.frequencia)
			{
				rotuloPrevisto = atual;
			}
			atual = atual.prox;
		}
		return rotuloPrevisto.rotulo;
	}

	static class No
	{
		int rotulo;
		int frequencia;
		No prox;

		No(int rotulo)
		{
			this.rotulo = rotulo;
			this.frequencia = 1;
			this.prox = null;
		}
	}

	private void adicionarNo(int rotulo)
	{
		No novo = new No(rotulo);

		if (inicio == null)
		{
			inicio = novo;
		}
		else
		{
			No anterior = null;
			No atual = inicio;

			while(atual != null)
			{
				anterior = atual;
				atual = atual.prox;
			}
			anterior.prox = novo;
		}
	}

	private No buscarNo(int rotulo)
	{
		if (inicio == null)
		{
			return null;
		}
		else
		{
			No atual = inicio;

			while(atual != null)
			{
				if (atual.rotulo == rotulo)
				{
					return atual;
				}
				atual = atual.prox;
			}
			return null;
		}
	}

	private void limparLista(No atual)
	{
		if (atual.prox != null)
		{
			limparLista(atual.prox);
		}
		atual.prox = null;
		atual = null;
	}
}

class ExcecaoDadosInvalidos extends Exception
{
	private int qtdAtributosTreinamento;
	private int qtdAtributosPredizer;

	ExcecaoDadosInvalidos(int qtdTreinamento, int qtdPredizer)
	{
		super(qtdTreinamento + " " + qtdPredizer);
		this.qtdAtributosTreinamento = qtdTreinamento;
		this.qtdAtributosPredizer = qtdPredizer;
	}

	public int getQtdAtributosTreinamento()
	{
		return qtdAtributosTreinamento;
	}

	public int getQtdAtributosPredizer()
	{
		return qtdAtributosPredizer;
	}
}