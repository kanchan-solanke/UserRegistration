package org.example;
import org.example.UserRegistrationCase;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest
{
    @Test
    public void givenfirstnameshouldbeTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateFirstName( "Kanchan");
        Assert.assertEquals(true,result);
    }
}