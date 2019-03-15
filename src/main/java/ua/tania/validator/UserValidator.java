package ua.tania.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.tania.dto.UserDto;
import ua.tania.entity.User;
import ua.tania.service.UserService;


/**
 * Created by Tania Nebesna on 05.03.2019
 */
@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserDto user = (UserDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email is required");
        if (!EmailValidator.isValid(user.getEmail())) {
            errors.rejectValue("email", "email is uncorrect");
        }
        if (userService.findByEmail(user.getEmail()) != null) {
            errors.rejectValue("email", "Duplicate.userForm.email");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password is required");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getConfirmedPassword().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }

    public void validateForLogin(Object o, Errors errors) {
        UserDto userDto = (UserDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email is required");

        User user = userService.findByEmail(userDto.getEmail());

        if (user == null) {
            errors.rejectValue("email", "noSuchUser.userForm.email");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password is required");
        if ((user.getPassword()).equals(userDto.getPassword())) {
            errors.rejectValue("password", "notSuchPassword.userForm.password");
        }
    }
}
