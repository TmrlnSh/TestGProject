package com.ebay;

public class LoginFeatures {
    String validUsername = "admin";
    String validPassword = "admin123";

    public boolean doLogin(String username, String password) {
        if (username.equals(validUsername) && password.equals(validPassword)) {
            return true;
        }
        return false;
    }

}
