package cartoes;

public class CartaoDebito
{
	private String titular;
	private double saldo;

	public CartaoDebito()
	{
		this.saldo = 0;
	}

	public void setTitular(String titular)
	{
		this.titular = titular;
	}

	public void adicionarSaldoDebito(double valor)
	{
		this.saldo += valor;
	}

	public double verificarSaldoDebito()
	{
		return this.saldo;
	}

	public boolean pagarComDebito(double valor)
	{
		if (verificarSaldoDebito() > valor)
		{
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}