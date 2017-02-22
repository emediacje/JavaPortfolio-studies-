public class Fibonacci {
	
public static void main(String[] args) {

// ci¹g Fibonacciego
System.out.println("Tablica t1 - ci¹g Fibonacciego");
int[] t1 = new int[a];
		
t1[0] = 1;
System.out.print(t1[0]  + "\t");

if (a > 0)
{
	t1[1] = 1;
	System.out.print(t1[1]  + "\t");
}

for (int i = 2; ((a > 1) && (i < (t1.length))); i++)
{
	
	t1[i] = t1[i-1] + t1[i-2];
	System.out.print(t1[i] + "\t");
}

}
}