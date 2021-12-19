/*  Printing Fibonacci Series till N  */
package com.myenterprise;

import java.util.Scanner; //Importing Scanner Class

public class Fibonacci_Series {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Creating an object of Scanner class
        int f1=0,f2=1,f3; //Initializing first two terms of fib
        System.out.println("Enter the value of N");
        int n = sc.nextInt(); //Taking input for n from the user
        if(n == 1) //Printing if input is 1
        {
            System.out.println(f1);
        }
        else if(n == 2) //printing if input is 2
        {
            System.out.println(f1+"\n"+f2);
        }
        else
        {
            System.out.println(f1+"\n"+f2); //Printing first two terms
            for(int i = 0; i<n-2; i++) //Printing fib series, n-2 as first two terms are already printed
            {
                f3=f1+f2; //Setting next term to sum of previous two terms
                System.out.println(f3); //Printing the next term
                f1=f2;
                f2=f3;
            }
        }
    }
}
