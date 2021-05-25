
public class StringSortOfArray {
	
	public static void main(String args[])
	{
		String a[] = {"sagar","akhil","sharath","jagadhish","deepak","ganesh","aravind"};
		stringSort(a);
	}
      public static void stringSort(String a[])
      {
    	  String temp="";
    	  for(int i=0;i<a.length;i++)
    	  {
    		  for(int j=0;j<a.length;j++)
    		  {
    			  if(a[i].compareTo(a[j])<0)
    			  {
    				 temp = a[i];
    				 a[i]=a[j];
    				 a[j]=temp;
    			  }
    		  }
    	  }
    	  
    	  for(String st : a)
    	  {
    		  System.out.print(st+" ");
    	  }
      }
}
