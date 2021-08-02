import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistartion {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[A-Z a-z]{3}");
        Matcher matcher = p.matcher("Kan");
        while (matcher.find()) {
            System.out.println("valid");
        }
    }
}
