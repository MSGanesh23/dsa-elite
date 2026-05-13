//Approach 3 : Using Count Array instead of HashMap - Nx1+26x1,26

import java.util.*;

public class freqAlphabets3{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String: ");

		String s = scanner.next();

		printFreq(s);
	}

	static void printFreq(String s)
	{
		char[] charArray = s.toCharArray();

		int[] count = new int[26];

		for(char ch : charArray)
		{
			count[ch-97]++;
		}

		for(char c='a'; c<='z'; c++)
		{
			System.out.println(c+"->"+count[c-'a']);
		}
	}
}
