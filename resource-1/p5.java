//Check if a number is Armstrong number

import java.util.*;

public class p5{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int number = scanner.nextInt();

        int temp = number;
        int number1 = temp;

        int sum = 0;

        int power = 0;

        while(number1>0)
        {
            number1 = number1/10;
            power++;
        }

        while(number>0)
        {
            int digit = number%10;
            sum = sum + (int)Math.pow(digit, power);
            number = number/10;
            
        }

        if(temp==sum)
        {
            System.out.println("The number is Armstrong number.");
        }
        else
        {
            System.out.println("The number is not Armstrong number.");
        }
    }
    }
