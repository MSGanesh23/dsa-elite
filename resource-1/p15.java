// Program to convert upper case to lower case characters in a string 

import java.util.*;

public class p15{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.nextLine();

        String result = toLowerCase(str);

        System.out.println("Resultant String : " + result);

    }

    static String toLowerCase(String str)
    {
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray())
        {
            if(ch>='A' && ch<='Z')
            {
                sb.append((char)(ch+32));
            }
            else
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}