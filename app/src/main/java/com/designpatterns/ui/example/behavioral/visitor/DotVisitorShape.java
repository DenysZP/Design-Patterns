package com.designpatterns.ui.example.behavioral.visitor;

import android.graphics.Canvas;

import com.designpatterns.ui.example.structural.composite.BaseShape;

public class DotVisitorShape extends BaseVisitorShape {

    private final int DOT_SIZE = 3;

    public DotVisitorShape(int x, int y, int color) {
        super(x, y, color);
    }

    @Override
    protected Object accept(Visitor visitor) {
        return visitor.visitDot(this);
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
