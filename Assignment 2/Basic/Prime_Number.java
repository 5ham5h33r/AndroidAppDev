/* Prime number is a number that is greater than 1 and divided by 1 or itself only. */
package com.myenterprise;

import java.util.Scanner; //Importing Scanner Class

public class Prime_Number {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int flag=0; //Initializing a flag to 0 to use if number is not prime
        System.out.println("Enter a number:");
        int n = inp.nextInt(); //Creating an object of Scanner class
        if (n==0|n==1|n==2) //Accommodating for conditions that fall outside the logic
        {
            System.out.println("Not a prime number.");
        }
        else //Running the actual logic
        {
            for(int i=2;i<n;i++) //Starting a loop from 2 because all numbers are divisible by 1.
            {
                if (n%i==0) { //Checking if number is divisible by any other number except itself and 1
                    System.out.println("It is not a prime number");
                    break; //Exiting loop if number is found divisible after printing appropriate message
                }
                else
                    flag = 1; //Marking flag as 1 if number is found indivisible by all numbers running through the loop
            }
        }
        if (flag == 1) //Printing appropriate message if number is found to be prime.
            System.out.println("It is a prime number.");

    }
}
