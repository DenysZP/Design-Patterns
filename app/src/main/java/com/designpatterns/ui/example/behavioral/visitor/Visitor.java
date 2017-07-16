package com.designpatterns.ui.example.behavioral.visitor;

public interface Visitor {

    void visit(BaseVisitorShape... shapes);

    Object visitDot(DotVisitorShape dot);

    Object visitCircle(CircleVisitorShape circle);

    Object visitCompoundShape(CompoundVisitorShape cs);
}
