// Program to reverse a string 

import java.util.*;

public class p25{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String str = scanner.nextLine();

        String reversed = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String : " + reversed);

    }
}

/*
You can also use the .reverse() function in StringBuilder 
String reversed = new StringBuilder(str).reverse().toString()
*/