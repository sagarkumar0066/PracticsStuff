package ArrayPrograms;

public class ThirdLargestNumberInArray 
{
   public static void main(String args[])
   {
	   int a[] = {44,66,99,77,33,22,55};
	   System.out.print(third(a));
   }
   public static int third(int a[])
   {
	   int l = a.length;
          for(int i=0;i<a.length;i++)
          {
        	  for(int j=i+1;j<a.length;j++)
        	  {
        		  if(a[i]<a[j])
        		  {
        			  a[i] = a[i]+a[j]-(a[j]=a[i]);
        					  
        		  }
        	  }
          }
          
//          for(int k : a)
//            System.out.print(" "+k);
          return(a[2]);
      
   }
}
