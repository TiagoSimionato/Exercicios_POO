package estruturas;

public class Conjunto implements Lista
{
	private int qtdItens;
	private Node inicio;
	
	public Conjunto()
	{
		qtdItens = 0;
		inicio = null;
	}

	static class Node
	{
		int numero;
		Node prox;

		Node(int numero)
		{
			this.numero = numero;
			this.prox = null;
		}
	}

	@Override
	public int getQtd()
	{
		return qtdItens;
	}

	@Override
	public void adicionar(int numero)
	{
		Node novoNo = new Node(numero);

		if (inicio == null)
		{
			inicio = novoNo;
		}
		else
		{
			Node anterior = null;
			Node atual = inicio;
			while(atual != null)
			{
				if (atual.numero == numero)
				{
					return;
				}
				anterior = atual;
				atual = atual.prox;
			}
			anterior.prox = novoNo;
		}
		qtdItens++;
	}

	@Override
	public void remover(int numero)
	{
		Node atual = inicio;
		Node anterior = null;

		if (inicio.numero == numero)
		{
			inicio = inicio.prox;
			qtdItens--;
		}
		else
		{
			while(atual != null && atual.numero != numero)
			{
				anterior = atual;
				atual = atual.prox;
			}
			if (atual != null && atual.numero == numero)
			{
				anterior.prox = atual.prox;
				qtdItens--;
				atual.prox = null;
				atual = null;
			}
		}
	}

	@Override
	public int buscar(int numero)
	{
		int indiceAtual = 0;
		Node atual = inicio;

		while(atual != null)
		{
			if (atual.numero == numero)
			{
				return indiceAtual;
			}
			atual = atual.prox;
			indiceAtual++;
		}
		return -1;
	}

	@Override
	public String toString()
	{
		Node atual = inicio;
		String sequencia = "";
		while (atual != null)
		{
			sequencia = sequencia.concat(Integer.toString(atual.numero));
			if (atual.prox != null)
			{
				sequencia = sequencia.concat(" ");
			}

			atual = atual.prox;
		}
		return sequencia;
	}

	public static Conjunto uniao(Conjunto a, Conjunto b)
	{
		Conjunto novoConjunto = new Conjunto();

		Node aElemento = a.inicio;
		while(aElemento != null)
		{
			novoConjunto.adicionar(aElemento.numero);
			aElemento = aElemento.prox;
		}

		Node bElemento = b.inicio;
		while(bElemento != null)
		{
			byte adicionar = 1;

			aElemento = a.inicio;
			while (aElemento != null)
			{
				if (aElemento.numero == bElemento.numero)
				{
					adicionar = 0;
				}
				aElemento = aElemento.prox;
			}
			if (adicionar == 1)
			{
				novoConjunto.adicionar(bElemento.numero);
			}
			bElemento = bElemento.prox;
		}
		return novoConjunto;
	}

	public static Conjunto intersecao(Conjunto a, Conjunto b)
	{
        Conjunto novoConjunto = new Conjunto();
		Node aElemento = a.inicio;

		while(aElemento != null)
		{
			Node bElemento = b.inicio;

			while(bElemento != null)
			{
				if (aElemento.numero == bElemento.numero)
				{
					novoConjunto.adicionar(aElemento.numero);
				}
				bElemento = bElemento.prox;
			}
			aElemento = aElemento.prox;
		}
        return novoConjunto;
	}
}