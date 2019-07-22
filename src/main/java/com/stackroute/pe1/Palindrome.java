package com.stackroute.pe1;
/* Program to check the given integer is palindrome or not.
   If palindrome then print palindrome or print not palindrome.
 */
public class Palindrome {
    public String palindromenumber (int num)
    {
//        initialization of variables
        int reminder, reverseNum = 0, tempNum = num;
//      reversing the digits of the number
        while (num != 0)
        {
            reminder = num % 10;
            reverseNum  = (reverseNum * 10) + reminder;
            num = num / 10;
        }
// checking palindrome or not
        if (tempNum == reverseNum) {
            return ("palindrome");
        }
        else
            return ("not palindrome");
    }

}
