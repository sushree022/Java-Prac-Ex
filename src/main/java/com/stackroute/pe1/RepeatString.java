package com.stackroute.pe1;

public class RepeatString {
    public String trimstring (String word, int num){
        String trimresult= "";
        String finalresult="";
        char trimword=' ';
        for (int i = 0; i < num; i++)
        {
            int temp = word.length()-num;
            do
                {
                trimword= word.charAt(temp);
                trimresult=trimresult.concat(Character.toString(trimword));
                temp++;
            }
            while (word.length() != temp);


        }
        finalresult=word.concat(trimresult);
        return (finalresult);
    }

}
