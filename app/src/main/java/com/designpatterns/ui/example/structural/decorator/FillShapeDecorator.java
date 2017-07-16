package com.designpatterns.ui.example.structural.decorator;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.designpatterns.ui.example.structural.composite.Shape;

public class FillShapeDecorator implements Shape {

    private Shape shape;

    public FillShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public int getX() {
        return shape.getX();
    }

    @Override
    public int getY() {
        return shape.getY();
    }

    @Override
    public int getWidth() {
        return shape.getWidth();
    }

    @Override
    public int getHeight() {
        return shape.getHeight();
    }

    @Override
    public Paint getPaint() {
        return shape.getPaint();
    }

    @Override
    public void paint(Canvas canvas) {
        Paint paint = getPaint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        shape.paint(canvas);
    }
}
