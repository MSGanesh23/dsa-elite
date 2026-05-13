//Approach 2 : Using HashMaps Nx1+26x1,26

import java.util.*;

public class freqAlphabets
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the String : ");

		String s = scanner.next();

		printFreq(s);
	}

	static void printFreq(String s)
	{
		HashMap<Character,Integer> hm = new HashMap<>();

		char[] charArray = s.toCharArray();

		for(char ch: charArray)
		{
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}

		for(Map.Entry<Character,Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}

	}
}
