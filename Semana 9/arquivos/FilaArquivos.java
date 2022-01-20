package arquivos;

import java.util.ArrayList;

public class FilaArquivos<T> implements Fila<T>
{
	private ArrayList<T> arquivos;
	private int qtdArquivos;

	public FilaArquivos(int n)
	{
		arquivos = new ArrayList<T>(n);
		qtdArquivos = n;
	}

	public boolean enfileirar(T arquivo)
	{
		if (qtdArquivos == arquivos.size())
			return false;
		
		arquivos.add(arquivo);
		return true;
	} 

	public T desenfileirar()
	{
		if (arquivos.size() == 0)
			return null;

		T retirado = arquivos.remove(0);
		return retirado;
	}
}