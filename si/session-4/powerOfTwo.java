import java.util.*;

public class powerOfTwo{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the exponent for 2: ");

		int n = scanner.nextInt();

		System.out.println(powerOf2(n));
	}

	static int powerOf2(int n)
	{
		return 1<<n;
	}
}
