package com.designpatterns.ui.example.behavioral.strategy;

import android.graphics.Color;
import android.widget.Button;

import java.util.Random;

public class ChangeBackgroundColorBehavior implements LongClickBehavior {

    private Random random;

    public ChangeBackgroundColorBehavior() {
        random = new Random();
    }

    @Override
    public void longClick(Button button) {
        button.setBackgroundColor(Color.rgb(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)));
    }
}
