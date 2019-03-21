package classes;

import org.junit.Assert;
import org.junit.Test;

public class PalindromoTeste {
	
	@Test
	public void TestePositivo() {
		//arranjar
		String palavra = "Arara";
		
		//Agir
		Palindromo palindromo = new Palindromo();
		Boolean resultado = palindromo.isPalindromo(palavra);
		
		//afirmar
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void TesteNegativo() {
		//arranjar
		String palavra = "Heloísa";
		
		//Agir
		Palindromo palindromo = new Palindromo();
		Boolean resultado = palindromo.isPalindromo(palavra);
		
		//afirmar
		Assert.assertFalse(resultado);
		
	}
	
	@Test
	public void TesteExcecaoVazio() {
		//arranjar
		String palavra = null;
		
		//Agir
		Palindromo palindromo = new Palindromo();
		Boolean resultado = palindromo.isPalindromo(palavra);
		
	}

}
