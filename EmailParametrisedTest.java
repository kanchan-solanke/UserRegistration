package org.example;
import java.util.Arrays;
import java.util.Collection;
import org.example.UserRegistrationCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private final String emailTest;
    private final boolean expectedResult;

    public UserRegistrationTest(String emailTest, boolean expectedResult) {
        this.emailTest = emailTest;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Collection<Object[]> input() {
        return Arrays.asList(new Object[]
                        {"abc@yahoo.com", true},
                new Object[]{"abc-10@yahoo.com", true},
                new Object[]{"abc.1010@yahoo.com", true},
                new Object[]{"abc222@abccom", true},
                new Object[]{"abc.100@abc.com.au", true},
                new Object[]{"abc@1.com", true},
                new Object[]{"abc123@gamil.a", false},
                new Object[]{"abc123@.com", false},
                new Object[]{"abc@gmail.com.1a", false},
                new Object[]{"abc..4004@gamil.com", false},
                new Object[]{"abc-100@abc.net", true});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedTest() {
        UserRegistrationCase uservalidationProcess = new UserRegistrationCase();
        boolean result = uservalidationProcess.validateEmailTest(this.emailTest);
        Assert.assertEquals(this.expectedResult, result);
    }
}
