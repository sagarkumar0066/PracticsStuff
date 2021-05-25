
public class fibonacciSeries {
	
	public static void main(String args[])
	{
		int num = 20;
		checkFeb(num);
	}
    public static void checkFeb(int num)
    {
    	int a=1,b=1;
    	System.out.print(a+" "+b);
    	int k =0;
    	
    	while(k<num)
    	{
    		k = a+b;
    		a= b;
    		b=k;
    		if(k<20)
    		   System.out.print(" "+k);
    	}
    	
    }
} 
