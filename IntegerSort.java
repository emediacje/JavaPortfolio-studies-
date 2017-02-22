public class IntegerSort {
	
public static void main(String[] args) {
		int[] tablica = new int[4];
		tablica[0] = 9;
		tablica[1] = 5;
		tablica[2] = 2;
		tablica[3] = 1;
		
		for(int i = 0; i < tablica.length; i++)
		{
        		System.out.print(tablica[i] + " ");
		}
		
		for(int j = 0; j < tablica.length; j++)
		{
			for(int k = 0; k < tablica.length-1; k++)
			{
				boolean p = false;
				if (tablica[k] > tablica[k+1])
				{
					int temp = tablica[k];
					tablica[k] = tablica[k+1];
					tablica[k+1] = temp;
					p = true;
				}
				
				if (p == false)
				{
					break;
				}
			}

	
		}
	
		System.out.print("\n Tablica znaków po sortowaniu: ");

		for(int i = 0; i < tablica.length; i++)
		{
        		System.out.print(tablica[i] + " ");
		}
}
}