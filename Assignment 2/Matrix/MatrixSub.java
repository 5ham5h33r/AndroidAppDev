package com.myenterprise;

import java.util.Scanner;

public class MatrixSub {
    public static void main(String[] args)
    {
        //If matrix input were to be taken:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of rows in matrix:");
//        m = sc.nextInt();
//        System.out.println("Enter no of cols in matrix:");
//        n = sc.nextInt();
//        System.out.println("Enter all the elements of first matrix:");
//        for (int i = 0; i < m; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                System.out.println("Enter "+(i+1)+"x"+(j+1)+" element of matrix");
//                a[i][j] = s.nextInt();
//            }
//        }
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int c[][] = new int[3][3]; //To store resultant for the 3x3 matrix being considered
        for(int i = 0; i<3;i++) //
        {
            for(int j = 0; j<3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
