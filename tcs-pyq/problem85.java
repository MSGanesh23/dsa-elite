//Check if two strings contain the same characters with same frequency.

import java.util.*;

public class problem85{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");

        String s1 = scanner.next();

        System.out.println("Enter the second string : ");

        String s2 = scanner.next();

        char[] arr = new char[256];

        for(char c : s1.toCharArray())
        {
            arr[c]++;
        }

        for(char c : s2.toCharArray())
        {
            arr[c]--;
        }

        boolean isAnagram = true;

        for(int x : arr)
        {
            if(x!=0)
            {
                isAnagram = false;
                break;
            }
        }

        System.out.println((isAnagram) ? "Yes" : "No");
    }
}