package com.stackroute.pe1;
import java.util.Scanner;

public class Pallindrome {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rem, rnum = 0, temp = num, sum=0;
        while (num != 0)
        {
            rem = num % 10;
            rnum = (rnum * 10) + rem;
            num = num / 10;
            sum= sum+rem;
        }

        if (temp == rnum) {
            System.out.println(temp + " is a pallindrome");
            {
                if (sum > 25)
                    System.out.println("sum of even digits is more than 25");
                else
                    System.out.println("Sum of digits is less than 25");
            }
        }
        else
            System.out.println(temp + " is not pallindrome");


    }

}
