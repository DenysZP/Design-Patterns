package com.designpatterns.ui.example.structural.flyweight;

import android.graphics.Paint;

public class ShapeType {

    private String name;
    private Paint paint;

    public ShapeType(String name) {
        this.name = name;

        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
    }

    public String getName() {
        return name;
    }

    public Paint getPaint() {
        return paint;
    }
}
