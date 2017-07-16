package com.designpatterns.ui.example.creational.abstract_factory;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Button;

public class BorderlessButtonFactory implements ButtonFactory {
    @Override
    public Button createButton(Context context) {
        Button button = new Button(context);
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, value, true);
        button.setBackgroundResource(value.resourceId);
        button.setText("Borderless Button");
        return button;
    }
}
