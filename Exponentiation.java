public class Exponentiation {
	
public static void main(String[] args) {
// system potêguje od 0 - a¿ do podniesienia liczby 2 do ¿¹danej potêgi
// a^0 = 1    -   potêga 0" zawsze wynosi 1


System.out.print("Podaj liczbê ca³kowit¹ dodatni¹: ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Boolean blad = false; 
int n = 0;

try {
	    n = Integer.parseInt(br.readLine());
	    	}

	    	catch (NumberFormatException e) 
	    	{
	    blad = true;
	    System.out.println("WprowadŸ liczbê!");
	    	}

String cache = "";
int liczbap = 2;
int liczba = 2;
int potega = 0;
// Od autora: zdajê sobiê sprawê, ¿e mog³em to zrobiæ prosciej poprzez metodê Math, lecz chcia³em przetestowaæ potêgowanie w taki sposób

if ((blad == false) && (n >= 0)) // liczba ca³kowita dodatnia
{
	for (int i = 0; ((liczba * liczbap) <= n); i++)
	{
switch (i)
{	
	case 0: // zawsze ta potêga jest równa jeden
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
System.out.println("Liczba: " + liczbap + " zosta³a podniesiona do potêgi: " + potega);

}
else
	System.out.println("Wpisz liczbê wiêksz¹ od zera");

}
}
