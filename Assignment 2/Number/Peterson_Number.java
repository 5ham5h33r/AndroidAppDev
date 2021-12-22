/*
A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
145 is peterson.
 */
package com.myenterprise;

import java.util.Scanner;
public class Peterson_Number {
    int factorial(int n)
    {
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Peterson_Number obj = new Peterson_Number();
        System.out.println("Enter a number to check if it is Peterson Number:");
        int n = sc.nextInt();
        int d, factsum=0, og=n;
        while(n!=0)
        {
            d = n%10;
            factsum += obj.factorial(d);
            n = n/10;
        }
        if (factsum == og)
        {
            System.out.println("Number is a Peterson Number!");
        }
        else
        {
            System.out.println("It is not a Peterson Number.");
        }
    }
}
