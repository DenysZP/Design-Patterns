package com.designpatterns.ui.example.creational.abstract_factory;

import android.content.Context;
import android.widget.Button;

public class DefaultButtonFactory implements ButtonFactory {

    @Override
    public Button createButton(Context context) {
        Button button = new Button(context);
        button.setText("Default Button");
        return button;
    }
}
