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
    public void givenPassword1conditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePasswordatleastoneUpperCase("Aber345o");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword2conditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePasswordatleastonenumericNumber("A8aaaaaao");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword3conditionmeetthenTrue(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validatePasswordatleastonespecialChar("A8@aaaao");
        Assert.assertEquals(true,result);
    }
@Test
    public void validateforemail(){
        UserRegistrationCase userRegistration = new UserRegistrationCase();
        boolean result = userRegistration.validateforemail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,result);
}
}