package com.designpatterns.ui.example.structural.bridge;

import android.graphics.Canvas;

import com.designpatterns.ui.example.structural.composite.BaseShape;

public class Rectangle extends BaseShape {

    private int width;
    private int height;
    private Effect effect;

    public Rectangle(int x, int y, int width, int height, int color, Effect effect) {
        super(x, y, color);
        this.width = width;
        this.height = height;
        this.effect = effect;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Canvas canvas) {
        effect.applyEffect(getPaint());
        canvas.drawRect(getX(), getY(), getX() + getWidth(), getY() + getHeight(), getPaint());
    }
}
