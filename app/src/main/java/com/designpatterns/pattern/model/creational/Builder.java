package com.designpatterns.pattern.model.creational;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class Builder implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_creational_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.creational_builder_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.creational_builder_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.builder;
    }
}
