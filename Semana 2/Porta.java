class Porta
{
	private boolean aberta = true;
	private String nome = "Porta sem nome";

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public boolean estaAberta()
	{
		return aberta;
	}

	public int abrir()
	{
		if (!aberta)
		{
			aberta = true;
			return 0;
		}
		else
		{
			return 1;
		}
		
	}

	public int fechar()
	{
		if (!aberta)
		{
			return 1;
		}
		else
		{
			aberta = false;
			return 0;
		}
	}
}