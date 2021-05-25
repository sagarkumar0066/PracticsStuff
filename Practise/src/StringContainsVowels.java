
import java.util.*;

public class StringContainsVowels {
	
	public static void main(String...args)
	{
		String st = "SagarE";
		
         System.out.println(stringContains(st));
         Vowelscount(st);
	}

	public static boolean stringContains(String s)
	{
		  return	s.toLowerCase().matches(".*[aeiou].*")?true:false;
	}
	public static void Vowelscount(String s)
	{
		List<Character>vowels = new ArrayList<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u'));
		
		 for(int i=0;i<s.length();i++)
		 {
			 char c = s.charAt(i);
			 if(vowels.contains(c)) 
			 {
				 System.out.println(c+" "+"contains vowel");
			 }
			 
		 }
	}
}
