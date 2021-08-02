package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationCase {



    public boolean validateEmailTest(String emailTest){
        boolean check = Pattern.matches("abc.xyz@bl.co.in" ,emailTest);
        return check;

    }
}
