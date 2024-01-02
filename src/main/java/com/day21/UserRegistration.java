package com.day21;

import java.util.regex.Pattern;

public class UserRegistration {
    public void validateFirstName(String firstName) throws InvalidUserDetailsException {
        if (!Pattern.matches("[A-Z][a-zA-Z]{2,}", firstName)) {
            throw new InvalidUserDetailsException("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) throws InvalidUserDetailsException {
        if (!Pattern.matches("[A-Z][a-zA-Z]{2,}", lastName)) {
            throw new InvalidUserDetailsException("Invalid Last Name");
        }
    }

    public void validateEmail(String email) throws InvalidUserDetailsException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new InvalidUserDetailsException("Invalid Email");
        }
    }

    public void validateMobile(String mobile) throws InvalidUserDetailsException {
        if (!Pattern.matches("^(\\d{2} \\d{10})$", mobile)) {
            throw new InvalidUserDetailsException("Invalid Mobile Number");
        }
    }

    public void validatePassword(String password) throws InvalidUserDetailsException {
        if (!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$", password)) {
            throw new InvalidUserDetailsException("Invalid Password");
        }
    }
}

