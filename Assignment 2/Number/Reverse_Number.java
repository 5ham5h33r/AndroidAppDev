package com.myenterprise;

import java.util.Scanner; //Importing Scanner class
public class Reverse_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Creating object of Scanner class
        System.out.println("Enter a number to find its reverse:");
        int n = sc.nextInt(); //Taking scanner input
        int d, r=0;
        while(n!=0)
        {
            d = n%10;       //last digit from right
            n = n/10;       //Removing one digit from the right
            r = (r*10)+d;   //Forming reversed number
        }
        System.out.println("Reversed: "+r);
    }
}
