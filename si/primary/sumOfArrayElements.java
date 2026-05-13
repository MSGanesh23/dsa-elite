import java.util.*;

/* We are gonna solve this problem using the recusrion approach
*/

public class sumOfArrayElements{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases : ");

        int t = scanner.nextInt();

        while(t-->0)
        {
            System.out.println("Enter the number of array elements : ");

            int n = scanner.nextInt();

            long[] ar = new long[n];   //using long array since the constraints are ar[i]<=10^15

            System.out.println("Enter the array elements : ");

            for(int i=0; i<n; i++)
            {
                ar[i] = scanner.nextLong();
            }

            System.out.println(sumFun(ar,n,0));
        }
    }

    static long sumFun(long[] ar, int n, int i)
    {
        if(i==n)
        {
            return 0;
        }

        return ar[i] + sumFun(ar,n,i+1);
    }
}