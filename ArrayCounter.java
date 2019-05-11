//Creates a histogram of die values.
import java.security.SecureRandom;
public class ArrayCounter 
{

	public static void main(String[] args) 
	{
		SecureRandom randomNumber = new SecureRandom();
		//start at zero
		int [] frequency = new int[7];
		for(int count=0; count < 600; count++)
		{
			int faceValue = 1 + (randomNumber.nextInt(6));
			int sub = faceValue;
			frequency[sub]++;
		}
		System.out.println("Face Value    Frequency\n");
		for(int x = 1; x < 7; x++)
		{
			//prints the face value and the frequency of that face value.
			//formatted for the spacing between the columns as well.
			System.out.printf("%5d           %3d%n", x, frequency[x]);
		}
	}

}
