package com.designpatterns.ui.example.structural.bridge;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

public class GradientEffect implements Effect {

    private int height;

    public GradientEffect(int height) {
        this.height = height;
    }

    @Override
    public void applyEffect(Paint paint) {
        paint.setShader(new LinearGradient(0, 0, 0, height, Color.BLACK, Color.GREEN, Shader.TileMode.MIRROR));
    }
}
