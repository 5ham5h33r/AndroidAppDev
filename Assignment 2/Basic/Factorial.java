package com.myenterprise;

import java.util.Scanner; //Importing Scanner class

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Creating an object of Scanner class
        System.out.println("Enter number to find factorial:");
        int fact=1, n=sc.nextInt(); //Declaring and initializing fact to 1 to store factorial and taking user input for n
        for(int i=1; i<=n; i++) //Running loop from 1 to n
        {
            fact *= i; //Storing factorial in fact
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
