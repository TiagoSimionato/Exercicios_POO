package usuarios;

public class PerfilRedeSocial extends PerfilUsuario
{
	String mensagemPaginaInicial;

	public PerfilRedeSocial(String nome, String login)
	{
		super(nome, login);
	}

	public PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial)
	{
		super(nome, login);
		this.mensagemPaginaInicial = mensagemPaginaInicial;
	}

	public String getPerfil()
	{
		if (mensagemPaginaInicial == null)
			return super.getNome() + " Sem mensagem";
		else 
			return super.getNome() + " " + mensagemPaginaInicial;
	}
}