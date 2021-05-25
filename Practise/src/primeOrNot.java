
public class primeOrNot {
	
	public static void main(String args[])
	{
		int i = 5;
		check(i);
	}
    public static void check(int num)
    {
    	for(int i=2;i<num;i++)
    	{
            if(num%i==0)
            {
            	System.out.println("Given number is not prime");
                break;
            }
            else
            {
            	System.out.println("Given number is prime");
            	break;
            }
            
    	}
    }
}
