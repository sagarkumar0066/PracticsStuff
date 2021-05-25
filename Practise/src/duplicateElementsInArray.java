
import java.util.*;

public class duplicateElementsInArray {
	
	public static void main(String args[])
	{
		String a[] = {"sagar","akhil","sharath","akhil","ganesh","sagar"};
		
		duplicate(a);
	}

	 public static void duplicate(String a[])
	 {
		Set<String>s= new HashSet<>(); 
		
		for(String st : a)
		{
			if(s.add(st)==false)
			{
				System.out.println(st); //duplicate Strings..
			}
		}
	 }
}
