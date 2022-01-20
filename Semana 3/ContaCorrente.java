public class ContaCorrente
{
	private String titular;
	private double saldo;
	private static int qtdContas = 0;

	public ContaCorrente(String nome)
	{
		this.titular = nome;
		this.saldo = 0;
		qtdContas++;
	}

	public ContaCorrente(String nome, double saldo)
	{
		this.titular = nome;
		this.saldo = saldo;
		qtdContas++;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public String getTitular()
	{
		return titular;
	}

	public boolean depositar(double valor)
	{
		if (valor > 0)
		{
			saldo += valor;
			return true;
		}
		return false;
	}

	public boolean sacar(double valor)
	{
		if (valor > 0 && saldo >= valor)
		{
			saldo -= valor;
			return true;
		}
		return false;
	}

	public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor)
	{
		if (valor > 0 && de.saldo > valor)
		{
			de.saldo -= valor;
			para.saldo += valor;
			return true;
		}
		return false;
	}
	public static int getQuantidadeContas()
	{
		return qtdContas;
	}
}