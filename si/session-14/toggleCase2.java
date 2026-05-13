//Approach 2 : Applying XOR on 5th bit of the String 

import java.util.*;

public class toggleCase2{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String : ");

		String s = scanner.next();

		System.out.println(toggleCase(s));
	}

	static String toggleCase(String s)
	{
		char[] charArray = s.toCharArray();

		for(int i=0; i<charArray.length; i++)
		{
			charArray[i] = (char)(charArray[i]^32);
		}

		return new String(charArray);
	}


}
