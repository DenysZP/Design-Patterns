package com.designpatterns.ui.example.creational.factory_method;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public abstract class ButtonFactory {

    public void attachButton(ViewGroup viewGroup) {

        Context context = viewGroup.getContext();
        Button button = createButton(context);
        button.setText(getButtonText());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                additionalFunctionality();
            }
        });
        viewGroup.addView(button);
    }

    public abstract Button createButton(Context context);

    public abstract String getButtonText();

    public void additionalFunctionality() {
        // No implementation necessary
    }
}
