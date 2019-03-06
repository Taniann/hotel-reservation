package ua.tania.service;

import ua.tania.dto.UserDto;
import ua.tania.entity.User;

/**
 * Created by Tania Nebesna on 27.02.2019
 */
public interface UserService {
    void save(UserDto user);

    User findByEmail(String email);
}
