package com.designpatterns.ui.example.behavioral.strategy;

import android.content.Context;
import android.util.AttributeSet;

public class ColorButton extends AbstractButton {

    public ColorButton(Context context) {
        super(context);
    }

    public ColorButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColorButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void init() {
        super.init();

        clickBehavior = new ChangeTextColorBehavior();
        longClickBehavior = new ChangeBackgroundColorBehavior();
    }
}
