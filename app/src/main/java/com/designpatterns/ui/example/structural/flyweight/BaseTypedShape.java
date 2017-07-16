package com.designpatterns.ui.example.structural.flyweight;

import android.graphics.Paint;

import com.designpatterns.ui.example.structural.composite.Shape;

public abstract class BaseTypedShape implements Shape {

    protected int color;
    private int x;
    private int y;
    private ShapeType type;

    public BaseTypedShape(int x, int y, int color, ShapeType type) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = type;
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
        return type.getPaint();
    }
}
