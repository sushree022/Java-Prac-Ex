package com.stackroute;
import java.util.Scanner;
public class Pattern {
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number");
        int num= input.nextInt();
        for(int i=1; i<=num; i++)
            for(int j=0; j<i; j++)
        {
            System.out.print(i+ " ");
        }
    }
}

