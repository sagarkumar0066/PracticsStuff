
public class patterns {

	 public static void main(String args[])
	 {
		 //one();
		 //two();
	     //three();
		 //four();
		 //five();
		 six();
	 }
	 
	 public static void one()
	 {
		 for(int i=1;i<=8;i++)
		 {
			 for(int j=1;j<i;j++)
			 {
				 System.out.print(" "+j);
			 }
			 System.out.print("\n");
		 }
	 }
	 public static void two()
	 {
		 int k=1;
		 for(int i=0;i<=7;i++)
		 {
			 for(int j=0;j<i;j++)
			 {
				 System.out.print(" "+k++);
			 }
			 System.out.print("\n");
		 }
	 }
	 public static void three()
	 {
		 int n = 8;
		for(int i=0;i<n;i++)
		{
			int number =1;
			System.out.printf("%" + (n - i) * 2 + "s","");  
			
			for (int j = 0; j <= i; j++)   
			{  
			System.out.printf("%4d", number);  
			number = number * (i - j) / (j + 1);  
			}  
			System.out.println();
		}
	 }
	 public static void four()
	 {
		 
		for(int i=8;i>0;i--)
		{
			for(int j=8;j>i;j--)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	 }
	 public static void five()
	 {
		 for(int i=1;i<=8;i++)
			{
				for(int j=i;j>0;j--)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			} 
	 }
	 public static void six()
	 {
		 int num;
		 for(int i=1;i<=9;i++)
			{
			  if(i%2==0)
			  {
					num=0;
					for(int j=1;j<=9;j++)	
					{
						System.out.print(num);
						num = (num==0)?1:0;
					}
				
			  }
			  else
			  {
				  num=1;
				  for(int j=1;j<=9;j++)	
					{
						System.out.print(num);
						num = (num==1)?0:1;
					}
			  }
				
				System.out.println();
			} 
	 }
}
