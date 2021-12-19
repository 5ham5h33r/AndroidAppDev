/* Program to check if entered number is an Armstrong Number 
   Armstrong number is a number that is equal to the sum of cubes of its digits */
package com.myenterprise;

import java.util.Scanner; //Importing Scanner class to take user input
public class Armstrong_Number {

    public static void main(String[] args) {
        int cube = 0, og, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        og = n; //Stores a copy of original number
        while(n!=0)
        {
            d=n%10; //Extracts last digit from the right
            cube += (d*d*d); //Cubes the extracted digit and adds it to cube
            //System.out.println(cube);
            n=n/10; //Reduces the number of digits in n by 1 (as it's an integer)
        }
        System.out.println("Sum of cube of digits is "+cube);
        if (cube==og) //Check if sum of cubes of digit is equal to original number
        System.out.println("Therefore, it is an armstrong number.");
        else
        System.out.println("Therefore, it is not an armstrong number:");

    }
}
