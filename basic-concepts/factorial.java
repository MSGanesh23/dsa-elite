import java.util.*;

public class factorial{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = scanner.nextInt();

		System.out.println(factorial(n));
	}

	static long factorial(int n)
	{
		if(n==0) return 1;

		return n*factorial(n-1);
	}
}
