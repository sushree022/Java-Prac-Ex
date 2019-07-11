package com.stackroute;
import java.util.Scanner;

public class Character_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char a = input.next().charAt(0);
        if (a >= 'a' && a <= 'z')
        {
            System.out.println("The entered character is lowercase");
        }
        else if (a >= 'A' && a <= 'Z')
        {
            System.out.println("The entered character is uppercase");
        }
        else if (a >='0' && a <= '9')
        {
            System.out.println("The entered character is a digit");
        }
        else
            System.out.println("The entered character is a special character");
    }
}





