package com.stackroute.pe1;

/* Program to check given input is of which type.
   Lowercase or uppercase or digit or special character
 */

public class CharacterCheck {
    public String check(char input){
// checking the input is lowercase or not
        if (input >= 'a' && input <= 'z')
        {
          return ("The entered character is lowercase");
        }
//        checking the input is uppercase or not
        else if (input >= 'A' && input <= 'Z')
        {
            return ("The entered character is uppercase");
        }
//        checking the input is a digit or not
        else if (input>='0' && input <= '9')
        {
            return("The entered character is a digit");
        }
//        checking the input is special character or not
        else
            return("The entered character is a special character");
    }
}





