package com.stackroute.pe1;

public class EvenOdd {
    public String even(int num)
    {
        if(num>20 && num<30) {
            if(num % 2==0){
                return ("Jerry");
            } else
                return ("Tom");
        }else
            return("Enter number between 20 and 30");
    }
}