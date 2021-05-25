
import java.util.*;

public class sortArray {
     public static void main(String args[])
     {
    	int a[] = {5,7,2,1,3,9};
    	//sortArr(a);
    	
    	//or else
    	int ar[] = Arrays.stream(a).sorted().toArray();
    	
    	
//    	Arrays.sort(a);
//    	
    	for(int k: ar)
    	{
    		System.out.print(k+" ");
    	}
    	
     }
     public static void sortArr(int a[])
     {
    	 int temp =0;
		    	for(int i=0;i<a.length;i++) 
		    	{ 
			    		for(int j=i+1;j<a.length;j++)
			    		{
				    			if(a[i]>a[j])
				    			{
				    			   a[j]= a[i]+a[j] -(a[i]=a[j]);	
				    			}
			    		}
		    	 }
	    	for(int k : a)
			{
				System.out.print(" "+k);
			}
     }
}
