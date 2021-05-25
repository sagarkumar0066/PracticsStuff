
import java.util.*;

public class checkListOfIntgersOddNumbers {
	
	public static void main(String args[])
	{
		List<Integer> il = new ArrayList<>(Arrays.asList(3,5,7,9,10,11,13));
		
		System.out.println(checkList(il));
	}

	public static boolean checkList(List<Integer>l)
	{
		for(int i : l)
		{
			if(i%2==0)
				
				return false;
				
		}	
		
		return true;
				
//			if(i%2==0)
//			{
//				System.out.println("List does not contains only odd numbers");
//			}
//			else
//			{
//				System.out.println("List contains only odd numbers");
//			}
		
	}
}
