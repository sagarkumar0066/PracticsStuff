
public class sqrt 
{
  public static void main(String args[])
  {
	  int[] a= {25,8,251,42,6,90,3,7,16,21};
	  System.out.print(count(a));
  }
  static int count(int[] a)
  {
	  int c=0;
	  
	  for(int i=0;i<a.length;i++)
	  {
		  double r = Math.sqrt(a[i]);
	       if(r-Math.floor(r)==0)
	       {
	    	   c++;
	       }
	  }
	  return c;
  }
}
