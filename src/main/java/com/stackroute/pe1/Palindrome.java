package com.stackroute.pe1;
/* Program to check the given integer is palindrome or not.
   If palindrome then print palindrome or print not palindrome.
 */
public class Palindrome {
    public String palindromenumber (int num)
    {
//        initialization of variables
        int rem, revnum = 0, temp = num;
//      reversing the digits of the number
        while (num != 0)
        {
            rem = num % 10;
            revnum = (revnum * 10) + rem;
            num = num / 10;
        }
// checking palindrome or not
        if (temp == revnum) {
            return ("palindrome");
        }
        else
            return ("not palindrome");


    }

}
