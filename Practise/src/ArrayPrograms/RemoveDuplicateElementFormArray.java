package ArrayPrograms;

import java.util.*;

public class RemoveDuplicateElementFormArray {

	public static void main(String[] args) 
	{
		Integer a[] = new Integer[]{99,66,99,77,88,55,44,33,22,11,77,55,33};
		removeDL(a);
		System.out.println();
		//next(a);
		
	}
	public static void removeDL(Integer a[])
	{
		int ar[] = new int[a.length];
		Set<Integer>set = new HashSet<Integer>();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(set.add(a[i])==true)
//			{
//				ar[i] = a[i];
//			}
//		}
		
		
		int in = 0;
		 for(int i : a)
		 {
			if(set.add(i)==true)
			{
				ar[in] = i;
				in++;
			}
		 }
		
		for(int k : ar)
		{
			if(k!=0)
			 System.out.print(" "+k);
		}
	}
	public static void next(int a[])
	{
		
		Map<Integer,Integer> map = new HashMap<>();
		int count =1;
		
		for(int i : a)
		{
			if(map.containsKey(i))
			{
				count = map.get(i);
				map.put(i,count+1);
			}
			else
			{
			 map.put(i,count);
			}
		}
		
		for(Map.Entry<Integer,Integer> k : map.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue());
			
		}
	}

}
