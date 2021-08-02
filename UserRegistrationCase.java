package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationCase {

    public boolean validateEmailTest(String emailTest) {
        boolean check = Pattern.matches("abc.xyz@bl.co.in", emailTest);
        return check;
    }

    //for First Name
    public boolean validateFirstName(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        return check;
    }

    //for Last Name
    public boolean validateLastName(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        return check;
    }

    //for Mobile number
    public boolean validateMobileNumber(String str) {
        boolean check = Pattern.matches("^([0-9]{2}) ([1-9]{1}[0-9]{9})$", str);
        return check;
    }

    //for password
    public boolean validatePassword(String str) {
        boolean check = Pattern.matches("^[a-zA-Z0-9]{8,}$", str);
        return check;
    }

    public boolean validatePasswordatleastoneUpperCase(String str){
        boolean check = Pattern.matches("^[A-Z]{1}[A-Za-z0-9]{7,}$",str);
        return check;
    }
    public boolean validatePasswordatleastonenumericNumber(String str){
        boolean check = Pattern.matches("^[A-Z]{1}[0-9]{1,}+[A-Za-z0-9]{6,}$",str);
        return check;
    }

    // for at least one special char

    public boolean validatePasswordatleastonespecialChar(String str){
        boolean check = Pattern.matches( "^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$",str);
        return check;
    }

}