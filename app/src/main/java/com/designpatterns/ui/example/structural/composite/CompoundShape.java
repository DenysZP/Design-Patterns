package com.designpatterns.ui.example.structural.composite;

import android.graphics.Canvas;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompoundShape extends BaseShape {

    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.TRANSPARENT);
        Collections.addAll(children, components);
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void paint(Canvas canvas) {

        for (Shape child : children) {
            child.paint(canvas);
        }
    }
}
