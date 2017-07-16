package com.designpatterns.ui.example.creational.factory_method;

import android.content.Context;
import android.widget.Button;

public class DefaultButtonFactory extends ButtonFactory {

    @Override
    public Button createButton(Context context) {
        return new Button(context);
    }

    @Override
    public String getButtonText() {
        return DefaultButtonFactory.class.getSimpleName();
    }
}
