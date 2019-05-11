//Recursive string reverse
public class ReverseAString 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		System.out.println("String is: "+ s);
		System.out.println("String reversed is: " + Reverse(s));
	}
	static String Reverse(String s)
	{
		if(s.length() > 0)
		{
			String l = s.substring(s.length()-1, s.length());
			String r = s.substring(0, s.length()-1);
			s = l + Reverse(r);
		}
		return s;
	}

}
