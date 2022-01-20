package empresa;

public class Pedido
{
	int[] carrinho;
	int totalProdutos = 0;
	private boolean entregue;
	private boolean cancelado;

	public boolean adicionarProduto(int codProduto)
	{
		if (cancelado)
			return false;
		else if (entregue)
			return false;
		
		if (carrinho == null)
			carrinho = new int[5];

		for (int i = 0; i < totalProdutos; i++)
		{
			if (carrinho[i] == codProduto)
			{
				return false;
			}
		}

		if (totalProdutos < 5)
		{
			carrinho[totalProdutos] = codProduto;
			totalProdutos++;
			return true;
		}
		return false;
	}

	public int[] entregar()
	{
		if (!cancelado && carrinho != null)
		{
			int[] codigosEntrega = new int[totalProdutos];

			for (int i = 0; i < codigosEntrega.length; i++)
			{
				codigosEntrega[i] = carrinho[i];
			}

			entregue = true;
			return codigosEntrega;
		}
		return null;
	}

	public boolean cancelar()
	{
		if (!entregue)
		{
			cancelado = true;
			return true;
		}
		return false;
	}

	public boolean somarPedido(Pedido p)
	{
		int totalProdutosSoma = totalProdutos;
		for (int i = 0; i < p.totalProdutos; i++)
		{
			if (!estaNoCarrinho(p.carrinho[i]))
			{
				totalProdutosSoma++;
			}
		}

		if (totalProdutosSoma < carrinho.length + 1)
		{
			for (int i = 0; i < p.totalProdutos; i++)
			{
				if (!estaNoCarrinho(p.carrinho[i]))
				{
					carrinho[totalProdutos] = p.carrinho[i];
					totalProdutos++;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean estaNoCarrinho(int codProduto)
	{
		for (int i = 0; i < totalProdutos; i++)
		{
			if (codProduto == carrinho[i])
			{
				return true;
			}
		}
		return false;
	}
}