package com.designpatterns.pattern.model.behavioral;

import com.designpatterns.R;
import com.designpatterns.pattern.factory.Pattern;

import org.parceler.Parcel;

@Parcel
public class TemplateMethod implements Pattern {

    @Override
    public int getCategoryTitleResource() {
        return R.string.category_behavioral_title;
    }

    @Override
    public int getTitleResource() {
        return R.string.behavioral_template_method_title;
    }

    @Override
    public int getDescriptionResource() {
        return R.string.behavioral_template_method_description;
    }

    @Override
    public int getImageResource() {
        return R.drawable.template_method;
    }
}
