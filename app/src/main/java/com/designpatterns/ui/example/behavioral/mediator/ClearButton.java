package com.designpatterns.ui.example.behavioral.mediator;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

public class ClearButton extends AppCompatButton implements UiComponent, View.OnClickListener {

    private Mediator mediator;

    public ClearButton(Context context) {
        super(context);
    }

    public ClearButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClearButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        setOnClickListener(this);
    }

    @Override
    public String getName() {
        return Mediator.CLEAR;
    }

    @Override
    public void onClick(View v) {
        mediator.clear();
    }
}
