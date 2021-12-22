/* Program to copy all elements of one array into another array */
package com.myenterprise;

import java.util.Scanner;
public class Copying_Array {
    public static void main(String[] args)
    {
        //Declaring two arrays of size 5, one to fill content to and the other to copy content to.
        int m[] = new int[5];
        int n[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers for array:");
        for(int i=0;i<5;i++)
        {
            m[i]=sc.nextInt(); //Taking input for array
        }
        System.out.println("Entered numbers are:");
        for(int i=0;i<5;i++) {
            System.out.println(m[i]);
            n[i] = m[i]; //Copying contents of array m to array n
        }
        System.out.println("Copied Array:");
        for(int i=0; i<5; i++)
        {
            System.out.println(n[i]);
        }
    }
}
