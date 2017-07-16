package com.designpatterns.ui.example.structural.bridge;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.composite.DrawLayout;

import butterknife.ButterKnife;

public class BridgeExampleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_draw_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        int width = 300;
        int height = 150;

        DottedEffect dottedEffect = new DottedEffect();
        Rectangle dottedRect = new Rectangle(50, 50, width, height, Color.BLUE, dottedEffect);

        GradientEffect gradientEffect = new GradientEffect(height);
        Rectangle gradientRect = new Rectangle(50, 250, width, height, Color.YELLOW, gradientEffect);

        ((DrawLayout) view).addShapes(dottedRect, gradientRect);
    }

}
