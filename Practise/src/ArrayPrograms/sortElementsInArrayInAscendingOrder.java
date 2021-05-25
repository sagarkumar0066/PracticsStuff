package ArrayPrograms;

public class sortElementsInArrayInAscendingOrder {

	public static void main(String[] args) {
		int a[] = {54,89,14,10,15,69,74,23,250,228};
		asc(a);
		System.out.println();
		des(a);
	}
     public static void asc(int a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 for(int j=i+1;j<a.length;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    			     a[j]=  a[i]+a[j]-(a[i]=a[j]);
    			 }
    		 }
    	 }
    	 
    	 for(int i : a)
    	 {
    		 System.out.print(" "+i);
    	 }
     }
     public static void des(int a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 for(int j=i+1;j<a.length;j++)
    		 {
    			 if(a[i]<a[j])
    			 {
    				 a[j] = a[i]+a[j]-(a[i]=a[j]);
    			 }
    		 }
    	 }
    	 for(int k : a)
    	 {
    		 System.out.print(" "+k);
    	 }
     }
}
