
public class Cup 
{
	private
	//Cup now has a place for 5 die objects
	Die[] dice = new Die[5];
	
	void fillCupWithDice()
	{
		for(int x = 0; x < 5; x++)
		{
			dice[x] = new Die();
		}
	}
	
	public
	
	//Cup constructor 
	Cup()
	{
		//When a cup is created, fill it with dice
		fillCupWithDice();
	}
	
	void roll()
	{
		for(int x = 0; x<5; x++)
		{
			dice[x].roll();
		}
	}
	
	void showDice()
	{
		for(int x = 0; x<5;x++)
		{
			System.out.println(dice[x].getFaceValue());
		}
	}
	
	boolean isFullHouse()
	{
		int counters[] = {0,0,0,0,0,0,0};
		for(int x = 0; x<5; x++)
		{
			counters[dice[x].getFaceValue()]++;
		}
		boolean threeCount = false;
		boolean twoCount = false;
		for(int x = 1; x<7; x++)
		{
			if(counters[x]==3){
				threeCount = true;
			}
			if(counters[x]==2){
				twoCount = true;
			}
		}
		return threeCount && twoCount;
	}
}
