package com.designpatterns.ui.example.behavioral.strategy;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

public abstract class AbstractButton extends AppCompatButton implements View.OnClickListener, View.OnLongClickListener {

    protected ClickBehavior clickBehavior;
    protected LongClickBehavior longClickBehavior;

    public AbstractButton(Context context) {
        super(context);
        init();
    }

    public AbstractButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AbstractButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @CallSuper
    protected void init() {

        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public void setClickBehavior(ClickBehavior clickBehavior) {
        this.clickBehavior = clickBehavior;
    }

    public void setLongClickBehavior(LongClickBehavior longClickBehavior) {
        this.longClickBehavior = longClickBehavior;
    }

    @Override
    public void onClick(View v) {
        clickBehavior.click(this);
    }

    @Override
    public boolean onLongClick(View v) {
        longClickBehavior.longClick(this);
        return true;
    }
}
