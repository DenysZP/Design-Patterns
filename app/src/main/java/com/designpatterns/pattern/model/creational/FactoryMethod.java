package com.designpatterns.pattern.model.creational;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class FactoryMethod implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_creational_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.creational_factory_method_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.creational_factory_method_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.factory_method;
    }
}
