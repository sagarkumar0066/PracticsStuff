
public class palindrome {
   public static void main(String args[])
   {
	  int num = 1234321;
	  System.out.println(checkPalindrome(num));
   }
   public static boolean checkPalindrome(int num)
   {
	   int r;
	   int sum=0;
	   int onum = num;
	   
	   while(num>0)
	   {
		   r = num%10;
		   num = num/10;
		   sum = sum*10+r;
	   }
	   
	   if(sum==onum)
		   return true;
	   
	   return false;
   }
}
