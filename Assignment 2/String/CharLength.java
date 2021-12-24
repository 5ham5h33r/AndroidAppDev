package com.myenterprise;

import java.util.Scanner; //Importing Scanner Class
public class CharLength {
    public static void main(String[] args)
    {
        String str; int count=0;
        Scanner s1 = new Scanner(System.in); //Creating an object of scanner class to take input
        System.out.println("Enter a line of string:");
        str = s1.nextLine(); //Taking String input from user
        for(int i = 0; i<str.length(); i++)
        {
            if (str.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in the entered string: "+count);
    }
}
