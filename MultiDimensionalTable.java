public class MultiDimensionalTable {
	
public static void main(String[] args) {
//1) Tabela jednowymiarowa:

int[] t1 = new int[a];
t1[0] = 1;

for (int i = 0; i < t1.length; i++)
{
   System.out.print(t1[i] + "\t"); // element tabeli + tabulacja
   System.out.println(t1[i]); // element tabeli + nowa linia
}


//2) Wieowymiarowa:

int[][] t2d = new int[a][a];

for (int i = 0; i < a; i++)
{
   for (int j = 0; j < a; j++)
   {
      System.out.print(t2d[i][j]);
   }
}


//i [wiersze] [kolumny]

//[0 0] [0 1] [0 2] 
//[1 0] [1 1] [1 2]
//[2 0] [2 1] [2 2] 

}
}