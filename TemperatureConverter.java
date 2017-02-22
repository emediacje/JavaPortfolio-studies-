public class TemperatureConverter {
	
public static void main(String[] args) {
		System.out.println("Podaj temperaturê (liczba ca³kowita): ");		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Boolean blad = false; 
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
	    	}

	    	catch (NumberFormatException e) 
	    	{
	    		blad = true;
	    		System.out.println("WprowadŸ liczbê ca³kowit¹!");
	    	}


		if (blad == false)
		{		

			int temp_C = n;
			double temp_F = 32 + ((9 * temp_C)/5);
			System.out.println("\nTemperatura: " + temp_C + " *C, " + temp_F + " *F");
		}
}
}