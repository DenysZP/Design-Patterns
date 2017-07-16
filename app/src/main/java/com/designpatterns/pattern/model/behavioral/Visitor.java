package com.designpatterns.pattern.model.behavioral;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class Visitor implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_behavioral_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.behavioral_visitor_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.behavioral_visitor_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.visitor;
    }
}
