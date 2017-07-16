package com.designpatterns.ui.example.structural.flyweight;

import android.graphics.Canvas;
import android.graphics.Paint;

public class CircleTypedShape extends BaseTypedShape {

    private int radius;

    public CircleTypedShape(int x, int y, int radius, int color, ShapeType type) {
        super(x, y, color, type);
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
        Paint paint = getPaint();
        paint.setColor(color);
        canvas.drawCircle(getX(), getY(), radius, getPaint());
    }
}
