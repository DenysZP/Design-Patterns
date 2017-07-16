package com.designpatterns.ui.example.behavioral.template_method;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;

public abstract class AnimatedButton extends AppCompatButton {

    public AnimatedButton(Context context) {
        super(context);
    }

    public AnimatedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AnimatedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void showAnimation() {

        startAnimation().setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                secondAnimation();
            }
        });
    }

    protected abstract ViewPropertyAnimator startAnimation();

    protected abstract ViewPropertyAnimator secondAnimation();
}
