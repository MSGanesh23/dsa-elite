import java.util.*;

public class countSetBits{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = scanner.nextInt();

		System.out.println(countSetBits(n));
	}

	static int countSetBits(int n)
	{
		int ans = 0;

		for(int i=0; i<31; i++)
		{
			if(checkBit(n,i))
			{
				ans++;
			}
		}

		return ans;
	}

	static boolean checkBit(int n, int i)
	{
		return ((n>>i)&1)==1;
	}
}
