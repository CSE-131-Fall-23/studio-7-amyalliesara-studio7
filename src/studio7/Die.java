package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) 
	{
		super();
		this.sides = sides;
	}
	
	public int roll()
	{
		return (int)(Math.random()*this.sides+1);
	}
	
	public static void main(String[] args)
	{
		Die die = new Die(20);
		System.out.print(die.roll());
	}
	
}
