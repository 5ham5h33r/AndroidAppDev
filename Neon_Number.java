package com.myenterprise;

import java.util.Scanner;
public class Neon_Number {

    public static void main(String[] args) {
        // Armstrong number
        int sqrsum = 0, sqr, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sqr = n*n;
        while(n!=0)
        {
            d=n%10;
            sqrsum=sqrsum+(d*d);
            //System.out.println(sqrsum);
            n=n/10;
        }
        System.out.println("Sum of square of digits is "+sqrsum);
        System.out.println("Square of number is "+sqr);
        if (sqrsum==sqr)
            System.out.println("Therefore, it is a neon number.");
        else
            System.out.println("Therefore, it is not a neon number:");

    }
}
