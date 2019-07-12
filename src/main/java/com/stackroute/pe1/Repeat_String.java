package com.stackroute.pe1;
import java.util.Scanner;

public class Repeat_String {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int length = word.length();
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print(word);
        for (int i = 0; i < num; i++)
        {
            int temp = length-num;
            do
                {
                char result = word.charAt(temp);
                System.out.print(result);
                temp++;
            }
            while (length != temp);
        }
    }
}
