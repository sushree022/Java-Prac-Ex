package com.stackroute.pe1;
/* Program to repeat last n characters n number of times.
   It returns a string which is concat of given string and repeat string.
 */
public class RepeatString {
    public String trimstring (String word, int num){
        String trimresult= "";
        String finalresult;
        char trimword;
//        getting the last n characters n number of times.
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
//        getting the final result i.e. original string plus repeat string
        finalresult=word.concat(trimresult);
        return (finalresult);
    }

}
