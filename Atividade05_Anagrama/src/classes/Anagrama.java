package classes;

import java.util.Arrays;

import interfaces.IAnagrama;

public class Anagrama implements IAnagrama {

	@Override
	public Boolean isAnagrama(String strUm, String strDois) {
		// TODO Auto-generated method stub
		try {
			strUm.trim();
			strUm.replace(" ", "");
			strDois.trim();
			strDois.replace(" ", "");
			
			if (strUm.length() != strDois.length()){
				return false;
			}
			
			strUm = strUm.toLowerCase();
			strDois = strDois.toLowerCase();
			
			char[] c1 = strUm.toCharArray();
			char[] c2 = strDois.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			String sc1 = new String(c1);
			String sc2 = new String(c2);
			return sc1.equals(sc2);
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	 }
}

