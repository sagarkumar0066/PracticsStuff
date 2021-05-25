
public class Odd_m_Even 
{
	 public static void main(String args[])
	  {
		  int a[] = {10,11,7,12,14};
		  System.out.print(ad(a));
	  }
	   static int ad(int ar[])
	   {
	         int e = 0;
			   int o = 0;
		   for(int i=0;i<ar.length;i++)
		   {
			 if(ar[i]%2==0)
			 {
				 e += ar[i];
				 //System.out.println("e "+e);
			 }
			 else if(ar[i]%2 != 0)
			 {
				 o += ar[i];
				 //System.out.println("o "+o);
			 }
		   }
		   return o-e; 
	   }
}
