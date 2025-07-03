package com.ashwanicoding.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean isUserAuthenticate(String username, String password){
        boolean isUsernameValid = username.equalsIgnoreCase("ashwanicoding");
        boolean isPasswordValid = password.equalsIgnoreCase("12345");
        return isUsernameValid && isPasswordValid;
    }

}
