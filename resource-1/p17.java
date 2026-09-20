// Program to get the String Length

import java.util.*;

public class p17{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");

        String str = scanner.nextLine();

        int length = lengthOfString(str);

        System.out.println("Length of the String is : " + length);
    }

    static int lengthOfString(String str)
    {
        str = str.trim();

        int count = 0;

        for(char c : str.toCharArray())
        {
            count++;
        }

        return count;
    }
}

/* Note : You could simply use the str.length() method also which is an 
           in built java method. 
*/


