package com.myenterprise;

import java.util.Scanner;
import java.lang.*;
public class ISBN_Test {
    public static void main (String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN:");
        str=sc.next();
        int len=str.length(),sum=0, count = 10;
        if (len!=10)
        {
            System.out.println("Invalid ISBN");
        }
        else
        {
            for(int i=0; i<len; i++)
            {
                //System.out.println("Check char at i is "+(Integer.parseInt(str.substring(i,i+1))));
                sum = (Integer.parseInt(str.substring(i,i+1)) * count) + sum;
                //System.out.println(sum);
                count--;
            }
            if (sum%11 == 0)
            {
                System.out.println("Valid ISBN");
            }
            else
                System.out.println("Invalid ISBN");
        }

    }
}
