package ArrayPrograms;

public class largestElementInArray {

	public static void main(String[] args) 
	{
        int a[] = {25,11,7,75,56};
        LargestNumber(a);
	}
    public static void LargestNumber(int a[])
    {
    	int max = 0;
    	for(int i : a)
    	{
    		max = Math.max(max, i);
    	}
    	
    	System.out.print(max);
    }
}
