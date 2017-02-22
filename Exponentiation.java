public class Exponentiation {
	
public static void main(String[] args) {
// system pot�guje od 0 - a� do podniesienia liczby 2 do ��danej pot�gi
// a^0 = 1    -   pot�ga 0" zawsze wynosi 1


System.out.print("Podaj liczb� ca�kowit� dodatni�: ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Boolean blad = false; 
int n = 0;

try {
	    n = Integer.parseInt(br.readLine());
	    	}

	    	catch (NumberFormatException e) 
	    	{
	    blad = true;
	    System.out.println("Wprowad� liczb�!");
	    	}

String cache = "";
int liczbap = 2;
int liczba = 2;
int potega = 0;
// Od autora: zdaj� sobi� spraw�, �e mog�em to zrobi� prosciej poprzez metod� Math, lecz chcia�em przetestowa� pot�gowanie w taki spos�b

if ((blad == false) && (n >= 0)) // liczba ca�kowita dodatnia
{
	for (int i = 0; ((liczba * liczbap) <= n); i++)
	{
switch (i)
{	
	case 0: // zawsze ta pot�ga jest r�wna jeden
	liczba = 1;
	break;

	case 1:
	liczba = liczbap;
	break;
	
	default:
	{
	liczba = liczba * liczbap;

	}

}

	cache = cache + liczba + ", ";
	potega = i;
	}

System.out.println("Wynik operacji: " + cache);
System.out.println("Liczba: " + liczbap + " zosta�a podniesiona do pot�gi: " + potega);

}
else
	System.out.println("Wpisz liczb� wi�ksz� od zera");

}
}
