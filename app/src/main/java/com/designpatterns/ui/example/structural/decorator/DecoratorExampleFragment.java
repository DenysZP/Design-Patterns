package com.designpatterns.ui.example.structural.decorator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.designpatterns.R;
import com.designpatterns.ui.example.structural.composite.CircleShape;
import com.designpatterns.ui.example.structural.composite.DrawLayout;

public class DecoratorExampleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_draw_example, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DrawLayout drawLayout = (DrawLayout) view;
        CircleShape circleShape1 = new CircleShape(190, 360, 80, Color.BLUE);
        CircleShape circleShape2 = new CircleShape(360, 360, 80, Color.BLUE);
        CircleShape circleShape3 = new CircleShape(530, 360, 80, Color.BLUE);
        drawLayout.addShapes(
                circleShape1,
                new FillShapeDecorator(circleShape2),
                new AntiAliasShapeDecorator(new FillShapeDecorator(circleShape3)));
    }
}
