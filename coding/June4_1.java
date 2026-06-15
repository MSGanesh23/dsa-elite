import java.util.*;

public class June4_1{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int largest = 0;
        int second = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest = arr[i];
            }

            if(arr[i]>second && arr[i]<largest)
            {
                second = Math.max(second, arr[i]);
            }


        }

        System.out.println("Second Largest number : " + second);


    }
}