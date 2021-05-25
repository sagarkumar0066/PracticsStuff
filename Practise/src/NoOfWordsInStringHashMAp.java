import java.util.HashMap;
import java.util.Map;

public class NoOfWordsInStringHashMAp 
{
	public static void main(String[] args) 
	{
		String s = "Fuck the world until you get fucked by someone else, you understand..";
		WordsCount(s);
	}
	
	 public static void WordsCount(String s)
	 {
		 int w = 0;
		 Map<String,Integer> map = new HashMap<>();
		 String[] sString = s.split(" ");
		 
		 for(String st : sString)
		 {
			 if(map.containsKey(st))
			 {
				 int count = map.get(st);
				 map.put(st,count+1);
				 w++;
			 }
			 else
			 {
				 map.put(st, 1);
				 w++;
			 }
		 }
		 
		 for(Map.Entry<String,Integer>entry : map.entrySet())
		 {
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 
//		 for(String keys : map.keySet())
//		 {
//			 System.out.println(keys +" "+map.get(keys));
//		 }
		 
		 System.out.println("no of words : "+w);
		 
	 }
}
