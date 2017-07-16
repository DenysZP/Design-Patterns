package com.designpatterns.ui.example.behavioral.strategy;

import android.content.Context;
import android.util.AttributeSet;

public class AnimatedButton extends AbstractButton {

    public AnimatedButton(Context context) {
        super(context);
    }

    public AnimatedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimatedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void init() {
        super.init();
        clickBehavior = new FadeBehavior();
        longClickBehavior = new FlipBehavior();
    }
}
