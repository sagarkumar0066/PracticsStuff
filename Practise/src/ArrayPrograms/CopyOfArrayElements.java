package ArrayPrograms;

public class CopyOfArrayElements {
	
	public static void main(String...args)
	{
		int a[] = {5,8,9,7,2,3,4};
		int ar[] = new int[a.length];
		copy(a,ar);
	}
    public static void copy(int a[],int ar[])
    {	
    	for(int i =0;i<a.length;i++)
    	{
    		ar[i] = a[i]; 
    	}
    	
    	for(int i : a)
    	{
    		System.out.print(i+" ");
    	}
    	
    	System.out.print("\n");
    	
    	for(int i : ar)
    	{
    		System.out.print(i+" ");
    	}
    	
    	
//    	System.out.print("\n");
//    	
//    	int arr[] = a.clone();
//    	
//    	for(int i : arr)
//    	{
//    		System.out.print(i+" ");
//    	}
    }

}
