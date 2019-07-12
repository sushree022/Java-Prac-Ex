package com.stackroute.pe1;


public class LetterCheck {
    public String[] checkword (String word)
    {
        String[] result= new String[word.length()];
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
