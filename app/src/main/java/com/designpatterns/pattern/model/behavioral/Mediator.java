package com.designpatterns.pattern.model.behavioral;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class Mediator implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_behavioral_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.behavioral_mediator_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.behavioral_mediator_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.mediator;
    }
}
