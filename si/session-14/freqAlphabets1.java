//Approach 1 : Brute Force - 36xN,1

import java.util.*;

public class freqAlphabets{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String : ");

		String s = scanner.next();

		printFreq(s);
	}

	static void printFreq(String s)
	{
		char[] charArray = s.toCharArray();

		for(char i='a';i<='z';i++)
		{
			int freq = 0;

			for(char ch: charArray)
			{
				if(ch==i)
				{
					freq++;
				}
			}
			System.out.println(i+"->"+freq);
		}
	}
}
