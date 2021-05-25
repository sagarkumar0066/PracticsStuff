package ArrayPrograms;

public class sumOfAllElements {

	public static void main(String[] args) 
	{
		int sum = 0;
		int a[] = {25,11,7,75,56};
		
		for(int i : a)
		{
			sum+=i;
		}

		 System.out.print(sum);
	}

}
