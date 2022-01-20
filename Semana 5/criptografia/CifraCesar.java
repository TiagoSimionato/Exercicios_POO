package criptografia;

public class CifraCesar implements Cifra
{
	private int nShifts;

	public CifraCesar(int nShifts)
	{
		this. nShifts = nShifts;
	}

	public String cifrar(String mensagem)
	{
		String msgCifrada = "";
		for (int i = 0; i < mensagem.length(); i++)
		{
			int posNovoChar = mensagem.charAt(i);

			if (posNovoChar != ' ')
			{
				posNovoChar += nShifts;

				if (posNovoChar > 'z')
				{
					posNovoChar = 'a' + (posNovoChar - 'z') - 1;
				}
				else if (posNovoChar < 'a')
				{
					posNovoChar = 'z' - ('a' - posNovoChar) + 1;
				}

				
			}

			char novoChar = (char) posNovoChar;
			msgCifrada = msgCifrada.concat(String.valueOf(novoChar));
		}
		return msgCifrada;
	}

	public String decifrar(String mensagem)
	{
		String msgDecifrada = "";
		for (int i = 0; i < mensagem.length(); i++)
		{
			int posNovoChar = mensagem.charAt(i);
			
			if (posNovoChar != ' ')
			{
				posNovoChar -= nShifts;

				if (posNovoChar > 'z')
				{
					posNovoChar = 'a' + (posNovoChar - 'z') - 1;
				}
				else if (posNovoChar < 'a')
				{
					posNovoChar = 'z' - ('a' - posNovoChar) + 1;
				}
			}
			char novoChar = (char) posNovoChar;
			msgDecifrada = msgDecifrada.concat(String.valueOf(novoChar));
		}

		return msgDecifrada;
	}
}