package com.stackroute;
import java.util.Scanner;
import java.util.Random;

public class Num_Guess {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random num = new Random();
        System.out.print("Enter number between 1 to 50 and 1 to 100: ");
        int from = input.nextInt();
        int to= input.nextInt();
        int rnum = num.nextInt(to- from+1);
        int gnum=0;
        System.out.println("The number is between" + from + "and" +to);
        do {
             System.out.println("Guess the largest number: ");
             gnum= input.nextInt();
                if (gnum > rnum) {
                    System.out.println("Number guessed is more than original number");
                }
                else if (gnum< rnum) {
                    System.out.println("Number guessed is less than original number");
                }
                else
                    System.out.println("Number guessed matches the original number");
        }
        while (gnum !=rnum);

        }
        }

