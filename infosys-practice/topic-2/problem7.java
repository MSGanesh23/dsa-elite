//Print every element from right to left.

public class problem7{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");

        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        printArrayRev(arr);
    }

    static void printArrayRev(int[] arr)
    {
        int n = arr.length;

        for(int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}