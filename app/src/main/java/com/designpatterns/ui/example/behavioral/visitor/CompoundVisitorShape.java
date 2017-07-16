package com.designpatterns.ui.example.behavioral.visitor;

import android.graphics.Canvas;
import android.graphics.Color;

import com.designpatterns.ui.example.structural.composite.BaseShape;
import com.designpatterns.ui.example.structural.composite.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompoundVisitorShape extends BaseVisitorShape {

    protected List<Shape> children = new ArrayList<>();

    public CompoundVisitorShape(Shape... components) {
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

    public int getChildrenSize() {
        return children.size();
    }

    @Override
    protected Object accept(Visitor visitor) {
        return visitor.visitCompoundShape(this);
    }
}
