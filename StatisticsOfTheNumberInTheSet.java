public class StatisticsOfTheNumberInTheSet {
	
public static void main(String[] args) {

Random r = new Random();

int[] tablica = new int[20];
int[] tablica_licz = new int[10];

for (int j = 0; j < tablica_licz.length; j++)
{
	tablica_licz[j] = 0;
}

int temp;

for (int i = 0; i < tablica.length; i++)
{
	temp = r.nextInt(10)+1;
	tablica[i] = temp;
}
	
int temp_k = 0;
for (int k = 0; k < tablica.length; k++)
{
	if ((tablica[k] > 0) && (tablica[k] < 11))
	temp_k = tablica[k];
	tablica_licz[temp_k-1] += 1; 
}

System.out.println("Tablica znaków: "); // losowa tablica
for(int i = 0; i < tablica.length; i++)
{
        	System.out.print(tablica[i] + " ");
}

System.out.println("\n");
System.out.println("Podsumowanie znaków:"); // podsumowanie

for(int l = 0; l < tablica_licz.length; l++)
{
        	System.out.print((l+1) + " - ");
        	System.out.print(tablica_licz[l] + " \n");
}
}
}