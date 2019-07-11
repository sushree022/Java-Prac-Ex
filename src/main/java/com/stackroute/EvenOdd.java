package com.stackroute;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        if(num>20 && num<30) {
            if(num % 2==0){
                System.out.println("Jerry");
            } else
                System.out.println("Tom");
        }else
            System.out.println("Enter number between 20 and 30");
    }
}