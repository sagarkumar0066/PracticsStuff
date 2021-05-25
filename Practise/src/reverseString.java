
public class reverseString {

	  public static void main(String args[])
	  {
		  String s = "Sagar";
		  stringReverse(s);
		  stringReverse2(s);
	  }
	  
	  public static void stringReverse(String s)
	  {
		  StringBuilder sb = new StringBuilder(s);
		 // StringBuilder sbb = sb.reverse();
		  
		  System.out.println(sb.reverse().toString());
	  }
	  public static void stringReverse2(String s)
	  {
		  char[] chars = s.toCharArray();
		  StringBuilder sb= new StringBuilder();
		  
		  for(int i = chars.length-1;i>=0;i--)
		  {
			  sb.append(chars[i]);
		  }
		  System.out.println(sb.toString());
	  }
}
