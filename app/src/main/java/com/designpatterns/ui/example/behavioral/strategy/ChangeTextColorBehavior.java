package com.designpatterns.ui.example.behavioral.strategy;

import android.graphics.Color;
import android.widget.Button;

import java.util.Random;

public class ChangeTextColorBehavior implements ClickBehavior {

    private Random random;

    public ChangeTextColorBehavior() {
        random = new Random();
    }

    @Override
    public void click(Button button) {
        button.setTextColor(Color.rgb(random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)));
    }
}
