package classes;

import interfaces.IPalindromo;

public class Palindromo implements IPalindromo {

	@Override
	public Boolean isPalindromo(String pPalindromo) {
		// TODO Auto-generated method stub
		try {
			pPalindromo.trim();
			pPalindromo.replace(" ", "");
			StringBuilder builder = new StringBuilder(pPalindromo);
			String palavraAoContrario = builder.reverse().toString();
		    return pPalindromo.equalsIgnoreCase(palavraAoContrario);
		    
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
