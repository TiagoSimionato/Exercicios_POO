class SelectionSort {

	public static void selectionSort(int[] v)
	{
		for (int i = 0; i < v.length; i++)
		{
			int smallest = i;

			for (int j = i; j < v.length; j++)
			{
				if (v[smallest] > v[j])
					smallest = j;
			}

			if (smallest != i)
			{
				int tmp = v[smallest];
				v[smallest] = v[i];
				v[i] = tmp;
			}
		}


	}

	public static void main(String[] args)
	{
		int[] vetor;
		vetor = new int[10];
		vetor[0] = 59;
		vetor[1] = 41;
		vetor[2] = 26;
		vetor[3] = 8;
		vetor[4] = 5;
		vetor[5] = 12;
		vetor[6] = 891;
		vetor[7] = 73;
		vetor[8] = 64;
		vetor[9] = 30;
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.print("[" + vetor[i] + "] ");
		}
		System.out.println();
		selectionSort(vetor);
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.print("[" + vetor[i] + "] ");
		}
		System.out.println();
	}
}