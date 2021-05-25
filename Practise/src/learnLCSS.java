
public class learnLCSS 
{

	public static void main(String[] args) 
	{
		String s[] = {"Rosewood","oseR","Rosy","Rosberry","Roseyy"};
		String stem = findsem(s);
		System.out.println(stem);
	}
   static String findsem(String a[])
   {
	    String res ="";
	    int al = a.length;
	    
	    String demo = a[0];
	    int dl = demo.length();
	    
	    for(int i=0;i<dl;i++)
	    {
	    	for(int j=i+1;j<=dl;j++)
	    	{
	    		String crs = demo.substring(i,j);
	    		
	    		int k=1;
	    		for(k=1;k<al;k++)
	    		{
	    			if(!a[k].contains(crs))
	    				break;
	    		}
	    		
	    		if(k==al && res.length()<crs.length())
	    			res = crs;
	    	}
	    }
	    
	    
	    return res;
   }
}
