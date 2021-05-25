package ArrayPrograms;

public class printElementsOnEvenPosition {
     public static void main(String args[])
     {
    	 int a[] = {1,2,3,4,5,6,7,8,9,10};
    	 evenPosition(a);
     }
     public static void evenPosition(int a[])
     {
    	 int l = a.length;
    	 for(int i=0;i<l;i++)
    	 {
    		 if(i%2!=0)
    		 {
    			 System.out.print(" "+a[i]);
    		 }
    	 }
     }
}
