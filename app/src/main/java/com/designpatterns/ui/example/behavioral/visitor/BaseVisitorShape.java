package com.designpatterns.ui.example.behavioral.visitor;

import com.designpatterns.ui.example.structural.composite.BaseShape;

public abstract class BaseVisitorShape extends BaseShape {

    public BaseVisitorShape(int x, int y, int color) {
        super(x, y, color);
    }

    protected abstract Object accept(Visitor visitor);
}
