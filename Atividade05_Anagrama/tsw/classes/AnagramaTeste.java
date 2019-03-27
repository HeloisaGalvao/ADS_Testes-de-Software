package classes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class AnagramaTeste {

	@Test
	public void TestePositivoPalavra() {
		
		String strUm = "Amor";
		String strDois = "Roma";
		
		Anagrama anagrama = new Anagrama();
		Boolean result = anagrama.isAnagrama(strUm, strDois);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void TestePositivoDuasPalavras() {
		
		String strUm = "Amor tsa";
		String strDois = "Roma sta";
		
		Anagrama anagrama = new Anagrama();
		Boolean result = anagrama.isAnagrama(strUm, strDois);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void TesteNegativoTamanho() {
		
		String strUm = "ato";
		String strDois = "topa";
		
		Anagrama anagrama = new Anagrama();
		Boolean result = anagrama.isAnagrama(strUm, strDois);
		
		Assert.assertFalse(result);
	}
	
	@Test
	public void TesteNegativo() {
		
		String strUm = "ato";
		String strDois = "opa";
		
		Anagrama anagrama = new Anagrama();
		Boolean result = anagrama.isAnagrama(strUm, strDois);
		
		Assert.assertFalse(result);
	}

	@Test
	public void TesteNegativoDuasPalavras() {
		
		String strUm = "casa dela";
		String strDois = "toca dele";
		
		Anagrama anagrama = new Anagrama();
		Boolean result = anagrama.isAnagrama(strUm, strDois);
		
		Assert.assertFalse(result);
	}
	
	@Test 
	public void TesteExcessao() {
		
		String strUm = null;
		String strDois = null;
		
		Anagrama anagrama = new Anagrama();
		anagrama.isAnagrama(strUm, strDois);
	}
}
