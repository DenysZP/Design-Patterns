package com.designpatterns.ui.example.structural.composite;

import android.graphics.Paint;

public abstract class BaseShape implements Shape {

    private static final int STROKE_WIDTH = 2;

    private Paint paint;
    private int x;
    private int y;

    public BaseShape(int x, int y, int color) {
        this.x = x;
        this.y = y;
        paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(STROKE_WIDTH);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Paint getPaint() {
        return paint;
    }
}
