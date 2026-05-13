import java.util.*;

public class checkIthBit{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");

		int n = scanner.nextInt();

		System.out.println("Enter the bit position to be checked: ");

		int i = scanner.nextInt();

		System.out.println(checkBit(n,i));




	}

	static boolean checkBit(int n, int i)
	{
		return ((n>>i)&1)==1;
	}
}
