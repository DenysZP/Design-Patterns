package com.designpatterns.ui.example.behavioral.mediator;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

public class SaveButton extends AppCompatButton implements UiComponent, View.OnClickListener {

    private Mediator mediator;

    public SaveButton(Context context) {
        super(context);
    }

    public SaveButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SaveButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
        setOnClickListener(this);
    }

    @Override
    public String getName() {
        return Mediator.SAVE;
    }

    @Override
    public void onClick(View v) {
        mediator.save();
    }
}
