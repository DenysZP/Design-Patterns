package com.designpatterns.ui.example.behavioral.visitor;

import android.graphics.Canvas;

public class CircleVisitorShape extends BaseVisitorShape {

    private int radius;

    public CircleVisitorShape(int x, int y, int radius, int color) {
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

    @Override
    protected Object accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }
}
