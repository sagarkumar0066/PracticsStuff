
import java.util.Arrays;

public class PreAndPostIncrement 
{
   public static void main(String args[])
   {
	   int[] i = {5,1,8,4,5,6,1,2,7,9,3,0,7,6,6};
	 int a =10;
	 preIncrement(a);
	 postIncrement(a);
	 string(i);
   }
   static void preIncrement(int a)
   {
	   a++;
     System.out.println(a++);
   }
   static void postIncrement(int a)
   {
	   ++a;
     System.out.println(++a);
   }
   
   static void string(int[] i)
   {
	   int[] a = Arrays.stream(i).sorted().distinct().toArray();
	   
	   for(int k : a)
		   System.out.print(k+" ");
   }
}
