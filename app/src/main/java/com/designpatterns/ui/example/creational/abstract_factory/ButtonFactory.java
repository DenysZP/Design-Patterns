package com.designpatterns.ui.example.creational.abstract_factory;

import android.content.Context;
import android.widget.Button;

public interface ButtonFactory {

    Button createButton(Context context);
}
