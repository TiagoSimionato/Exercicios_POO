import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		int qtdUsuarios = leitor.nextInt();
		leitor.nextLine();

		Usuario[] usuarios = new Usuario[qtdUsuarios];

		for (int i = 0; i < qtdUsuarios; i++)
		{
			String cadastro = leitor.nextLine();
			int indiceEspaco = 1;
			for (int j = 0; j < cadastro.length(); j++)
			{
				if (cadastro.charAt(j) == ' ')
				{
					indiceEspaco = j;
					break;
				}
			}

			String login = cadastro.substring(0, indiceEspaco);
			String senha = cadastro.substring(indiceEspaco + 1);
			usuarios[i] = new Usuario(login, senha);
		}

		int k = leitor.nextInt();
		leitor.nextLine();
		for (int i = 0; i < k; i++)
		{
			String acesso = leitor.nextLine();
			int indiceEspaco = 1;
			for (int j = 0; j < acesso.length(); j++)
			{
				if (acesso.charAt(j) == ' ')
				{
					indiceEspaco = j;
					break;
				}
			}
			String login = acesso.substring(0, indiceEspaco);
			String senha = acesso.substring(indiceEspaco + 1);

			for (int j = 0; j < usuarios.length; j++)
			{
				if (usuarios[j].getLogin().compareTo(login) == 0)
				{
					try
					{
						usuarios[j].autenticar(senha);
						Impressao.imprimirUsuarioAutenticado(login);
					}
					catch (SenhaInvalida e)
					{
						Impressao.imprimirSenhaInvalida(e.getLogin());
					}
					catch (UsuarioBloqueado e)
					{
						Impressao.imprimirUsuarioBloqueado(e.getLogin());
					}
					break;
				}
			}
		}
    }
}