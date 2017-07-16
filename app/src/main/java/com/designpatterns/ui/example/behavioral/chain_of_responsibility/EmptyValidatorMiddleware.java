package com.designpatterns.ui.example.behavioral.chain_of_responsibility;

import android.text.TextUtils;

public class EmptyValidatorMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            return false;
        } else {
            return checkNext(email, password);
        }
    }
}
