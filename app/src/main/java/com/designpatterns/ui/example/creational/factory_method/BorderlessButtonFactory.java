package com.designpatterns.ui.example.creational.factory_method;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.Toast;

public class BorderlessButtonFactory extends ButtonFactory {

    private Toast toast;

    @SuppressLint("ShowToast")
    @Override
    public Button createButton(Context context) {

        toast = Toast.makeText(context, "Test", Toast.LENGTH_SHORT);

        Button button = new Button(context);
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, value, true);
        button.setBackgroundResource(value.resourceId);
        return button;
    }

    @Override
    public String getButtonText() {
        return BorderlessButtonFactory.class.getSimpleName();
    }

    @Override
    public void additionalFunctionality() {
        if (toast != null) {
            toast.show();
        }
    }
}
