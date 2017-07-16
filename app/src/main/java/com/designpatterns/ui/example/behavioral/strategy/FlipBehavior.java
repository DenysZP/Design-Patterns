package com.designpatterns.ui.example.behavioral.strategy;

import android.widget.Button;

public class FlipBehavior implements LongClickBehavior {

    @Override
    public void longClick(Button button) {
        button.animate().rotationYBy(720);
    }
}
