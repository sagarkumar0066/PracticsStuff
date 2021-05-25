
public class ArmStrongNumber {

	public static void main(String[] args) 
	{
       int num = 371;
       check(num);
	}
	public static void check(int num)
	{
		int r,sum=0;int on = num;
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			sum = sum + (r*r*r);
		}
		if(sum==on)
		{
			System.out.print("Given number is armstrong number");
		}
		else
		{
			System.out.print("Given number is not armstrong number");
		}
	}

}
