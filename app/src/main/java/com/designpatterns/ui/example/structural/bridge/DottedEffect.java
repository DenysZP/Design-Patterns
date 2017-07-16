package com.designpatterns.ui.example.structural.bridge;

import android.graphics.DashPathEffect;
import android.graphics.Paint;

public class DottedEffect implements Effect {

    @Override
    public void applyEffect(Paint paint) {
        paint.setPathEffect(new DashPathEffect(new float[] {10,10}, 5));
    }
}
