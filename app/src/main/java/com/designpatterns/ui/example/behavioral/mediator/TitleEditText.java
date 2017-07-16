package com.designpatterns.ui.example.behavioral.mediator;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;


public class TitleEditText extends AppCompatEditText implements UiComponent, TextWatcher {

    private Mediator mediator;

    public TitleEditText(Context context) {
        super(context);
    }

    public TitleEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TitleEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return Mediator.TITLE;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (mediator != null) {
            mediator.onTitleTextChanged(s.toString());
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
