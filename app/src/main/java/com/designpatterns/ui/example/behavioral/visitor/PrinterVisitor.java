package com.designpatterns.ui.example.behavioral.visitor;

import android.widget.TextView;

public class PrinterVisitor implements Visitor {

    private TextView textView;

    public PrinterVisitor(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void visit(BaseVisitorShape... shapes) {
        for (BaseVisitorShape shape : shapes) {
            textView.append("\n");
            textView.append(shape.accept(this).toString());
            textView.append("\n");
        }
    }

    @Override
    public String visitDot(DotVisitorShape dot) {
        return "Dot: x = " + dot.getY() + ", y = " + dot.getY()
                + ", height = " + dot.getHeight() + ", width = " + dot.getWidth()
                + ", color value = " + dot.getPaint().getColor();
    }

    @Override
    public String visitCircle(CircleVisitorShape circle) {
        return "Circle: x = " + circle.getY() + ", y = " + circle.getY()
                + ", height = " + circle.getHeight() + ", width = " + circle.getWidth()
                + ", radius = " + circle.getWidth() / 2 + ", color value = " + circle.getPaint().getColor();
    }

    @Override
    public String visitCompoundShape(CompoundVisitorShape compoundShape) {
        return "Compound Shape: children size = " + compoundShape.getChildrenSize();
    }
}
