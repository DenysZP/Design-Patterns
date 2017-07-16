package com.designpatterns.ui.example.behavioral.strategy;

import android.widget.Button;

public class FadeBehavior implements ClickBehavior {

    @Override
    public void click(Button button) {
        button.setAlpha(0);
        button.animate().alpha(1);
    }
}
