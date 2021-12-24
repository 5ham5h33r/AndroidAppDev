package com.myenterprise;

import java.util.Locale;
import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int vow = 0, con = 0; //Keeping count of consonants and vowels
        str = str.toLowerCase(); //Lower case to avoid accounting for mixed case conditions.
        for(int i = 0; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') //Checking if it's a con
                vow++;
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') //Checking if it lies between a and z
                con++;
        }
        System.out.println("Vowels: "+vow+"\nConsonants:"+con);
    }
}
