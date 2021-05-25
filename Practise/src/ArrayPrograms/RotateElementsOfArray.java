package ArrayPrograms;

public class RotateElementsOfArray {

	public static void main(String[] args) 
	{
       int a[] = {1,2,3,4,5};
       rotate(a);
	}
	public static void rotate(int a[])
	{
		for(int j=0;j<2;j++)
		{
			int i,first;
			first = a[0];
				   for(i=0;i<a.length-1;i++)
					{
						a[i] = a[i+1];
					}
				a[i] = first;
		}
		
		for(int j : a)
		{
			System.out.print(" "+j);
		}
	}
}
