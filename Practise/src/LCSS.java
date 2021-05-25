
public class LCSS {

	public static void main(String[] args) 
	{
       String s[] = {"Rosewood","Rose","Rosy","Rosberry","Roseyy"};
       find(s);
	}
    static void find(String s[])
    {
    	for(int i=0;i<s.length;i++)
    	{
    		if(i != s.length-1)
    		{
    			  //System.out.println(s[i]+" : "+s[i+1]);
    			 System.out.println(lcs(s[i].toCharArray(),s[i+1].toCharArray(),s[i].length(),s[i+1].length()));
    		}
    	}
    }
    static int lcs(char[] s1, char[] s2, int x, int y)
    {
    	
    	if(x == 0 || y==0)
    	{
    		return 0;
    	}
    	
    	  if(s1[x-1] == s2[y-1])
    	  {
    		return 1+lcs(s1,s2,x-1,y-1);
    	  }
    	  else
    	  {
    		  return Math.max(lcs(s1,s2,x-1,y), lcs(s1,s2,x,y-1));
    	  }
    }
}
