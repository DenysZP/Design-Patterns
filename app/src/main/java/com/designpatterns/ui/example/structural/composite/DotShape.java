package com.designpatterns.ui.example.structural.composite;

import android.graphics.Canvas;

import com.designpatterns.ui.example.behavioral.visitor.Visitor;

public class DotShape extends BaseShape {

    private final int DOT_SIZE = 3;

    public DotShape(int x, int y, int color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Canvas canvas) {

        canvas.drawRect(getX(), getY(), getX() + getWidth(), getY() + getHeight(), getPaint());
    }
}
