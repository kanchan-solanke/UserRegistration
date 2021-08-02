package org.example;
import org.example.UserRegistrationCase;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
    @Test
    public void givenfirstnameshouldbeTrue() {
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateFirstName("Kanchan");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastnameshouldbeTrue() {
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateLastName("Solanke");
        Assert.assertEquals(true, result);
    }
@Test
    public void givenMobilenoconditionmeetthenTrue(){
    UserRegistrationCase userRegistration = new UserRegistrationCase();
    boolean result = userRegistration.validateMobileNumber("91 9919819801");
    Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordconditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePassword("Abc45ut3");
        Assert.assertEquals(true,result);
    }
}