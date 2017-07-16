package com.designpatterns.ui.example.structural.composite;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.designpatterns.ui.example.behavioral.visitor.Visitor;

public interface Shape {

    int getX();

    int getY();

    int getWidth();

    int getHeight();

    Paint getPaint();

    void paint(Canvas canvas);
}
