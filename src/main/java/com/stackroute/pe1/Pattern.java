package com.stackroute.pe1;
//Program to return pattern of a given integer.

public class Pattern
{
    public int[] numpattern(int num)
    {
//        initialization of variables.
        int size = 0;
        int index = 0;
//        printing the pattern
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