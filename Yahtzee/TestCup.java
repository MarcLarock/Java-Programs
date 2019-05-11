//Tests Cup AND, therefore, Die
public class TestCup 
{

	public static void main(String[] args) 
	{
		Cup c = new Cup();
		System.out.println("***Initial Face Values of Dice***");
		c.showDice();
		System.out.println("***New Face Values of Dice***");
		c.roll();
		c.showDice();
		if(c.isFullHouse()){
			System.out.println("Full House!");
		}
	}

}
