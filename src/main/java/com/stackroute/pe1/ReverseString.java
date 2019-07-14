package com.stackroute.pe1;

public class ReverseString {
    public String stringreverse (String word)
    {
        String revword= "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            revword= revword+ word.charAt(i);
        }
     return (revword);

    }

}
