
public class removeWhiteSpacesFromString {
	public static void main(String args[])
	{
	    String s = "Hello world I am here";
	    System.out.println(removeSpaces(s));
	    //remove(s);
	}
     public static String removeSpaces(String s)
     {
    	 StringBuilder sb = new StringBuilder();
    	 char[] c = s.toCharArray();
    	 
		    	 for(int i=0;i<s.length();i++)
		    	 {
		    		 char ch = s.charAt(i);
		    		 if(ch == ' ')
		    		 {
		    			sb.append(""); 
		    		 }
		    		 else
		    		 {
		    			 sb.append(c[i]);
		    		 }
		    		 
		    		
		    	 }
		    	 return sb.toString();
     }
     public static void remove(String s)
     {
    	 s = s.replace(" ", "");
    	 System.out.println(s);
     }
}
