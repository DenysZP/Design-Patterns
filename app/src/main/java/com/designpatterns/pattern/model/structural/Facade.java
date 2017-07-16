package com.designpatterns.pattern.model.structural;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class Facade implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_structural_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.structural_facade_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.structural_facade_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.facade;
    }
}
