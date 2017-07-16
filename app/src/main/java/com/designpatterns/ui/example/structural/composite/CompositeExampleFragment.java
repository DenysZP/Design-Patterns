package com.designpatterns.ui.example.structural.composite;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;

public class CompositeExampleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_draw_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DrawLayout drawLayout = (DrawLayout) view;

        DotShape dotShape = new DotShape(20, 20, Color.RED);
        CircleShape circleShape = new CircleShape(120, 120, 60, Color.GREEN);
        CompoundShape compoundShape = new CompoundShape(
                new DotShape(360, 360, Color.BLUE),
                new CircleShape(360, 360, 80, Color.BLUE)
        );

        drawLayout.addShapes(dotShape, circleShape, compoundShape);
    }
}
