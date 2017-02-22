public class MiniCalculator {
	
public static void main(String[] args) {

System.out.print("podaj pierwsz¹ liczbê: ");
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
	    
System.out.println("wpisz rodzaj operacji (+ - : /): ");
BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
String operacja = br2.readLine();

System.out.println("podaj drug¹ liczbê: ");
BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
Boolean blad2 = false; 
int n2 = 0;
	    try {
	    	n2 = Integer.parseInt(br3.readLine());
	    }

	    catch (NumberFormatException e) 
	    {
	    	blad2 = true;
	    	System.out.println("WprowadŸ liczbê!");
	    }


	    if ((blad || blad2) == true)
	    	System.out.println("B³êdnie wprowadzone dane!");
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
	    	System.out.println("Mno¿enie, wynik: " + mnozenie);
	    	break;


	    case "/":
	    	if ((n == 0) || (n2 == 0))
	    	{
	    System.out.println("B³¹d: podaj liczby ró¿ne od zera!");
	    break;
	    	}
	    	else
	    	{
	    int dzielenie = n / n2;
	    System.out.println("Dzielenie, wynik: " + dzielenie);
	    	}

	    	break;

	
	    default:
	    	System.out.println("B³¹d lub nieobs³ugiwany znak arytmetyczny. ");

	    	}
}
}
}
