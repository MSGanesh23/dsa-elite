//Approach 1 : Brute Force - N,1

import java.util.*;

public class toggleCase
{
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
			if(charArray[i]>='a' && charArray[i]<='z')
			{
				charArray[i] = (char)(charArray[i]-32);
			}
			else
			{
				charArray[i] = (char)(charArray[i]+32);
			}
		}

		return new String(charArray);

	}
}
