package ArrayPrograms;

import java.util.*;
public class ArrayToList 
{
   public static void main(String args[])
   {
    Integer[] a = new Integer[] {99,66,33,44,55,22,11,77,88};
	List<Integer>list = Arrays.asList(a);
	
	  for(int k : list)
	  {
		  System.out.print(k+ "  ");
	  }
   }
}
