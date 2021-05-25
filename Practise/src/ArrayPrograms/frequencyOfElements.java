package ArrayPrograms;

import java.util.*;

public class frequencyOfElements {
	
	public static void main(String args[])
	{
		int ar[] = {1,2,8,3,2,2,2,5,1};
		frequency(ar);
	}

	public static void frequency(int a[])
	{
//		int f[] = new int[a.length];
//		int visited = -1;
//		
//				for(int i=0;i<a.length;i++)
//				{
//					int count = 1;
//					    for(int j=i+1;j<a.length;j++)
//						 {
//								 if(a[i]==a[j])
//								 {
//									 count++;
//									 f[j] = visited; 
//								 }
//						 }
//						 
//					  if(f[i] != visited)
//						   f[i] = count;
//				}
//		  
//		for(int k=0;k<a.length;k++)
//		{
//			if(f[k] != visited)
//			  System.out.println(a[k]+" : "+f[k]);
//		}
//		
//		System.out.println();
		// another way using map
		
		Map<Integer,Integer>map = new HashMap<>();
	
		  for(int i=0;i<a.length;i++)
		  {
			  if(map.containsKey(a[i]))
			  {
				  int count = map.get(a[i]);
			      map.put(a[i], count+1);
			  }
			  else
			  {
				  map.put(a[i], 1);
			  }
		  }
		  
		  for(Map.Entry<Integer,Integer> entry : map.entrySet())
		  {
			  System.out.println(entry.getKey()+" : "+entry.getValue());
		  }
	}
	
}




