public class MiniCalculator {
	
public static void main(String[] args) {

System.out.print("podaj pierwsz� liczb�: ");
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
	    
System.out.println("wpisz rodzaj operacji (+ - : /): ");
BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
String operacja = br2.readLine();

System.out.println("podaj drug� liczb�: ");
BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
Boolean blad2 = false; 
int n2 = 0;
	    try {
	    	n2 = Integer.parseInt(br3.readLine());
	    }

	    catch (NumberFormatException e) 
	    {
	    	blad2 = true;
	    	System.out.println("Wprowad� liczb�!");
	    }


	    if ((blad || blad2) == true)
	    	System.out.println("B��dnie wprowadzone dane!");
	    	else
	    	{
	    

	    System.out.println("Wynik operacji: " + n + " " + operacja + " " + n2);


	    switch(operacja)
	    {
	    case "+":
	    	int dodawanie = n + n2;
	    	System.out.println("Dodawanie, wynik: " + dodawanie);
	    	break;

	    case "-":
	    	int odejmowanie = n - n2;
	    	System.out.println("Odejmowanie, wynik: " + odejmowanie);
	    	break;


	    case "*":
	    	int mnozenie = n * n2;
	    	System.out.println("Mno�enie, wynik: " + mnozenie);
	    	break;


	    case "/":
	    	if ((n == 0) || (n2 == 0))
	    	{
	    System.out.println("B��d: podaj liczby r�ne od zera!");
	    break;
	    	}
	    	else
	    	{
	    int dzielenie = n / n2;
	    System.out.println("Dzielenie, wynik: " + dzielenie);
	    	}

	    	break;

	
	    default:
	    	System.out.println("B��d lub nieobs�ugiwany znak arytmetyczny. ");

	    	}
}
}
}
