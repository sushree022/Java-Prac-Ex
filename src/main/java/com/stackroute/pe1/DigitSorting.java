package com.stackroute.pe1;
/* Program to sort the digits of input number in descending order.
   Also calculating the sum of even digits of the number and
   checking whether the sum is greater than 15 or not.
   If greater than 15 then printing true otherwise false.
 */
import java.util.Scanner;

public class DigitSorting
{
    public static void main(String[] args)
    {
//        Take input from user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
//        Declaration of variables
        int i = 0;
        int temp;
        int sum = 0;
        int[] arr = new int[50];
//        calculating sum of even digits of input number
        do {
            arr[i] = num % 10;
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
            num = num / 10;
            i++;
        }
        while (num != 0);
//        Arranging digits in descending order and storing it in an array
        for (int k = 0; k < i; k++)
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
        for(int j=0;j<i;j++)
        {
            System.out.print(arr[j]);
        }
        System.out.println("\nsum of even digits of the input number is "+sum);
//        Checking the sum of even digits is greater than 15 or not
        if(sum>15)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
