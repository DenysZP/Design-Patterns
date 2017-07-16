package com.designpatterns.ui.example.structural.composite;

import android.graphics.Canvas;

import com.designpatterns.ui.example.behavioral.visitor.Visitor;

public class CircleShape extends BaseShape {

    private int radius;

    public CircleShape(int x, int y, int radius, int color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Canvas canvas) {

        canvas.drawCircle(getX(), getY(), radius, getPaint());
    }
}
