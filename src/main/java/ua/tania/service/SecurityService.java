package ua.tania.service;

/**
 * Created by Tania Nebesna on 05.03.2019
 */
public interface SecurityService {
    String findLoggedIn();

    void autologin(String email, String password);
}
