
public class Big_m_Small 
{
	public static void main(String args[])
	  {
		  int a[] = {10,11,7,12,14};
		  System.out.print(ad(a));
	  }
	   static int ad(int ar[])
	   {
		   int l=0,s=100;
//	         int l = ar[0];
//			   int s = ar[0];
		   for(int i : ar)
		   {
			   l = Math.max(l, i);
			   System.out.println("Max : "+l);
			   s = Math.min(s, i);
			   System.out.println("Min : "+s);
//			  if(l<i)
//				  l = i;
//			  if(s>i)
//				  s=i;
		   }
		  // System.out.print(l+" "+s);
		   return l-s; 
	   }
}
