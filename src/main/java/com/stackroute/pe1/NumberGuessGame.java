package com.stackroute.pe1;
/* Program to take 2 inputs from user between 1-50 and 1-100.
   Then generating one random number between those 2 numbers.
   Asking user to guess the random number till the user guesses the correct number.
   If the guessed number is less than/greater than/same as the random number then print some messages.
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        Random num = new Random();
//        Taking inputs from user
        System.out.print("Enter number between 1 to 50 and 1 to 100: ");
        int num1 = input.nextInt();
        int num2= input.nextInt();
//        Generating random number between the numbers entered by the user
        int randomnum = num.nextInt(num1- num2+1);
//        initializing the guess number
        int guessnum=0;
        System.out.println("The number is between" + num1 + "and" +num2);
//        Asking the user to guess the number untill the guess number matches the random number
        do {
             System.out.println("Guess the number: ");
             guessnum= input.nextInt();
                if (guessnum > randomnum) {
                    System.out.println("Number guessed is more than original number");
                }
                else if (guessnum< randomnum)
                {
                    System.out.println("Number guessed is less than original number");
                }
                else
                    System.out.println("Number guessed matches the original number");
        }
        while (guessnum !=randomnum);

        }
        }

