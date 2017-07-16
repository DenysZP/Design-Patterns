package com.designpatterns.pattern.factory;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

public interface Pattern {

    @StringRes
    int getCategoryTitleResource();

    @StringRes
    int getTitleResource();

    @StringRes
    int getDescriptionResource();

    @DrawableRes
    int getImageResource();
}
