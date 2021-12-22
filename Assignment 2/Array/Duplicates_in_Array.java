/* Program to print only duplicated elements of array */
package com.myenterprise;

public class Duplicates_in_Array {
    public static void main(String args[])
    {
        int m[] = new int[] {1,2,2,3,4,5,6,6,7,19,19,20,21}; //Declaring array to check duplicates
        for(int i = 0; i<m.length; i++) //Iterating over array
        {
            for(int j = i+1; j<m.length; j++) //Iterating over the array with starting point being the next element (+1) from the array.
            {
                if(m[i]==m[j]) //Checking if duplicate exists
                    System.out.println(m[i]); //Printing the element if it has been repeated.
            }
        }
    }
}
