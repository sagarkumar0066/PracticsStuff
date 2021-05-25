import java.util.*;
public class Myntra 
{
    public static void main(String args[])
    {
    	List<Clothes>list = new ArrayList<>();
    	
    	list.add(new Clothes(599,999,499));
    	list.add(new Clothes(1099,1999,799));
    	list.add(new Clothes(899,1599,699));
    	list.add(new Clothes(699,899,399));
    	list.add(new Clothes(299,699,199));
    	
    	//Comparator<Clothes> com = (o1,o2) -> {return o1.getShirts()>o2.getShirts()?1:-1;};
    	
    	Collections.sort(list, (o1,o2) -> {return o1.getShorts()>o2.getShorts() ?1:-1;});	
    	for(Clothes c : list) System.out.println(c);
    	
    	System.out.print("\n");
    	
    	Collections.sort(list, (o1,o2) -> {return o1.getShirts()>o2.getShirts() ?1:-1;});	
    	for(Clothes c : list) System.out.println(c);
    	
    	System.out.print("\n");
    	
    	Collections.sort(list, (o1,o2) -> {return o1.getPants()>o2.getPants() ?1:-1;});	
    	for(Clothes c : list) System.out.println(c);
    }
	
}
