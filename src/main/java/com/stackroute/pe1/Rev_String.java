package com.stackroute.pe1;
import java.util.Scanner;

public class Rev_String {
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word= input.nextLine();
        int length=word.length();
        String rev_word= " ";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            rev_word= rev_word+ word.charAt(i);
        }
        System.out.println("The reverse string is" + rev_word);
    }

}
