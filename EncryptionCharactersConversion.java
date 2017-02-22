public class EncryptionCharactersConversion {
	
public static void main(String[] args) {
		String plainText = "kolek";
		String napis = "Zaszyfrowany tekst to: ";
 
		plainText = plainText.replace("k", "3");
		plainText = plainText.replace("o", "w");
		plainText = plainText.replace("l", "p");
		plainText = plainText.replace("e", "1");
 
		StringBuffer wynik = new StringBuffer(napis);
		wynik.append(plainText);
 
		System.out.println(wynik);
}
}