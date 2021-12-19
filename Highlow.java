/*
    Steps of program:
    1. Pick a random number range of 1-100
    2. User gives input until he bored (negative input = break)
    3. For postiive input, either input is too large or too small
    4. For correct input, then your ans is correct.
 */
//Can Optimize this Code WAY MORE
package com.myenterprise;

import java.util.Scanner;
import java.lang.*;
public class Highlow {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int guess = 0;
        int a = (int)(Math.random()*100);
        System.out.println("Guess is "+a);
        System.out.println("Guess a number:");
        while (guess != a)
        {
            guess = s1.nextInt();
            if (guess < 0)
            {
                System.out.println("Thank you for playing!");
                break;
            }

            if (guess > a)
            {
                System.out.println("Guessed num too high, guess again");
                continue;
            }

            if (guess < a)
            {
                System.out.println("Guessed num too low, guess again");
                continue;
            }

            if (guess == a)
            {
                System.out.println("Ans is correct!");
                break;
            }



        }
    }
}
