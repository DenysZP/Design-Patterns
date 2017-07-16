package com.designpatterns.ui.example.behavioral.template_method;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;

public class FadeButton extends AnimatedButton {

    public FadeButton(Context context) {
        super(context);
    }

    public FadeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FadeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected ViewPropertyAnimator startAnimation() {
        return animate().alpha(0);
    }

    @Override
    protected ViewPropertyAnimator secondAnimation() {
        return animate().alpha(1);
    }
}
