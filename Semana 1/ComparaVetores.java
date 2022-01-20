import java.util.Scanner;

class ComparaVetores
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();

		int[] a, b;
		a = new int[n];
		b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = leitor.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = leitor.nextInt();

		double fator1 = (double) a[0] / (double) b[0];
		double fator2 = (double) b[0] / (double) a[0];
		byte primeiroCaso = 1, segundoCaso = 1;

		for (int i = 0; i < n; i++)
		{
			if((double) a[i] / (double)b[i] != fator1)
				primeiroCaso = 0;
		}
		for (int i = 0; i < n; i++)
		{
			if((double) b[i] / (double) a[i] != fator2)
				segundoCaso = 0;
		}

		System.out.println("primeiroCaso: " + primeiroCaso);
		System.out.println("segundoCaso: " + segundoCaso);
		if (primeiroCaso == 1 || segundoCaso == 1)
			System.out.println("SIM");
		else
			System.out.println("NAO");
	}
}