// Program to get LCM of two numbers 

import java.util.*;

public class p21{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        int a = scanner.nextInt();

        System.out.println("Enter the second number : ");

        int b = scanner.nextInt();

        int gcd = getGCD(a,b);

        int lcm = (a*b)/gcd;

        System.out.println("The LCM : " + lcm);


    }

    static int getGCD(int a, int b)
    {
        if(b==0)
        {
            return a;
        }

        return getGCD(b, a%b);
    }


}