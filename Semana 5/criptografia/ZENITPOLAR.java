package criptografia;

public class ZenitPolar implements Cifra
{
	public ZenitPolar()
	{
		
	}

	public String cifrar(String mensagem)
	{
		String msgCifrada = "";
		for (int i = 0; i < mensagem.length(); i++)
		{
			char proximaLetra = mensagem.charAt(i);

			if (proximaLetra == 'z')
			{
				proximaLetra = 'p';
			}
			else if (proximaLetra == 'e')
			{
				proximaLetra = 'o';
			}
			else if (proximaLetra == 'n')
			{
				proximaLetra = 'l';
			}
			else if (proximaLetra == 'i')
			{
				proximaLetra = 'a';
			}
			else if (proximaLetra == 't')
			{
				proximaLetra = 'r';
			}
			else if (proximaLetra == 'p')
			{
				proximaLetra = 'z';
			}
			else if (proximaLetra == 'o')
			{
				proximaLetra = 'e';
			}
			else if (proximaLetra == 'l')
			{
				proximaLetra = 'n';
			}
			else if (proximaLetra == 'a')
			{
				proximaLetra = 'i';
			}
			else if (proximaLetra == 'r')
			{
				proximaLetra = 't';
			}

			msgCifrada = msgCifrada.concat(String.valueOf(proximaLetra));
		}
		return msgCifrada;
	}

	public String decifrar(String mensagem)
	{
		return cifrar(mensagem);
	}
}