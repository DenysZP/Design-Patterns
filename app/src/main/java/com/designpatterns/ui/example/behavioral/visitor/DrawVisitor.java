package com.designpatterns.ui.example.behavioral.visitor;

import android.graphics.Color;
import android.graphics.Paint;

import com.designpatterns.ui.example.structural.composite.DrawLayout;

public class DrawVisitor implements Visitor {

    private DrawLayout drawLayout;

    public DrawVisitor(DrawLayout drawLayout) {
        this.drawLayout = drawLayout;
    }

    @Override
    public void visit(BaseVisitorShape... shapes) {
        for (BaseVisitorShape shape : shapes) {
            shape.accept(this);
        }
        drawLayout.addShapes(shapes);
    }

    @Override
    public Object visitDot(DotVisitorShape dot) {
        modifyPaint(dot.getPaint(), Color.RED);
        return dot;
    }

    @Override
    public Object visitCircle(CircleVisitorShape circle) {
        modifyPaint(circle.getPaint(), Color.GREEN);
        return circle;
    }

    @Override
    public Object visitCompoundShape(CompoundVisitorShape compoundShape) {
        modifyPaint(compoundShape.getPaint(), Color.BLUE);
        return compoundShape;
    }

    private void modifyPaint(Paint paint, int color) {
        paint.setColor(color);
        paint.setAntiAlias(true);
    }
}
