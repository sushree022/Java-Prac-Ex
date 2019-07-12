package com.stackroute.pe1;
import java.util.Scanner;

public class SumOfnNos {
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        int num, sum=0;
        System.out.print("How many numbers you want to enter: ");
        num= input.nextInt();
        int a[]= new int[num];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<num; i++)
        {
            a[i]= input.nextInt();
            sum= sum+ a[i];
        }
        System.out.println("Sum of all numbers is: "+ sum);
    }
}

