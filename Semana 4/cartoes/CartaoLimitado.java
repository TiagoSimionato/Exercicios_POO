package cartoes;

public class CartaoLimitado extends CartaoCredito
{
	public CartaoLimitado()
	{
		
	}
	@Override
	public boolean pagarComCredito(double valor)
	{
		if (super.verificarExtrato() + valor > 200)
		{
			return false;
		}
		super.pagarComCredito(valor);
		return true;
	}
}