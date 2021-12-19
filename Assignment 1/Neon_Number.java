/* A neon number is a number where the sum of digits of square of the number is equal to the number. The task is to check and print neon numbers in a range. */
package com.myenterprise;

import java.util.Scanner; //Importing Scanner for user input
public class Neon_Number {

    public static void main(String[] args) {
        
        int sqrsum = 0, sqr, d; //sqrsum to check legality of neon number, square to store square of input number and d to split digits of the number.
        Scanner sc = new Scanner(System.in); //Creating an object sc of Scanner class
        System.out.println("Enter a number");
        int n = sc.nextInt(); //Taking input using Scanner object
        sqr = n*n; //Storing square of input number in sqr
        while(n!=0)
        {
            d=n%10; //Splitting digits
            sqrsum += (d*d); //Storing sum of squares of digits in sqrsum
            //System.out.println(sqrsum);
            n=n/10; //Reducing the number of digits in the input number
        }
        System.out.println("Sum of square of digits is "+sqrsum); 
        System.out.println("Square of number is "+sqr);
        if (sqrsum==sqr) //Checking if sum of square of digits is equal to square of input number
            System.out.println("Therefore, it is a neon number.");
        else
            System.out.println("Therefore, it is not a neon number:");

    }
}
