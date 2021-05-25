package ArrayPrograms;

public class OddAndEvenNumbersFromArray 
{
   public static void main(String args[])
   {
	   int a[] = {5,7,12,13,6,8,17,22,23,27,30};
	   odd(a);
	   System.out.println();
	   even(a);
   }
   public static void odd(int a[])
   {
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2 != 0)
		   {			   System.out.print(" "+a[i]);
		   }
	   }
   }
   public static void even(int a[])
   {
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2 == 0)
		   {
			   System.out.print(" "+a[i]);
		   }
	   }
   }
}
