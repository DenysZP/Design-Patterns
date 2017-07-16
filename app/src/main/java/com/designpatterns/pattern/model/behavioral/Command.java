package com.designpatterns.pattern.model.behavioral;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class Command implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_behavioral_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.behavioral_command_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.behavioral_command_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.command;
    }
}
