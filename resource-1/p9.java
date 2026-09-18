//Printing hello world without println

import java.util.*;

public class p9{
    public static void main(String[] args)
    {
        if(System.out.printf("Hello, World! \n") == null)
        {

        }
    }
}

/*
println and print can't be used here since they return void type and it 
can't be used inside an if statement.
But printf returns a Printstream object which is never null, which 
is perfect for our use case.
*/