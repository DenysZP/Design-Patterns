package com.designpatterns.ui.example.structural.composite;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawLayout extends FrameLayout {

    private List<Shape> shapeList;

    public DrawLayout(@NonNull Context context) {
        super(context);
        init();
    }

    public DrawLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        shapeList = new ArrayList<>();
    }

    public void addShapes(Shape... shapes) {

        shapeList.clear();
        Collections.addAll(shapeList, shapes);
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (shapeList.size() > 0) {
            for (Shape shape : shapeList) {
                shape.paint(canvas);
            }
        }
    }
}
