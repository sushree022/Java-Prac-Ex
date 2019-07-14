package com.stackroute.pe1;

public class Pallindrome {
    public String pallindromenumber (int num){
        int rem, rnum = 0, temp = num;
        while (num != 0)
        {
            rem = num % 10;
            rnum = (rnum * 10) + rem;
            num = num / 10;
        }

        if (temp == rnum) {
            return ("pallindrome");
        }
        else
            return ("not pallindrome");


    }

}
