package com.stackroute.pe1;


public class CharacterCheck {
    public String check(char input){

        if (input >= 'a' && input <= 'z')
        {
          return ("The entered character is lowercase");
        }
        else if (input >= 'A' && input <= 'Z')
        {
            return ("The entered character is uppercase");
        }
        else if (input>='0' && input <= '9')
        {
            return("The entered character is a digit");
        }
        else
            return("The entered character is a special character");
    }
}





