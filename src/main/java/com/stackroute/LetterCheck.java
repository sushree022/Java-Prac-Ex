package com.stackroute;
import java.util.Scanner;

public class LetterCheck {
    public static void main(String [] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word= input.nextLine();
        int length=word.length();
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'|| word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            System.out.println(word.charAt(i) +" is vowel");
            else
                System.out.println(word.charAt(i) +" is consonant");
        }

    }
}
