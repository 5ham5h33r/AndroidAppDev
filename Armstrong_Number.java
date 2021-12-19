package com.myenterprise;

import java.util.Scanner;
public class Armstrong_Number {

    public static void main(String[] args) {
        // Armstrong number
        int cube = 0, og, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        og = n;
        while(n!=0)
        {
            d=n%10;
            cube=cube+(d*d*d);
            //System.out.println(cube);
            n=n/10;
        }
        System.out.println("Sum of cube of digits is "+cube);
        if (cube==og)
        System.out.println("Therefore, it is an armstrong number.");
        else
        System.out.println("Therefore, it is not an armstrong number:");

    }
}
