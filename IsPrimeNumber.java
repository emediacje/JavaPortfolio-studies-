public class IsPrimeNumber {
	
public static void main(String[] args) {
System.out.print("\nPodaj liczb� ca�kowit�: ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());
boolean pierwsza = true;

if (n > 1) // liczba ca�kowita
{

	for (int i = 2; i*i <= n; i++)
	{
if (n % i  == 0)
	pierwsza = false;

	}

	if (pierwsza == true)
System.out.println("Liczba: " + n + " jest liczb� pierwsz�");
	else
System.out.println("Liczba: " + n + " NIE jest liczb� pierwsz�");


}
else
	System.out.println("B��d: nie wpisa�e� liczby ca�kowitej!");	
}
}