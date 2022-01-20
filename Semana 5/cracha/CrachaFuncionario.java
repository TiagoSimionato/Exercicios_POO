public class CrachaFuncionario extends Cracha
{
	private  String cargo;
	private int mes;
	private int ano;

	public CrachaFuncionario()
	{
		
	}

	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}

	public void setDataAdmissao(int m, int a)
	{
		mes = m;
		ano = a;
	}

	@Override
	public void imprimir()
	{
		Impressao.imprimirLinha("FUNCIONARIO");
		Impressao.imprimirLinha("Nome: " + super.nome);
		Impressao.imprimirLinha("Cargo: " + cargo);
		Impressao.imprimirLinha("Admissao: " + mes + "/" + ano);
	}
}