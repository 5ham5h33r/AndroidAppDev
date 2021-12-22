package com.myenterprise;

import java.util.*;

public class Freq_count_array {
    public static void main(String args[]) {

        int m[] = new int[]{1, 2, 3, 2, 5};
        int counts[] = new int[m.length];
        int count = 0, checked=-1;
        for (int i = 0; i < m.length; i++) {
            //System.out.println("I is at "+i);
            count = 1;
            for (int j = i+1; j < m.length; j++)
            {
                //System.out.println("J is at "+j);
                if(m[i] == m[j])
                {
                    count += 1;
                    counts[j] = checked;
                }
            }
            if (counts[i] != checked)
            {
                counts[i] = count;
            }

        }
        for(int i = 0; i<counts.length;i++)
        {
            if (counts[i] != checked)
            {
                System.out.println(m[i]+", Frequency: "+counts[i]);

            }
        }
    }
}
