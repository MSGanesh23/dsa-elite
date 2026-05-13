import java.util.*;

/* Problem is solved using precomputation 
   Meaning some values are calculated before hand and are stored in an array
   for easy access which will reduce the time complexity. */

public class computeFactorial{

    static int mod = 1000000007; 
    static int max = 1000000; //constraint upto 10^6
    static long[] fact = new long[max+1]; //array for storing precomputed values
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the number: ");
            int n = scanner.nextInt();

            

            System.out.println(factorial(n));
        }

    }

    static long factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }

        if(fact[n]!=0)
        {
            return fact[n];
        }

        fact[n] = (n*factorial(n-1))%mod;
        return fact[n];
    }
}