package com.designpatterns.ui.example.behavioral.template_method;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;

public class FlipButton extends AnimatedButton {

    public FlipButton(Context context) {
        super(context);
    }

    public FlipButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FlipButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected ViewPropertyAnimator startAnimation() {
        return animate().rotationX(360);
    }

    @Override
    protected ViewPropertyAnimator secondAnimation() {
        return animate().rotationX(0);
    }
}
