
public class factorialOfAnInteger {
	
	public static void main(String args[])
	{
		long num = 5;
		System.out.print(fact(num));
	}
   public static long fact(long num)
   {
	  if(num==1)
		  return 1;
	  else
	    return num*fact(num-1);
   }
}
