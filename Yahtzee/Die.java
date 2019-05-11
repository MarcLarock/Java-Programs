import java.security.SecureRandom;
public class Die 
{
	private
	SecureRandom randomNumber = new SecureRandom();
	int faceValue = roll();
	
	public
	int roll()
	{
		faceValue = 1 + (randomNumber.nextInt(6));
		return faceValue;
	}
	
	int getFaceValue()
	{
		return faceValue;
	}
	
}
