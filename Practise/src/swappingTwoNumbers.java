
public class swappingTwoNumbers {
	
	public static void main(String args[])
	{
		int a = 5;
		int b = 6;
		
		swapnumbers(a,b);
		swaptwo(a,b);
	}
    public static void swapnumbers(int a,int b)
    {
    	a = a+b;
    	b = a-b;
    	a = a - b;
    	
    	System.out.println(a+" "+b);
    }
    public static void swaptwo(int a,int b)
    {
    	b =  a+b-(a=b);
    	System.out.println(a+" "+b);
    }
}
