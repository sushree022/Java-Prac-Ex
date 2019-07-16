package com.stackroute.pe1;
// program to return summation of array of numbers
public class SumOfnNos {
    public int summation(int[] num)
    {
        int sum=0;
        for(int i=0; i<num.length; i++)
        {
            sum= sum+ num[i];
        }
        return (sum);
    }
}

