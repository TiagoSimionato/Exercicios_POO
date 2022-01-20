public class CrachaEstudante extends Cracha
{
	private String curso;

	public CrachaEstudante()
	{
		
	}

	public void setCurso(String curso)
	{
		this.curso = curso;
	}

	@Override
	public void imprimir()
	{
		Impressao.imprimirLinha("ESTUDANTE");
		Impressao.imprimirLinha("Nome: " + super.nome);
		Impressao.imprimirLinha("Curso: " + curso);
	}
}