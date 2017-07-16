package com.designpatterns.ui.example.structural.flyweight;

import android.graphics.Canvas;
import android.graphics.Paint;

public class DotTypedShape extends BaseTypedShape {

    private final int DOT_SIZE = 3;

    public DotTypedShape(int x, int y, int color, ShapeType type) {
        super(x, y, color, type);
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
        Paint paint = getPaint();
        paint.setColor(color);
        canvas.drawRect(getX(), getY(), getX() + getWidth(), getY() + getHeight(), getPaint());
    }
}
