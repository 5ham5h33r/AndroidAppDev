/* 
The ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book.
The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11
*/
package com.myenterprise;

import java.util.Scanner;
import java.lang.*; //Importing Integer to convert String to non-ASCII int
public class ISBN_Test {
    public static void main (String[] args){
        String str; //Initial String declaration for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN:");
        str=sc.next(); //Taking String input from user
        int len=str.length(); //Declaring and initializing length of str to len
        int sum=0, count = 10; //declaring a variable sum to check legality of ISBN and a variable count as counter variable
        if (len!=10) //Check if length of input String is 10.
        {
            System.out.println("Invalid ISBN");
        }
        else
        {
            for(int i=0; i<len; i++) //Running a loop through the length of the String
            {
                //System.out.println("Check char at i is "+(Integer.parseInt(str.substring(i,i+1))));
                sum += (Integer.parseInt(str.substring(i,i+1)) * count); //Extracting the first index of the string, converting it to integer and mupltiplying it by counter
                //System.out.println(sum);
                count--; //Decrementing counter
            }
            if (sum%11 == 0) //Checking if divisible by 11 for legality of ISBN
            {
                System.out.println("Valid ISBN");
            }
            else
                System.out.println("Invalid ISBN");
        }

    }
}
