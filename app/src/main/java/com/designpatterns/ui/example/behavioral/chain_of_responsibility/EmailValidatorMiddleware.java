package com.designpatterns.ui.example.behavioral.chain_of_responsibility;

import android.util.Patterns;

public class EmailValidatorMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return false;
        } else {
            return checkNext(email, password);
        }
    }
}
