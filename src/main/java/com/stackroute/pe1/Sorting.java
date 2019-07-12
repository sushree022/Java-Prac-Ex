package com.stackroute.pe1;
import java.util.Scanner;

public class Sorting {
    public static void main(String []args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        int i=0;
        int temp;
        int sum=0;
        int[] arr = new int[100];

        do {
            arr[i] = num % 10;
            if(arr[i]%2==0)
            {
                sum+=arr[i];
            }
            num = num/10;
            i++;
        }
        while (num != 0);

        for ( int k = 0; k < i; k++)
        {
            for (int j = k + 1; j < i; j++)
            {
                if (arr[k] < arr[j])
                {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int j=0;j<i;j++){
            System.out.print(arr[j]);
        }
        System.out.println("\n Sum of even numbers is "+sum);
        if(sum>15){
            System.out.println("True");
        }else
            System.out.println("False");
    }
    }

