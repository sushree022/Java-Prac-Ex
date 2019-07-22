package com.stackroute.pe1;
//Program to return reverse of a string

public class ReverseString {
    public String stringreverse (String word)
    {
//        initialization of variable
        String reverseWord= "";
//        reversing the string
        for(int i = word.length() - 1; i >= 0; i--)
        {
            reverseWord = reverseWord+ word.charAt(i);
        }
     return (reverseWord);

    }

}
