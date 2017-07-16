package com.designpatterns.ui.example.structural.facade;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

import com.designpatterns.ui.example.structural.composite.CircleShape;
import com.designpatterns.ui.example.structural.composite.DotShape;
import com.designpatterns.ui.example.structural.composite.DrawLayout;
import com.designpatterns.ui.example.structural.composite.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawAbstractionFacade {

    public void drawAbstraction(DrawLayout drawLayout) {

        WindowManager wm = (WindowManager) drawLayout.getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int maxX = size.x;
        int maxY = size.y;

        Random random = new Random();

        List<Shape> dots = new ArrayList<>();
        int dotsSize = random.nextInt(1000);

        for (int i = 0; i < dotsSize; i++) {
            dots.add(new DotShape(random.nextInt(maxX), random.nextInt(maxY),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256))));
        }

        List<Shape> circles = new ArrayList<>();
        int circleSize = random.nextInt(1000);

        for (int i = 0; i < circleSize; i++) {
            circles.add(new CircleShape(random.nextInt(maxX), random.nextInt(maxY), random.nextInt(500),
                    Color.rgb(random.nextInt(256),
                            random.nextInt(256),
                            random.nextInt(256))));
        }

        dots.addAll(circles);

        drawLayout.addShapes(dots.toArray(new Shape[dots.size()]));
    }
}
