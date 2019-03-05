package ua.tania.dto;

import lombok.Data;
import ua.tania.entity.Order;
import ua.tania.entity.Role;

import java.util.List;

/**
 * Created by Tania Nebesna on 05.03.2019
 */
@Data
public class UserDto {
    private Long id;

    private String email;

    private String password;

    private String confirmedPassword;

    private Role role;

    private List<Order> orders;

}
