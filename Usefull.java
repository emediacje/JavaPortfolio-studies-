public class Usefull {
	
public static void main(String[] args) {

//A) Losuj liczby

Random r = new Random();
t2[i] = r.nextInt(9)+1;

//B) Znaki specjalne
// \n
// \t

// c) Zamiana znakow
napis = "Rezultat: ";
plainText = plainText.replace("e", "1");
StringBuffer wynik = new StringBuffer(napis);
wynik.append(plainText);
System.out.println(wynik);

// Pobierz liczbê od usera

   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // pobranie zmiennej CIN

   Boolean blad = false; 
		
   try {
      a = Integer.parseInt(br.readLine());  				// pobranie zmiennej br jako INT
   }	

   catch (NumberFormatException e)   					// b³¹d, nie wprowadzono liczby
   {
      blad = true;
      System.out.println("WprowadŸ liczbê!");
   }
		

   if (blad == false) // liczba ca³kowita
   {
   }
}
}