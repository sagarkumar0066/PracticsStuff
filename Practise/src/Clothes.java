
public class Clothes //implements Comparable<Clothes>
{
   private int shirts;
   private int pants;
   private int shorts;
    public Clothes(int shirts, int pants, int shorts)
    {
	    this.shirts = shirts;
	    this.pants = pants;
	    this.shorts = shorts;
    }
	public int getShirts() {
		return shirts;
	}
	public void setShirts(int shirts) {
		this.shirts = shirts;
	}
	public int getPants() {
		return pants;
	}
	public void setPants(int pants) {
		this.pants = pants;
	}
	public int getShorts() {
		return shorts;
	}
	public void setShorts(int shorts) {
		this.shorts = shorts;
	}
	
	
	@Override
	public String toString() {
		return "shirts= " + shirts + ", pants= " + pants + ", shorts= " + shorts ;
	}
//	@Override
//	public int compareTo(Clothes c1) {
// 
//		return this.getShirts()>c1.getShirts() ?1 :-1;
//	}
   
}
