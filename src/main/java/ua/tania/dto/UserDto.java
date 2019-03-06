package ua.tania.dto;

import lombok.Data;
import ua.tania.entity.Order;
import ua.tania.entity.Role;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Tania Nebesna on 05.03.2019
 */
@Data
public class UserDto {
    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String confirmedPassword;

    private Role role;

    private List<Order> orders;

}
