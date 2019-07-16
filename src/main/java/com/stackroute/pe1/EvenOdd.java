package com.stackroute.pe1;
/* Program to check the given number is between 20 and 30 or not.
   If the given condition is true then check if the given number is even or odd.
   If the number is even then print Jerry or for odd number print Tom.
 */

public class EvenOdd {

    public String even(int num)
    {
//        Checking the number is between 20-30 or not
        if(num>20 && num<30)
        {
//            checking the number is even or odd
            if(num % 2==0){
                return ("Jerry");
            } else
                return ("Tom");
        }
        else
            return("Enter number between 20 and 30");
    }
}