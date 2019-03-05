package ua.tania.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tania Nebesna on 05.03.2019
 */
public class EmailValidator {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    public static boolean isValid(final String username) {
        return (validateEmail(username));
    }

    private static boolean validateEmail(final String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
