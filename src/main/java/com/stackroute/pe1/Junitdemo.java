package com.stackroute.pe1;

public class Junitdemo {
        public String concatAndUpperCase(String str1, String str2)
        {
            if(str1==null || str2==null) {
                return ("Null Values not allowed");
            }
            String concattedString= str1.concat(str2);
            return concattedString.toUpperCase();

        }
        public String reverseString(String str)
        {
            int length=str.length();
            String rev_str= "";
            for(int i = str.length() - 1; i >= 0; i--)
            {
                rev_str= rev_str+ str.charAt(i);
            }
            return (rev_str);
        }
    }
