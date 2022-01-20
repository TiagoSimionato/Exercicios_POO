public class Main
{
	public static void main(String[] args)
	{
		char[] charVet = new char[4];
		charVet[0] = 'a';
		charVet[1] = 'b';
		charVet[2] = 'c';
		charVet[3] = 'd';
		Tabuleiro tab = new Tabuleiro(2, 2, charVet);
		PalavraEncontrada palavra = tab.buscar("b");
	}
}