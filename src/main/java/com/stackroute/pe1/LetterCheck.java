package com.stackroute.pe1;
/* Program to check each character of given string is a vowel or consonant.
   For vowel return vowel and for consonant character return consonant.
 */

public class LetterCheck {
    public String[] checkword (String word)
    {
        String[] result= new String[word.length()];
//        Checking each character of the given string
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'|| word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            result[i]=("vowel");
            else
                result[i]=( "consonant");
        }
        return result;

    }
}
