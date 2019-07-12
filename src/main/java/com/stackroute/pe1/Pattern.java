package com.stackroute.pe1;

public class Pattern {
    public int[] numpattern(int num)
    {
        int size = 0;
        int index = 0;
        for (int i = 1; i <= num; i++) size += i;
        int[] result = new int[size];
        for (int i = 1; i <= num; i++)
        {
            for (int j = 0; j < i; j++)
            {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}