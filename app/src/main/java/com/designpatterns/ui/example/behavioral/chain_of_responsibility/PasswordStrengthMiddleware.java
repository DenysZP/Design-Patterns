package com.designpatterns.ui.example.behavioral.chain_of_responsibility;

public class PasswordStrengthMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {

        int strength = 0;
        if (password.length() >= 8) {
            strength++;
        }
        if (password.matches(".*[0-9]+.*")) {
            strength++;
        }
        if (password.matches(".*[\\p{Ll}]+.*")) {
            strength++;
        }
        if (password.matches(".*[\\p{Lu}]+.*")) {
            strength++;
        }
        if (password.matches(".*[\\W_]+.*")) {
            strength++;
        }

        if (strength != 5) {
            return false;
        } else {
            return checkNext(email, password);
        }
    }
}
